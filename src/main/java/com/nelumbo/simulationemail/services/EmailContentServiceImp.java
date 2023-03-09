package com.nelumbo.simulationemail.services;

import org.springframework.stereotype.Service;

import com.nelumbo.simulationemail.entities.EmailContentDTO;


@Service
public class EmailContentServiceImp implements IEmailContentService {

	@Override
	public String sendEmail(EmailContentDTO emailContent) {
	    emailContent.imp(emailContent.getPlate(),emailContent.getMessage());
		return "Correo Enviado";
	}

}
