package com.nelumbo.simulationemail.services;

import com.nelumbo.simulationemail.entities.EmailContentDTO;

public interface IEmailContentService {

	String sendEmail(EmailContentDTO emailContent);
}
