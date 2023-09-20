/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;

/**
 *
 * @author Manuel Felipe
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MailSender mailSender = new InHouseMailSender(); 
        mailSender.sendMail("cliente@usil.pe", "Asunto del correo", "Cuerpo del correo");
    }
}
//hola:)
    

