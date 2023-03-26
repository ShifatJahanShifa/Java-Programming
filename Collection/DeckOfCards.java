import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private List<Card>list;
    public DeckOfCards()
    {
        Card[] cards=new Card[52];
        int count=0;

        for(Card.Suit cardSuit:Card.Suit.values())
        {
            for (Card.Face cardFace:Card.Face.values())
            {
                cards[count]=new Card(cardFace,cardSuit);
                count++;
            }
        }

        list= Arrays.asList(cards);
        Collections.shuffle(list);
    }

    public void printCards()
    {
        for(int i=0;i< 52;i++)
        {
            System.out.printf("%-20s%s",list.get(i),(i+1)%2==0 ? "\n":"\t");   // formatted to left-justification
        }
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards=new DeckOfCards();
        deckOfCards.printCards();
    }
}
