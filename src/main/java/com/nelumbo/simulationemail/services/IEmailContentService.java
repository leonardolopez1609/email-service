package com.nelumbo.simulationemail.services;

import com.nelumbo.simulationemail.entities.EmailContentDTO;
import com.nelumbo.simulationemail.entities.TextResponseDTO;

public interface IEmailContentService {

	TextResponseDTO sendEmail(EmailContentDTO emailContent);
}
