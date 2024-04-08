/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author gabriel
 */
public class Destinataire extends Client {
    private static String addresse;

    public Destinataire() {
        this.addresse = "gabriel.nomo@facsciences-uy1.cm";
    }

    public String getAdresse() {
        return addresse;
    }

    public void setAdresse(String recipient) {
        this.addresse = recipient;
    }
    
    
}
