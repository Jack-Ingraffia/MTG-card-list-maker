public class Instant extends Card {
    private String useCase;

    public Instant(String name, int ManaValue, String color, String text, String useCase) {
        super(name, ManaValue, color, text);
        this.useCase = useCase;
    }

    public String getUseCase() {
        return useCase;
    }

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    @Override
    public String toString() {
        return super.getName() + " is a " + super.getColor() + " instant " + useCase + " spell, with a mana value of " + super.getManaValue() + ". This card says, " + super.getText();
    }
}
