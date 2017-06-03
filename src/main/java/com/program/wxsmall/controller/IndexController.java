package com.program.wxsmall.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.program.wxsmall.BaseController;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController {
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public @ResponseBody String login(HttpServletRequest request, HttpServletResponse response) {
		JSONObject object = new JSONObject();
		object.put("name", "张阳阳");
		object.put("age", 12);
		object.put("sex", "男");
		return object.toJSONString();
	}
	
}
