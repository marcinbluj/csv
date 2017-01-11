package com.company;

import org.apache.commons.mail.*;

public class MailSender {
    public static void sendMail(String address, String title, String content) throws EmailException {
        MultiPartEmail email = new MultiPartEmail();
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("C:/Users/RENT/Desktop/spam.jpg");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Picture of Spam");
        attachment.setName("Spam");
        email.attach(attachment);
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication("javandwro1@gmail.com", "javand1wro");
        email.setSSL(true);
        email.setFrom("javandwro1@gmail.com");
        email.setSubject(title);
        email.setMsg(content);
        email.addTo(address);
        email.send();

//
    }

}
