/* Bean.java
/*******************************/
/* Name: Connor Farrenden
/* Course: SENG2050 - Assignment 2
/* Student Number: c3374676 
*/

package pkg;
import java.util.*;
import java.io.*;

public class Bean implements Serializable{
    // List for storing numbers revealed in the game
    private ArrayList<Integer> numRevealed;
    // Set minimum and maximum range for secret number
    int min = 1;
    int max = 11;
    // Set secret number
    private int secretNum = (int)Math.floor(Math.random()*(max-min+1)+min);
    // Other main variables
    private int roundNum = 1;
    private int smallestNum;
    private int bankOffer; 
    private int monetaryPrize = secretNum * 100;

    public Bean() {
        this.numRevealed = new ArrayList<>();
    }
    
    public int getSecretNum()
    {
        return this.secretNum;
    }

    public List<Integer> getNumRevealed()
    {
        return this.numRevealed;
    }

    public int getRoundNum()
    {
        return this.roundNum;
    }

    public int getSmallestNum()
    {
        return this.smallestNum;
    }

    public int getBankOffer()
    {
        this.bankOffer = smallestNum * 100;
        return this.bankOffer;
    }

    public int getMonetaryPrize()
    {
        return this.monetaryPrize;
    }

    public void setBankOffer(int bankOffer)
    {
        this.secretNum = secretNum;
    }

    public void setSecretNum(int secretNum)
    {
        this.secretNum = secretNum;
    }

    public void setNumRevealed(ArrayList<Integer> numRevealed)
    {
        this.numRevealed = numRevealed;
    }

    public void setRoundNum(int roundNum)
    {
        this.roundNum = roundNum;
    }

    public void setSmallestNum(int smallestNum)
    {
        this.smallestNum = smallestNum;
    }
}