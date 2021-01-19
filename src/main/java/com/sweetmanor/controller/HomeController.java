package com.sweetmanor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 项目主页
 */
@Controller
public class HomeController {

	@GetMapping({ "/", "/index", "/home" })
	public String index() {
		return "index";
	}

}
