package com.boco.eoms.fileUpload.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/FileUploadController")
public class FileUploadController {
	//通过Spring的autowired注解获取spring默认配置的request
		@Autowired
		private HttpServletRequest request;
		@RequestMapping(value = { "filesUpload" }, method = RequestMethod.POST)
		@ResponseBody
		public Response filesUpload(@RequestParam("file") MultipartFile[] files) {
			//判断file数组不能为空并且长度大于0
			if(files!=null&&files.length>0){
				//循环获取file数组中得文件
				for(int i = 0;i<files.length;i++){
					MultipartFile file = files[i];
					//保存文件
					saveFile(file);
				}
			}
			return Response.ok().build();
		}

		/***
		 * 保存文件
		 * @param file
		 * @return
		 */
		private boolean saveFile(MultipartFile file) {
			// 判断文件是否为空
			if (!file.isEmpty()) {
				try {
					// 文件保存路径
//					String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
//							+ file.getOriginalFilename();
					
					String filePath = "/Users/tanjianchao/"+ file.getOriginalFilename();
					// 转存文件
					file.transferTo(new File(filePath));
					return true;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return false;
		}
}
