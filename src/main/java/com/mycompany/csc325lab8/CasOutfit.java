/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325lab8;

/**
 *
 * @author nicka
 */
public class CasOutfit implements MakeOutfit{

    @Override//override all methods from each class, top, shoe and pant
    public Shorts createShirts() {
        
        return new CasTops();
        
        
      }

    @Override
    public Pants createPants() {
        return new CasPants();
       }

    @Override
    public Shoes createShoes() {
        return new CasShoes();
        
        }
    
    
    
    
    
}
