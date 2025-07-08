/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author pc
 */
public class PaperBook extends Book {

         private int stock;

    public PaperBook(int stock, String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if(stock<quantity)
               throw new IllegalArgumentException("Quantum book store: Not enough stock for ISBN: " + isbn);

        stock-=quantity;
      ShippingService.send(this, quantity, address);
       return price * quantity;
         }

    public int getStock() {
        return stock;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

     
}
