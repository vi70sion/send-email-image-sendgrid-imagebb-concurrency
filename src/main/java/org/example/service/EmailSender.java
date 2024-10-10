package org.example.service;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import static org.example.utility.Constants.*;
import java.io.IOException;

public class EmailSender {

     public EmailSender() { }

    public void sendEmail(String to, String content) throws IOException {
        Email from = new Email("levaldas@hotmail.com");
        Email recipient = new Email(to);
        String subject = "Email Subject";
        Content mailContent = new Content("text/plain", content);
        Mail mail = new Mail(from, subject, recipient, mailContent);

        SendGrid sg = new SendGrid(SENDGRIDAPIKEY);
        Request request = new Request();

        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            sg.api(request);
        } catch (IOException ex) {
            throw ex;
        }
    }

}
