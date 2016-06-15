package com.boco.eoms.menu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.boco.eoms.commons.utils.LoginUser;
import com.boco.eoms.jdbc.JdbcUtil;
import com.boco.eoms.tawSystemUser.module.TawSystemUser;

/**
 * 首页菜单
 * 
 * @author tanjianchao
 *
 */
@Controller
@RequestMapping("/menuController")
public class MenuController {
	@Resource
	private JdbcUtil jdbcutil;

	/**
	 * 首页菜单
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = { "menu" }, method = RequestMethod.GET)
	@ResponseBody
	public Response menu(HttpServletRequest request) {
		TawSystemUser user=LoginUser.getUser(request);
		List<String> deptList=queryDept(user.getDeptid());
		deptList.add(user.getDeptid());//查询当前用户的部门的父部门的父部门的......直到为-1，截止
		String deptStr="";//拼接部门id的sql
		for(int i=0;i<deptList.size();i++){
			if(i==deptList.size()-1){
				deptStr+="'"+deptList.get(i)+"'";
			}else{
				deptStr+="'"+deptList.get(i)+"',";
			}
		}
		List<String> roleList=queryRoleId(user.getUserid());//查询当前用户所属角色列表
		String roleStr="";//拼接角色id的sql
		for(int j=0;j<roleList.size();j++){
			if(j==roleList.size()-1){
				roleStr+="tawsystemp2_.objectid ='"+roleList.get(j)+"' ";
			}else{
				roleStr+="tawsystemp2_.objectid ='"+roleList.get(j)+"' or ";
			}
			
		}
		
		String sql="select distinct tawsystemp0_.id ,"+
                  "tawsystemp0_.code ,"+
                  "tawsystemp0_.hided ,"+
                  "tawsystemp0_.isApp ,"+
                  "tawsystemp0_.name ,"+
                  "tawsystemp0_.parentcode ,"+
                  "tawsystemp0_.remark ,"+
                  "tawsystemp0_.url ,"+
                  "tawsystemp0_.orderby ,"+
                  "tawsystemp0_.deleted ,"+
                  "tawsystemp0_.loginType ,"+
                  "tawsystemp1_.isleaf "+
                  "from taw_system_priv_operation tawsystemp0_,taw_system_priv_menuitem  tawsystemp1_ "+
                  "where tawsystemp0_.code = tawsystemp1_.code "+
                  "and (tawsystemp1_.menuid in "+
                	         "(select distinct tawsystemp2_.privid from taw_system_priv_assign tawsystemp2_,taw_system_priv_menu tawsystemp3_ "+
                	        		 "where (tawsystemp2_.objectid = '"+user.getUserid()+"' and tawsystemp2_.assigntype = '2' or "+
                	                  "(tawsystemp2_.objectid in ("+deptStr+")) and tawsystemp2_.assigntype = '1' or "+
                	                  "("+roleStr+") and tawsystemp2_.assigntype = '3') "+
                	              "and tawsystemp2_.privid = tawsystemp3_.privid "+
                	              "and (tawsystemp3_.nature is null or tawsystemp3_.nature = '1'))) "+
	             "and tawsystemp0_.parentcode = '-1' "+
	             "and (tawsystemp0_.isApp = '1' or tawsystemp0_.isApp = '0') "+
	             "and tawsystemp0_.hided <> '1' "+
	             "and tawsystemp0_.deleted <> '1' "+
	             "and (tawsystemp0_.loginType is null or tawsystemp0_.loginType = '0') "+
	             "order by tawsystemp0_.orderby";
		
		List<Map<String, Object>> menuList=jdbcutil.queryList(sql);
		
		
		
		return Response.ok().entity(menuList).build();
	}
	/**
	 * 查询当前部门的父部门的父部门的......直到为-1，截止
	 * @param deptId 部门id
	 * @return
	 */
	public List<String> queryDept(String deptId){
		List<String> returnList=new ArrayList<String>();
		String sql="select PARENTDEPTID from TAW_SYSTEM_DEPT where DEPTID='"+deptId+"'";
		List<Map<String, Object>> list=jdbcutil.queryList(sql);
		if(list.size()!=0){
			String parentdeptid=(String)list.get(0).get("PARENTDEPTID");
			if(!parentdeptid.equals("-1")){
				returnList.add(parentdeptid);
				returnList.addAll(queryDept(parentdeptid));
				return returnList;
			}else{
				return returnList;
			}
			
		}else{
			return returnList;
		}
	}
	/**
	 * 根据用户userid查询用户所属角色id
	 * @param userid
	 * @return
	 */
	public List<String> queryRoleId(String userid){
		List<String> returnList=new ArrayList<String>();
		String sql="select distinct subRoleid from taw_system_userrefrole where userid ='"+userid+"'";
		List<Map<String, Object>> list=jdbcutil.queryList(sql);
		if(list.size()!=0){
			for(int i=0;i<list.size();i++){
				returnList.add((String)list.get(i).get("subRoleid"));
			}
		}
		return returnList;
	}
	
