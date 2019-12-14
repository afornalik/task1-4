import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardDeck {

    public static void main(String[] args) {
        List<Card> cardList = new ArrayList<>();
        for (Color color : Color.values()) {
            for (Type type : Type.values()) {
                cardList.add(new Card(color, type));
            }
        }
        System.out.print("Number of players :");
        int numberOfPlayers = new Scanner(System.in).nextInt();
        Collections.shuffle(cardList);
        printPlayersHands(cardList, numberOfPlayers);
    }

    private static void printPlayersHands(List<Card> cardList, int numberOfPlayers) {
        for (int i = 0; i < cardList.size(); i++) {
            if (i == 0) {
                for (int j = 1; j <= numberOfPlayers; j++) {
                    System.out.printf("%9s%2s", "player", j);
                    System.out.print("     ");
                }
                System.out.println("\n");
            }
            for (int j = 0; j < numberOfPlayers; j++) {
                if (i + j < cardList.size())
                    System.out.print(cardList.get(i + j).showCard());
            }
            System.out.println();
            i += (numberOfPlayers - 1);
        }
    }

    private static class Card {

        private final Color color;
        private final Type type;

        private Card(Color color, Type type) {
            this.color = color;
            this.type = type;
        }

        private String showCard() {
            return String.format("|%4s%10s|", color.mark, type);
        }
    }

    private enum Color {
        CLUBS("\u2663"),
        DIAMONDS("\u2666"),
        HEARTS("\u2665"),
        SPADES("\u2660");

        private String mark;

        Color(String mark) {
            this.mark = mark;
        }

    }

    private enum Type {
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }
}



