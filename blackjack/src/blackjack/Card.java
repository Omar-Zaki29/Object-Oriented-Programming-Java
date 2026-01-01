package blackjack;

public class Card {
    private CardColor color;
    private CardValue value;

    public void setValue(CardValue value) {
        this.value = value;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    public CardColor getColor() {
        return color;
    }

    public CardValue getValue() {
        return value;
    }

    public Card(CardColor color, CardValue value) {
        this.color = color;
        this.value = value;
    }
}
