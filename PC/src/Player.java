import java.util.ArrayList;
import java.util.List;
public class Player {
    private Hand hand;
    private Card curCard;
    private int id;

    public Player(int id) {
        this.id = id;
        hand = new Hand();
    }

    public void insertCard(Card card) {
        hand.insertCard(card);
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Card getCurCard() {
        return curCard;
    }

    public void setCurCard(Card curCard) {
        this.curCard = curCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}