public class Card {
    private String name;
    private int ManaValue;
    private String color;
    private String text;

    public Card(String name, int ManaValue, String color, String text) {
        this.name = name;
        this.ManaValue = ManaValue;
        this.color = color;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManaValue() {
        return ManaValue;
    }

    public void setManaValue(int ManaValue) {
        this.ManaValue = ManaValue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return name + " is a " + color + " card with a mana value of " + ManaValue + ". this card says, " + text;
    }

}
