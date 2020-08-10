import java.util.ArrayList;
import java.util.List;
public class Deck {
    private List<Card> cards;
    private List<Player> players;
    private int size;
    public Deck(int size) {
        this.size = size;
        cards = new ArrayList<>();
        players = new ArrayList<>();
    }
    public void initialize() {
        initializePlayer();
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                Card c = new Card(i);
                cards.add(c);
//                System.out.println(cards.get(cards.size() - 1).getVal());
            }
        }
    }

    public void initializePlayer() {
        for (int i = 0; i < size; i++) {
            players.add(new Player(i));
        }
    }
    public List<Card> getCards() {
        return cards;
    }
    public List<Player> getPlayers() {
        return players;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}