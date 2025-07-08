/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author pc
 */
public class QuantumBookstore {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Book pBook=new PaperBook(111,"P153", "Alice in wonderland", 2018, 100.0, "peter parker" );
        Book eBook = new EBook( "PDF","E456", "pizza hot", 2022, 50.0, "papa Jones");
        Book demoBook = new ShowcaseBook("D789", "Exclusive", 2020, 0.0, "Charlie chaplin");

         inventory.addbook(pBook);
        inventory.addbook(eBook);
        inventory.addbook(demoBook);
        
         inventory.listBooks();
          try {
            inventory.buyBook("P123", 2, "buyer@example.com", "123 Cairo Street");
            inventory.buyBook("E456", 1, "reader@example.com", null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        try {
            inventory.buyBook("D789", 1, "demo@example.com", "Address");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
             inventory.removeOutdatedBooks(5, 2025);
    }
}
