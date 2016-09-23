package com.boco.eoms.tree.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boco.eoms.jdbc.JdbcUtil;

@Controller
@RequestMapping("/treeController")
public class TreeController {
	@Resource
	private JdbcUtil jdbcutil;
	/**
	 * 部门和用户树
	 * @param request
	 * @return
	 */
	@RequestMapping(value = { "deptTree" }, method = RequestMethod.GET)
	@ResponseBody
	public Response deptTree(HttpServletRequest request) {
		List<Map<String, Object>> returnList=new ArrayList<Map<String,Object>>();
		//判断是否传入节点id，如果为null 默认为1
		String id = request.getParameter("id")!=null?request.getParameter("id"):"-1";
		List<Map<String, Object>> deptList=nextLevelDepts(id);//查询部门
		for(int i=0;i<deptList.size();i++){
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("id", (String)deptList.get(i).get("DEPTID"));//部门id
			map.put("label", (String)deptList.get(i).get("DEPTNAME"));//部门名称
			map.put("nodetype", "dept");//节点类型
			map.put("icon", "dept");//节点图标
			
			List<Map<String, Object>> flaguser =getUserByDepts((String)deptList.get(i).get("DEPTID"));//判断部门下是否有人员
			List<Map<String, Object>> flagdept =getUserByDepts((String)deptList.get(i).get("DEPTID"));//判断部门下是否有部门
			
			if(flagdept==null||flagdept.size()<=0){
				if(flaguser==null||flaguser.size()<=0){
					map.put("leaf", "1");//1说明没有子节点
				}
			}else{
				map.put("leaf", "0");//0说明有子节点
			}
			
			returnList.add(map);
		}
		
		List<Map<String, Object>> userList=getUserByDepts(id);//查询部门下人员
		for(int j=0;j<userList.size();j++){
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("id", userList.get(j).get("USERID"));//人员id
			map.put("label", userList.get(j).get("USERNAME"));//人员名称
			map.put("nodetype", "user");
			map.put("icon", "user");
			map.put("leaf", "1");
			map.put("mobile", userList.get(j).get("MOBILE"));
			returnList.add(map);
		}
		System.out.println(deptList);
		System.out.println(userList);
		
		return Response.ok().entity(returnList).build();
	}
	/**
	 * 根据部门id查询下级部门
	 * @param parentDeptid
	 * @return
	 */
	public List<Map<String, Object>> nextLevelDepts(String parentDeptid){
		String deptsql="select tawsystemd0_.id, "+
			       "tawsystemd0_.deleted, "+
			       "tawsystemd0_.deptemail, "+
			       "tawsystemd0_.deptfax, "+
			       "tawsystemd0_.deptId, "+
			       "tawsystemd0_.deptmanager, "+
			       "tawsystemd0_.deptmobile, "+
			       "tawsystemd0_.deptName, "+
			       "tawsystemd0_.deptphone, "+
			       "tawsystemd0_.deptType, "+
			       "tawsystemd0_.operremoteip, "+
			       "tawsystemd0_.opertime, "+
			       "tawsystemd0_.operuserid, "+
			       "tawsystemd0_.ordercode, "+
			       "tawsystemd0_.parentDeptid, "+
			       "tawsystemd0_.regionflag, "+
			       "tawsystemd0_.remark, "+
			       "tawsystemd0_.tmporarybegintime, "+
			       "tawsystemd0_.tmporaryManager, "+
			       "tawsystemd0_.tmporarystopTime, "+
			       "tawsystemd0_.updatetime, "+
			       "tawsystemd0_.leaf, "+
			       "tawsystemd0_.areaid, "+
			       "tawsystemd0_.linkid, "+
			       "tawsystemd0_.parentLinkid, "+
			       "tawsystemd0_.tmpdeptid, "+
			       "tawsystemd0_.isPartners, "+
			       "tawsystemd0_.isDaiweiRoot "+
			  "from taw_system_dept tawsystemd0_ "+
			 "where tawsystemd0_.parentDeptid = '"+parentDeptid+"' "+
			   "and tawsystemd0_.deleted = '0' "+
			 "order by tawsystemd0_.linkid";
		
		List<Map<String, Object>> deptList=jdbcutil.queryList(deptsql);
		
		return deptList;
	}
	/**
	 * 根据部门id查询 部门下用户
	 * @param deptid
	 * @return
	 */
	public List<Map<String, Object>> getUserByDepts(String deptid){
		String usersql="select tawsystemu0_.id, "+
			       "tawsystemu0_.cptroomid, "+
			       "tawsystemu0_.cptroomname, "+
			       "tawsystemu0_.deptid, "+
			       "tawsystemu0_.deptname, "+
			       "tawsystemu0_.email, "+
			       "tawsystemu0_.isPartners, "+
			       "tawsystemu0_.familyaddress, "+
			       "tawsystemu0_.fax, "+
			       "tawsystemu0_.mobile, "+
			       "tawsystemu0_.operuserid, "+
			       "tawsystemu0_.phone, "+
			       "tawsystemu0_.remark, "+
			       "tawsystemu0_.sex, "+
			       "tawsystemu0_.userdegree, "+
			       "tawsystemu0_.userid, "+
			       "tawsystemu0_.username, "+
			       "tawsystemu0_.operremotip, "+
			       "tawsystemu0_.savetime, "+
			       "tawsystemu0_.updatetime, "+
			       "tawsystemu0_.account_enabled, "+
			       "tawsystemu0_.account_expired, "+
			       "tawsystemu0_.account_locked, "+
			       "tawsystemu0_.credentials_expired, "+
			       "tawsystemu0_.password, "+
			       "tawsystemu0_.deleted, "+
			       "tawsystemu0_.isfullemploy, "+
			       "tawsystemu0_.isrest, "+
			       "tawsystemu0_.portalrolename, "+
			       "tawsystemu0_.userstatus, "+
			       "tawsystemu0_.fail_count "+
			  "from taw_system_user tawsystemu0_ "+
			 "where tawsystemu0_.deptid = '"+deptid+"' "+
			  " and tawsystemu0_.userid <> 'admin' "+
			  " and tawsystemu0_.deleted = '0' "+
			 "order by tawsystemu0_.username";
		List<Map<String, Object>> userList=jdbcutil.queryList(usersql);
		
		return userList;
	}
	@RequestMapping(value = { "roleTree" }, method = RequestMethod.GET)
	@ResponseBody
	public Response roleTree() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("label", "bb");
		map.put("value", "22");
		list.add(map);
		return Response.ok().entity(list).build();
	}
}
