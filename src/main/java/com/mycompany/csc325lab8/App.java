/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325lab8;

/**
 *
 * @author nicka
 */
public class App {

    private Pants pants;//make an object of type pant
    private Shorts Shirts;//make an object of type shirt
    private Shoes shoes;//make an object of type shoe

    public App(MakeOutfit o) {//default constructor 
        pants = o.createPants();//create all three objecxt
        Shirts = o.createShirts();
        shoes = o.createShoes();
    }

    public void Show() {//method to show the type of shirt, pant and shoe
        Shirts.getShirts();//shows shirts
        pants.getPants();//shows pants
        shoes.getShoes();//shows shoes 
    }

}
