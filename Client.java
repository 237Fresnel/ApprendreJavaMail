/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
// Le client est celui qui envoie le mail

/**
 *
 * @author gabriel
 */
public class Client {
        private static String email;
        private static String password;
        private static String message;
        
        public Client(){
            this.email = "kengnefresnel@gmail.com";//"adressedetestgabriel@gmail.com";
            this.password = "Fresnou12"; //"codeur507";
            this.message = "ceci est un message envoye avec javamail";
        }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
