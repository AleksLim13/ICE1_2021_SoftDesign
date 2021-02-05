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
    private ArrayList<Integer> hand;
    private int possible;
    private int temp;
    private ArrayList<Integer> shuffledDeck; 
    private ArrayList<Integer> deckHolder; 
    private ArrayList<String> shuffledSuits;
    private ArrayList<String> suitsHolder;
    private ArrayList<String> suits;
    private ArrayList<Integer> deck; 

    //Standard deck contains values from 1-13 * 4. 
    //This needs to be shuffled before used
    
    private final int[] DECK = {
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
            13, 13, 13, 1};
    
    //Shuffle both of these the same way with same numbers
    //Then the same slots in both will equal each other
    //Update both at same time to keep in sync. 
    private final String[] SUITS = {
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
            "clubs", "spades", "diamonds", "hearts"};

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    public ArrayList<Integer> getDeck() {
        return deck;
    }
    
    public ArrayList<Integer> getHand(){
        return hand; 
    }
    
    public ArrayList<Integer> getShuffDeck(){
    return shuffledDeck; 
    }
    
    public ArrayList<Integer> getDeckHolder(){
        return deckHolder; 
    }
    
    public ArrayList<String> getSuits(){
    return suits;
    }
    
    public ArrayList<String> getSuitsHolder(){
        return suitsHolder; 
    
    }
    
    public ArrayList<String> getShuffledSuits(){
        return shuffledSuits;
    }
    
    public void setShuffledSuits(ArrayList<String> newShuffledSuits){
        this.shuffledSuits = newShuffledSuits; 
    }
    
    public void setSuitsHolder(ArrayList<String> newSuitsHolder){
    this.suitsHolder = newSuitsHolder; 
    }
    
    public void setDeckHolder(ArrayList<Integer> newDeckHolder){
    this.deckHolder = newDeckHolder; 
    }
    
    public void setShuffDeck(ArrayList<Integer> newShuffDeck){
     this.shuffledDeck = newShuffDeck;  
    }
    
    public void setHand(ArrayList<Integer> newHand){
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
    public ArrayList<Integer> shuffleDeck(ArrayList<Integer> tDeck) {
        
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

    public ArrayList<Integer> createHand(int size){
        ArrayList<Integer> cHand = new ArrayList<>();
    for(int i = 0; i < size; i++){
        
        cHand = startDeal();
    }
    return cHand;
    }
    
    //Deal first card and simultaneously remove it from deck
    //Like in real life...
    public ArrayList<Integer> startDeal(){
      
    //A: 
    ArrayList<Integer> tHand = new ArrayList<>();
    ArrayList<Integer> tDeck = this.getShuffDeck(); 
    
    //B: 
    tHand.add(tDeck.get(0));
    tDeck.remove(0);
    
    //C: 
    this.setShuffDeck(tDeck);
    
    //D: 
    return tHand; 
    }
    
    
    public void printHand(ArrayList<Integer> hand){
     for(int i = 0; i < hand.size(); i++){
         System.out.println(hand.get(i));
     }
    }

}//End class 
