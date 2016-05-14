// Brendan Eckardt
// CSE2 lab04
//2.19.2016

// Random card generator program 

public class CardGenerator{
    public static void main(String[] args){
        int randomNumber = (int) ((Math.random()*52)+1); //generates random integer from 1 to 52
        
        String cardSuit = ""; //assigns card suit
        String cardIdentity = ""; //assigns card identity
        
        if (randomNumber<=13){ //if statement to assign the card a suit based on number generated
            cardSuit="diamonds";
        }
        else if (randomNumber>=14 && randomNumber<=26){  
            cardSuit="clubs";
        }
        else if (randomNumber>=27 && randomNumber<=39){
            cardSuit="hearts";
        }
        else if (randomNumber>=40 && randomNumber<=52){
            cardSuit="spades";
        }
        
        int cardRank=randomNumber%13; //converts the random number generated from 1-52 scale to 1-13 scale 
        
        switch (cardRank){ //switch statement to give rank of card from Ace to King based on number generated
            case 1:
                cardIdentity="the Ace"; 
                break;
            case 2:
                cardIdentity="the 2";
                break;
            case 3:
                cardIdentity="the 3";
                break;
            case 4:
                cardIdentity="the 4";
                break;
            case 5:
                cardIdentity="the 5";
                break;
            case 6:
                cardIdentity="the 6";
                break;
            case 7:
                cardIdentity="the 7";
                break;
            case 8:
                cardIdentity="the 8";
                break;
            case 9:
                cardIdentity="the 9";
                break;
            case 10:
                cardIdentity="the 10";
                break;
            case 11:
                cardIdentity="the Jack";
                break;
            case 12:
                cardIdentity="the Queen";
                break;
            case 13:
                cardIdentity="the King";
                break;
        }
        
        System.out.println("The card you have selected is "+cardIdentity+" of "+ cardSuit); //prints the identity of the card generated
    }
}