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
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack -11, Queen =12, King = 13) A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. This code is to be used in ICE1.
 * When you create your own branch, add your name as a modifier.
 *
 * @author dancye
 */
public class Card {

    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13
    private List<Integer> hand;
    private int possible;
    private int temp;
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private List<Integer> shuffledDeck; 
    private List<Integer> deckHolder; 

    //Standard deck contains values from 1-13 * 4. 
    //This needs to be shuffled before used
    private final List<Integer> deck = Arrays.asList(
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
    
    private final List<String> suits = Arrays.asList(
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts",
            "clubs", "spades", "diamonds", "hearts");

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    public List<Integer> getDeck() {
        return deck;
    }
    
    public List<Integer> getHand(){
        return hand; 
    }
    
    public List<Integer> getShuffDeck(){
    return shuffledDeck; 
    }
    
    public List<Integer> getDeckHolder(){
        return deckHolder; 
    }
    
    public void setDeckHolder(List<Integer> newDeckHolder){
    this.deckHolder = newDeckHolder; 
    }
    
    public void setShuffDeck(List<Integer> newShuffDeck){
     this.shuffledDeck = newShuffDeck;  
    }
    
    public void setHand(List<Integer> newHand){
        this.hand = newHand; 
    }

    public int getPossible() {
        return possible;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int newTemp) {
        this.temp = newTemp;
    }

    public void setPossible(int newPossible) {
        this.possible = newPossible;
    }

    //Takes deck hoolder as param and returns shuffled deck
    public List<Integer> shuffleDeck(List<Integer> tDeck) {
        
        //A: Create It
        this.setPossible((int) (Math.random() * 52) + 1);
        //B: Iterate It
        for (int i = 0; i < 52; i++) {
        //C: Set It 
            this.setTemp(tDeck.get(i));
            tDeck.set(i, tDeck.get(possible));
        }//End for 
        
        //D:  
        return tDeck; 

    }//End 

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

    public List<Integer> createHand(int size){
        List<Integer> cHand = new ArrayList<>();
    for(int i = 0; i < size; i++){
        
        cHand = startDeal();
    }
    return cHand;
    }
    
    //Deal first card and simultaneously remove it from deck
    //Like in real life...
    public List<Integer> startDeal(){
      
    //A: 
    List<Integer> tHand = new ArrayList<>();
    List<Integer> tDeck = this.getShuffDeck(); 
    
    //B: 
    tHand.add(tDeck.get(0));
    tDeck.remove(0);
    
    //C: 
    this.setShuffDeck(tDeck);
    
    //D: 
    return tHand; 
    }
    
    
    public void printHand(List<Integer> hand){
     for(int i = 0; i < hand.size(); i++){
         System.out.println(hand.get(i));
     }
    }

}//End class 
