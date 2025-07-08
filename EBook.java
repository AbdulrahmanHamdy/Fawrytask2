/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author pc
 */
public class EBook extends Book {
     private String fileType;

  

    public EBook(String fileType, String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }

    @Override
    public double buy(int quantity, String email, String address) {
            
         MailService.send(this, quantity, email);
        return price * quantity;
    }

    public String getTitle() {
        return title;
    }
     
}
