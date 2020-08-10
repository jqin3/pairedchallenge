import java.util.ArrayList;
import java.util.List;
public class War {
    private List<Player> playerList;
    private List<Card> cards;
    private Deck d;
    private int size;

    public War(int size) {
        this.size = size;
        d = new Deck(size);
    }

    public void initialize() {
        d.initialize();
        cards = d.getCards();
        playerList = d.getPlayers();
        while (cards.size() != 0) {
            for (int i = 0; i < playerList.size(); i++) {
                Player p = playerList.get(i);
                p.insertCard(cards.remove(0));
            }
        }
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Deck getD() {
        return d;
    }

    public void setD(Deck d) {
        this.d = d;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
    public List<Card> getCardList() {
        return cards;
    }

}
