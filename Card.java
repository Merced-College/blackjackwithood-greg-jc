//Jesus Coria - Richard Manzo
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
    }

    public Card(String suit, String rank, int value, String picName) {
        this.suit = suit;
        this.value = value;
        this.rank = rank;
        this.picName = picName;
    }

    //setters and getters
    //setters (4)
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

    //getters (4)
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

    
    public boolean eqals(Card other) {
        return rank.equals(other.rank);
    }

    //string method (4)
    public String toString() {
        return "suit " + suit + " value" + value + " rank" + rank;
    }
}