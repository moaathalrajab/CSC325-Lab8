/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325lab8;

/**
 *
 * @author nicka
 */
public class ProOutfit implements MakeOutfit{

    @Override//again, overridding all three methods to create an object of type professional, for the pro cloths 
    public Shorts createShirts() {
        return new ProShirt();
     }

    @Override
    public Pants createPants() {
        return new ProPants();
      }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoe();
     }
    
    
    
    
    
}
