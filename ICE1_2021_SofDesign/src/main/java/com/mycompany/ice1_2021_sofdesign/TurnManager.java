/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ice1_2021_sofdesign;

import java.util.ArrayList;


/**
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack -11, Queen =12, King = 13) A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. This code is to be used in ICE1.
 * When you create your own branch, add your name as a modifier.
 *
 * @author dancye
 */
public class TurnManager {

    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13
    private ArrayList<Card> hand;
    private int possible;
    private int intTemp;
    private String strTemp;
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
            13, 13, 13, 13};
    
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

   
    public void setDependencies(
             String suit,
             int value,
             ArrayList<Card> hand,
             int possible,
             int intTemp,
             String strTemp,
             ArrayList<Integer> shuffledDeck, 
             ArrayList<Integer> deckHolder, 
             ArrayList<String> shuffledSuits,
             ArrayList<String> suitsHolder,
             ArrayList<String> suits,
             ArrayList<Integer> deck){
    
    this.suit = suit;
    this.value = value; 
    this.hand = hand;
    this.possible = possible;
    this.intTemp = intTemp;
    this.strTemp = strTemp;
    this.shuffledDeck = shuffledDeck; 
    this.deckHolder = deckHolder; 
    this.shuffledSuits = shuffledSuits;
    this.suitsHolder = suitsHolder;
    this.suits = suits;
    this.deck = deck; 
    }
    
    
    public int[] getDECK(){
    return DECK;
    }
    public String getSuit() {
        return suit;
    }

    public ArrayList<Integer> getDeck() {
        return deck;
    }
    
    public void setDeck(ArrayList<Integer> newDeck){
     this.deck = newDeck;
    }
    public ArrayList<Card> getHand(){
        return hand; 
    }
    
    public ArrayList<Integer> getShuffledDeck(){
    return shuffledDeck; 
    }
    
    public ArrayList<Integer> getDeckHolder(){
        return deckHolder; 
    }
    
    public ArrayList<String> getSuits(){
    return suits;
    }
    
    public String[] getSUITS(){
    return SUITS;
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
    
    public void setShuffledDeck(ArrayList<Integer> newShuffDeck){
     this.shuffledDeck = newShuffDeck;  
    }
    
    public void setHand(ArrayList<Card> newHand){
        this.hand = newHand; 
    }

    public int getPossible() {
        return possible;
    }

    public int getIntTemp() {
        return intTemp;
    }

    public void setIntTemp(int newIntTemp) {
        this.intTemp = newIntTemp;
    }
    public String getStringTemp() {
        return strTemp;
    }

    public void setStringTemp(String newStringTemp) {
        this.strTemp = newStringTemp;
    }

    public void setPossible(int newPossible) {
        this.possible = newPossible;
    }

    //Swaps pairs at rando position for
    //shuffled deck and suits
    public void shuffle() {
        
        //A: Create It
       ArrayList<Integer> tDeck = this.getDeckHolder();
       ArrayList<String> tSuits = this.getSuitsHolder();
       
       int rando;
       for(int i = 0; i < 52-1; i++){
       rando = (int) (Math.random() * 51) + 1;
       
       //C: 
        for(int j = 0; j < 1; j++){
            
            //C.1: 
            this.setIntTemp(tDeck.get(i));
            tDeck.set(i, tDeck.get(rando));
            tDeck.set(rando, this.getIntTemp());
            
            //C.2: 
            this.setStringTemp(tSuits.get(i));
            tSuits.set(i, tSuits.get(rando));
            tSuits.set(rando, this.getStringTemp());
            
        }//End C
        
       }//End B
    
        //D: Remember It
        this.setShuffledDeck(tDeck);
        this.setShuffledSuits(tSuits);
        
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

    public ArrayList<Card> createHand(int size, ArrayList<Card> tDeck){
        ArrayList<Card> cHand = new ArrayList<>();
    for(int i = 0; i < size; i++){
        
        cHand.add(this.startDeal(tDeck));
    }
    return cHand;
    }
    
    //Deal first card and simultaneously remove it from deck
    //Like in real life...
    public Card startDeal(ArrayList<Card> tDeck){
        
      Card card; 
    //A: 
    card = tDeck.get(0);
    
    //B: 
    tDeck.remove(0);
   
    //C: 
    return card; 
    }
    
    
    public void printHand(ArrayList<Card> hand){
     for(int i = 0; i < hand.size(); i++){
         System.out.println(hand.get(i).getValue() + " " + hand.get(i).getSuit());
     }
    }
    
    public void isItHere(ArrayList<Card> hand, int uValue, String uSuit){
     for(int i = 0; i < hand.size(); i++){
         if(hand.get(i).getValue() == uValue && hand.get(i).getSuit().equals(uSuit)){
             System.out.println("It's in here at position " + i);
         }   
     }
    }
    
    public ArrayList<Integer> initializeDeck(){
    ArrayList<Integer> initDeck = new ArrayList<>();
    int[] deck = getDECK();
    for(int i = 0; i < 52; i++){
        initDeck.add(deck[i]);
    }
    return initDeck;
    }
    
    
    public ArrayList<String> initializeSuits(){
    ArrayList<String> initSuits = new ArrayList<>();
    String[] suits = getSUITS();
    for(int i = 0; i < 52; i++){
        initSuits.add(suits[i]);
    }
    return initSuits;
    }

}//End class 
