package com.newer.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

	@Autowired
	AppService appService;
}
