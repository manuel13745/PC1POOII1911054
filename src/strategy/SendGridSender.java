/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Manuel Felipe
 */
public class SendGridSender implements MailSender {
    @Override
    public void sendMail(String recipient, String subject, String body) {
        System.out.println("Enviando correo con SendGrid a " + recipient);
    }
}
