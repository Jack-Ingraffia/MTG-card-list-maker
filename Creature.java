public class Creature extends Card {
    //new instance variables (power, toughness, type, isLegendary)
    private int power;
    private int toughness;
    private String type;
    private boolean isLegendary;

    public Creature(String name, int ManaValue, String color, String text, int power, int toughness, String type, boolean isLegendary) {
        super(name, ManaValue, color, text);
        this.power = power;
        this.toughness = toughness;
        this.type = type;
        this.isLegendary = isLegendary;
    }

    // Getter and Setter for power
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // Getter and Setter for toughness
    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
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
        return super.getName() + " is a " + power + "/" + toughness + " " + super.getColor() + " " + type + " with a mana value of " + super.getManaValue() + ". This card says, " + super.getText();
    }


}
