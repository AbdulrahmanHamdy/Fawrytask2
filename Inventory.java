/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author pc
 */
public class Inventory {
    private Map<String,Book>books=new HashMap<>();
    
    public void addbook(Book book)
    {
        books.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Book added - " + book.getTitle());
    }
     
    public Book removebook(String isbn)
    {
    return books.remove(isbn);
    }
    
    public void listBooks() {
        System.out.println("Quantum book store: Current Inventory:");
        for (Book b : books.values()) {
            System.out.println(" - " + b.getTitle() + " (" + b.getIsbn() + ")");
        }
    }
    public double buyBook(String isbn,int quantity,String email,String address)
    {
        Book book =books.get(isbn);
        if(book==null)throw new IllegalArgumentException("Quantum book store: Book not found with ISBN: " + isbn);
        double total =book.buy(quantity, email, address);
         System.out.println("Quantum book store: Purchase successful. Total: " + total);
        return total;
    }
    
    public List<Book> removeOutdatedBooks(int maxAge, int currentYear) {
    
        List<Book> removed=new ArrayList<>();
        Iterator<Map.Entry<String, Book>> iterator = books.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            
            if (currentYear - entry.getValue().getYear() > maxAge) {
                removed.add(entry.getValue());
                iterator.remove();
                System.out.println("Quantum book store: Removed outdated book - " + entry.getValue().getTitle());
            }
        }
        return removed;
    }
}
