package com.capg.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

	@GetMapping("/notices")
	public String getNotices() {
		return "Here are the Notices details from the DB";
		}	
	}