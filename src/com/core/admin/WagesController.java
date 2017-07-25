package com.core.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.service.WagesService;

@Controller
@RequestMapping("/wages")
public class WagesController {
	@Resource
	private WagesService wagesService;
	
	
}

















