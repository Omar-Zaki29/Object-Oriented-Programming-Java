package blackjack;

public class Main {
    public static void main(String[] args) {
        Card C1 = new Card(CardColor.HEARTS, CardValue.FIVE);
        Card C2 = new Card(CardColor.CLUBS, CardValue.EIGHT);

        System.out.println(C1.getColor() + " " + C1.getValue());
        System.out.println(C2.getColor() + " " + C2.getValue());

    }
}
