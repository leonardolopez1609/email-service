package com.nelumbo.simulationemail.services;

import com.nelumbo.simulationemail.entities.EmailContent;

public interface IEmailContentService {

	String sendEmail(EmailContent emailContent);
}
