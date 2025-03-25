public class Land extends Card {
    public Land(String name, String color, String text) {
        super(name, -1, text, color);
    }
    @Override
    public String toString() {
        return super.getName() + " is a " + super.getColor() + " Land. This card says, " + super.getText();
    }

}
