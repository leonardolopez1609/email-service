package com.nelumbo.simulationemail.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelumbo.simulationemail.entities.EmailContent;
import com.nelumbo.simulationemail.services.IEmailContentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emails")

public class EmailContentController {

	@Autowired
	IEmailContentService emailContentService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String sendEmail(@Valid @RequestBody EmailContent emailContent) {
		
		return emailContentService.sendEmail(emailContent);

		
	}
}
