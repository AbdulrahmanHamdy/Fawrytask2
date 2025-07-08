/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author pc
 */
public class ShippingService {
    public static void send(PaperBook book,int quantity,String address)
    {
         System.out.println("Quantum book store: Shipping " + quantity + "x " + book.getTitle() + " to " + address);

    }
}
