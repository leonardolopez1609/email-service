package com.nelumbo.simulationemail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelumbo.simulationemail.entities.EmailContent;
import com.nelumbo.simulationemail.services.IEmailContentService;

@RestController
@RequestMapping
public class EmailContentController {

	@Autowired
	IEmailContentService emailContentService;
	
	//IMPLEMENTAR METODO QUE ENVIE EL EMAIL   
	
	@PostMapping()
	public String sendEmail(@RequestBody EmailContent emailContent) {
		
		//retornar un JSON
		
		return emailContentService.sendEmail(emailContent);
		
	}
}
