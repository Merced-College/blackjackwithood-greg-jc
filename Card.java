//Jesus Coria - Richard Manzo
import java.util.ArrayList;
import java.util.HashMap;
public class Card {

    //data variables
    //fields from file = heart, ace, 11, ah.gif
    private String suit;
    private int value;
    private String rank;
    private String picName;
    //put other 3 data variables here as private

    //constructor
    public Card() {
        suit = "heart"; //default value
        value = 10;
        rank = "ace";
        picName = "ah.gif";
    }

    public Card(String suit, String rank, int value, String picName) {
        this.suit = suit;
        this.value = value;
        this.rank = rank;
        this.picName = picName;
    }

    //**setters and getters**//
    //setters
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setPicName(String picName){
        this.picName = picName;
    }

    //getters
    public String getSuit () {
        return suit;
    }

    public String getRank () {
        return rank;
    }

    public int getValue () {
        return value;
    }

    public String getPicName () {
        return picName;
    }

    
    public boolean equals(Card other) {
        return rank.equals(other.rank);
    }

    //string method
    public String toString() {
        return "Suit: " + suit + ", Rank: " + rank + ", Value: " + value + ", Image: " + picName;
    }
    
}