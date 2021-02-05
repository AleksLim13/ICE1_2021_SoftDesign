/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ice1_2021_sofdesign; 

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    private Card cards;
    
    public Card getCard(){
    return cards;
    }
    
    public void setCards(Card newCards){
        this.cards = newCards; 
    }
    
    public static void main(String[] args)
    {
        
        CardTrick newTrick = new CardTrick();
        newTrick.setCards(new Card());
        
       
        
    }

    
}
