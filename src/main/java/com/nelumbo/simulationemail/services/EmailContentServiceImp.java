package com.nelumbo.simulationemail.services;

import org.springframework.stereotype.Service;

import com.nelumbo.simulationemail.entities.EmailContent;


@Service
public class EmailContentServiceImp implements IEmailContentService {

	@Override
	public String sendEmail(EmailContent emailContent) {
	
		return "Correo Enviado";
	}

}
