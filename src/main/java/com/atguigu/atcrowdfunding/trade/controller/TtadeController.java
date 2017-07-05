package com.atguigu.atcrowdfunding.trade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trade")
public class TtadeController {

	@RequestMapping("/pay-step-1")
	public String pay1(){
		
		return "trade/pay-step-1";
	}
	
	@RequestMapping("/pay-step-2")
	public String pay2(){
		
		return "trade/pay-step-2";
	}
}
