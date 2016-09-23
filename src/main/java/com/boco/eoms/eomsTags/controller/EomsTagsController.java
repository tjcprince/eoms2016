package com.boco.eoms.eomsTags.controller;

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
@RequestMapping("/EomsTagsController")
public class EomsTagsController {
	
	@Resource
	private JdbcUtil jdbcutil;

	/**
	 * 查询字典值
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = { "queryDict" }, method = RequestMethod.GET)
	@ResponseBody
	public Response queryDict(HttpServletRequest request) {
		String dictid=request.getParameter("dictid");
		String sql="SELECT t . ID,t .DICTID,t .DICTCODE,t .DICTNAME,t .DICTREMARK,t .PARENTDICTID,t .SYSTYPE,t .LEAF FROM TAW_SYSTEM_DICTTYPE t WHERE t .PARENTDICTID = '"+dictid+"'";
		
		List<Map<String, Object>> dictList=jdbcutil.queryList(sql);
		
		return Response.ok().entity(dictList).build();
	} 
}
