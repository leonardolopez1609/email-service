package com.nelumbo.simulationemail.services;

import org.springframework.stereotype.Service;

import com.nelumbo.simulationemail.entities.EmailContentDTO;
import com.nelumbo.simulationemail.entities.TextResponseDTO;


@Service
public class EmailContentServiceImp implements IEmailContentService {


	@Override
	public TextResponseDTO sendEmail(EmailContentDTO emailContent) {
		 emailContent.imp(emailContent.getPlate(),emailContent.getMessage());
			return new TextResponseDTO("Correo Enviado");
	}

}
