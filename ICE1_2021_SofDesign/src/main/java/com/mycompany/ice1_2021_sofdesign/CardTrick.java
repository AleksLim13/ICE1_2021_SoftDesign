/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ice1_2021_sofdesign;

import java.util.ArrayList;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    private TurnManager cards;
    private int value;
    private int possible;
    private int intTemp;

    public int getValue() {
        return value;
    }

    public int getPossible() {
        return possible;
    }

    public TurnManager getCard() {
        return cards;
    }

    public int getIntTemp() {
        return intTemp;
    }

    public void setCards(TurnManager newCards) {
        this.cards = newCards;
    }

    public static void main(String[] args) {

        CardTrick newTrick = new CardTrick();
        newTrick.setCards(new TurnManager());
        newTrick.getCard().setDependencies(
                new String(),
                newTrick.getValue(),
                new ArrayList<>(),
                newTrick.getPossible(),
                newTrick.getIntTemp(),
                new String(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        
        
        newTrick.getCard().setDeckHolder(newTrick.getCard().initializeDeck());
        newTrick.getCard().setSuitsHolder(newTrick.getCard().initializeSuits());
        newTrick.getCard().shuffle();
        newTrick.getCard().printHand(newTrick.getCard().getShuffledDeck());
        newTrick.getCard().setHand(newTrick.getCard().createHand(7));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        newTrick.getCard().printHand(newTrick.getCard().getHand());

    }

}