	/**
	 * 根据parentcode 查询子菜单
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = { "menuByCode" }, method = RequestMethod.GET)
	@ResponseBody
	public Response menuByCode(HttpServletRequest request) {
		String parentcode=request.getParameter("parentcode");
		TawSystemUser user=LoginUser.getUser(request);
		List<String> deptList=queryDept(user.getDeptid());
		deptList.add(user.getDeptid());//查询当前用户的部门的父部门的父部门的......直到为-1，截止
		String deptStr="";//拼接部门id的sql
		for(int i=0;i<deptList.size();i++){
			if(i==deptList.size()-1){
				deptStr+="'"+deptList.get(i)+"'";
			}else{
				deptStr+="'"+deptList.get(i)+"',";
			}
		}
		List<String> roleList=queryRoleId(user.getUserid());//查询当前用户所属角色列表
		String roleStr="";//拼接角色id的sql
		for(int j=0;j<roleList.size();j++){
			if(j==roleList.size()-1){
				roleStr+="tawsystemp2_.objectid ='"+roleList.get(j)+"' ";
			}else{
				roleStr+="tawsystemp2_.objectid ='"+roleList.get(j)+"' or ";
			}
			
		}
		List<Map<String, Object>> list=menuTree(user.getUserid(),deptStr,roleStr,parentcode);
		
		return Response.ok().entity(list).build();
	}
	
	public List<Map<String, Object>> menuTree(String userid,String deptStr,String roleStr,String parentcode){
		String sql="select distinct tawsystemp0_.id ,"+
                "tawsystemp0_.code ,"+
                "tawsystemp0_.hided ,"+
                "tawsystemp0_.isApp ,"+
                "tawsystemp0_.name ,"+
                "tawsystemp0_.parentcode ,"+
                "tawsystemp0_.remark ,"+
                "tawsystemp0_.url ,"+
                "tawsystemp0_.orderby ,"+
                "tawsystemp0_.deleted ,"+
                "tawsystemp0_.loginType ,"+
                "tawsystemp1_.isleaf "+
                "from taw_system_priv_operation tawsystemp0_,taw_system_priv_menuitem  tawsystemp1_ "+
                "where tawsystemp0_.code = tawsystemp1_.code "+
                "and (tawsystemp1_.menuid in "+
              	         "(select distinct tawsystemp2_.privid from taw_system_priv_assign tawsystemp2_,taw_system_priv_menu tawsystemp3_ "+
              	        		 "where (tawsystemp2_.objectid = '"+userid+"' and tawsystemp2_.assigntype = '2' or "+
              	                  "(tawsystemp2_.objectid in ("+deptStr+")) and tawsystemp2_.assigntype = '1' or "+
              	                  "("+roleStr+") and tawsystemp2_.assigntype = '3') "+
              	              "and tawsystemp2_.privid = tawsystemp3_.privid "+
              	              "and (tawsystemp3_.nature is null or tawsystemp3_.nature = '1'))) "+
	             "and tawsystemp0_.parentcode = '"+parentcode+"' "+
	             "and (tawsystemp0_.isApp = '1' or tawsystemp0_.isApp = '0') "+
	             "and tawsystemp0_.hided <> '1' "+
	             "and tawsystemp0_.deleted <> '1' "+
	             "and (tawsystemp0_.loginType is null or tawsystemp0_.loginType = '0') "+
	             "order by tawsystemp0_.orderby";
		
		List<Map<String, Object>> menuList=jdbcutil.queryList(sql);
		
		if(menuList.size()>0){
			for(int i=0;i<menuList.size();i++){
				Map<String, Object> map=menuList.get(i);
				map.put("label", map.get("NAME"));
				String parentcode_new=(String) map.get("CODE");
				if(parentcode_new!=null&&!"".equals(parentcode_new)){
					map.put("children", menuTree(userid,deptStr,roleStr,parentcode_new));
				}
			}	
		}
		
		return menuList;
	}
}
