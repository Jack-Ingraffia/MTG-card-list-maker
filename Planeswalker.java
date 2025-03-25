public class Planeswalker extends Card {
    private int loyalty;
    private String type;
    private boolean isLegendary;

    public Planeswalker(String name, int ManaValue, String color, String text, int loyalty, String type, boolean isLegendary) {
        super(name, ManaValue, color, text);
        this.loyalty = loyalty;
        this.type = type;
        this.isLegendary = isLegendary;
    }

    // Getter and Setter for loyalty
    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter for isLegendary
    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean isLegendary) {
        this.isLegendary = isLegendary;
    }

    @Override
    public String toString() {
        return super.getName() + " is a " + loyalty + " loyalty " + super.getColor() + " planeswalker " + type + " with a mana value of " + super.getManaValue() + ". This card says, " + super.getText();
    }
}
