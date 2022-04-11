/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325lab8;

/**
 *
 * @author nicka
 */
public class PartyOutfit implements MakeOutfit{

    @Override//again, overriding all three methods in order to create objects of type party 
    public Shorts createShirts() {
        return new PartyShirt();
        
        
     }

    @Override
    public Pants createPants() {
        
        return new PartyPant();
       }

    @Override
    public Shoes createShoes() {
        return new PartyShoe();
   }
    
}
