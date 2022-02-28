import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));


        for(Card cards : d){
            System.out.println(cards + ", ");
        }

    }

    public static int addCards(ArrayList<Card> hand){
 /* TODO 
This should compute the sum of values of the cards in an ArrayList of cards.*/
        int sum = 0;
        for (Card cards:hand){
            if(cards.getValue().equals("Ace"))
                sum++;
            else if(cards.getValue().equals("Jack"))
                sum += 11;
            else if(cards.getValue().equals("Queen"))
                sum += 12;
            else if(cards.getValue().equals("King"))
                sum += 13;
            else
                sum += Integer.valueOf(cards.getValue().toString());
        }
        return sum;
    }

}