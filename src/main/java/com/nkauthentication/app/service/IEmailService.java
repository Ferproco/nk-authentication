package com.nkauthentication.app.service;

import java.io.FileNotFoundException;
import javax.mail.MessagingException;


public interface IEmailService {

	void sendSimpleEmail(final String toAddress, final String subject, final String message);
    void sendEmailWithAttachment(final String toAddress, final String subject, final String message, final String attachment) throws MessagingException, FileNotFoundException;
}

