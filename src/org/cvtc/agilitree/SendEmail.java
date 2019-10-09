package org.cvtc.agilitree;


import java.util.Properties;  

import javax.mail.*;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  
  
public class SendEmail {  
	
    public static void main(String[] args) {
        String from = "carlsemailmanagement@gmail.com";
        String password = "ContactCarl";
        String to = "gtheisen@student.cvtc.edu"; // list of recipient email addresses
        String subject = "Java send mail example";
        String body = "Welcome to JavaMail!";

       
        send(from, password, to, subject, body);
    }
	
//	public static void dataInput(String from, String password, String to, String subject,String body) {
//
//		send(from, password, to, subject, body);
//	}
	public static void send(String from, String password, String to, String subject,String body){  
	
		
		String host = "smtp.gmail.com";
		
			Properties properties = System.getProperties();
			
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.auth", true);
			
			properties.put("mail.smtp.socketFactory.port", "465");  
			properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
			properties.put("mail.smtp.socketFactory.fallback", "false");  
			
			properties.put("mail.smtp.user", from);
			properties.put("mail.smtp.password", password);
			
			
			Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			});
			
			MimeMessage message = new MimeMessage(session);
			
			try {
				message.setFrom(new InternetAddress(from));
				InternetAddress address = new InternetAddress(to);
				
				message.setSubject(subject);
				message.setText(body);
				message.setRecipient(Message.RecipientType.TO, address);
				
				Transport transport = session.getTransport("smtp");
				
				transport.connect(host, from, password);
				
				Transport.send(message);
				transport.close();
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}
} 
