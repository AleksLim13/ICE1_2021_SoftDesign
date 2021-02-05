/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ice1_2021_sofdesign; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13
   private ArrayList<Integer> hand; 

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   
   //Standard deck contains values from 1-13 * 4. 
   //This needs to be shuffled before used
   private  List<Integer> deck = Arrays.asList(
                                         1, 1, 1, 1, 
                                         2, 2, 2, 2, 
                                         3, 3, 3, 3, 
                                         4, 4, 4, 4, 
                                         5, 5, 5, 5, 
                                         6, 6, 6, 6, 
                                         7, 7, 7, 7, 
                                         8, 8, 8, 8, 
                                         9, 9, 9, 9, 
                                         10, 10, 10, 10, 
                                         11, 11, 11, 11, 
                                         12, 12, 12, 12, 
                                         13, 13, 13, 13);
   
 
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }
    public List<Integer> getDeck(){
    return deck; 
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    public ArrayList<Integer> createHand(){
        
    return hand; 
    }
   
   
    
}
