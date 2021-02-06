/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ice1_2021_sofdesign;

/**
 *
 * @author aleks
 */
public class Card {
    
    private String suit;
    private int value;
    private final String[] SUITS = {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};
    
    public Card(){
    
    }
    
    public Card(String suit, int value){
     this.suit = suit;
     this.value = value; 
    }
    
    public String getSuit(){
    return suit; 
    }
    
    
    public int getValue(){
        return value;
    }
    
    public void setSuit(String newSuit){
        this.suit = newSuit;
    }
    
    public void setValue(int newValue){
        this.value = newValue;
    }
    
    public String[] getSUITS(){
        return SUITS;
    }
    
}//End class
