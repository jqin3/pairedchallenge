import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) {
        int size = 2;
        War war = new War(size);
        war.initialize();
        List<Card> cards = war.getCardList();
        List<Player> players = war.getPlayerList();
        for (int i = 0; i < players.size(); i++) {
            Player p = players.get(i);
            System.out.println(p.getId());
            Hand h = p.getHand();
            List<Card> cardInHand = h.getHand();
            for (int j = 0; j < cardInHand.size(); j++) {
                Card c = cardInHand.get(i);
                System.out.println("card:");
                System.out.println(c.getVal());
            }
        }

    }
}
