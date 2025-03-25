public class Enchantment extends Card {
    private boolean isEquipment;

    public Enchantment(String name, int ManaValue, String color, String text, boolean isEquipment) {
        super(name, ManaValue, color, text);
        this.isEquipment = isEquipment;
    }

    public boolean isEquipment() {
        return isEquipment;
    }

    public void setEquipment(boolean isEquipment) {
        this.isEquipment = isEquipment;
    }

    @Override
    public String toString() {
        if (isEquipment) {
            return super.getName() + " is a " + super.getColor() + " equipable enchantment card with a mana value of " + super.getManaValue() + ". This card says, " + super.getText();
        }
        return super.getName() + " is a " + super.getColor() + " enchantment card with a mana value of " + super.getManaValue() + ". This card says, " + super.getText();
    }
}
