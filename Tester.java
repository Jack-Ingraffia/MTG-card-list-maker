import java.util.Scanner;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Card> cards = new ArrayList<>();

        while(true) {
            System.out.println("Do you want to add cards? (y/n) ");
            while(in.hasNextLine()) {


                String line = in.nextLine();
                if (line.equals("n")) {
                    break;
                }

                System.out.println("What is the card's name? ");
                String name = in.nextLine();

                System.out.println("What is the card's mana value? ");
                int mana = in.nextInt();

                System.out.println("What is the card's color? ");
                String color = in.nextLine();

                System.out.println("What is the card's text? ");
                String text = in.nextLine();

                System.out.println("What is the card type? ");
                line = in.nextLine();

                if (line.toLowerCase().equals("instant")) {
                    System.out.println("What is the card's use case? ");
                    String useCase = in.nextLine();
                    Card temp = new Instant(name, mana, color, text, useCase);
                    cards.add(temp);
                } 
                
                else if (line.toLowerCase().equals("sorcery")) {
                    System.out.println("What is the card's use case? ");
                    String use = in.nextLine();
                    Card temp = new Sorcery(name, mana, color, text, use);
                    cards.add(temp);
                } 
                
                else if (line.toLowerCase().equals("enchantment")) {
                    System.out.println("Is the enchantment an equipment? (true/false) ");
                    boolean equip = in.nextBoolean();
                    Card temp = new Enchantment(name, mana, color, text, equip);
                    cards.add(temp);
                } 
                
                else if (line.toLowerCase().equals("land")) {
                    Card temp = new Land(name, color, text);
                    cards.add(temp);
                } 
                
                else if (line.toLowerCase().equals("planeswalker")) {
                    System.out.println("What is the loyalty? ");
                    int loyal = in.nextInt();
                    System.out.println("What is the planeswalker's type? ");
                    String typeP = in.nextLine();
                    System.out.println("Is it legendary? (true/false) ");
                    boolean boolP = in.nextBoolean();
                    Card temp = new Planeswalker(name, mana, color, text, loyal, typeP, boolP);
                    cards.add(temp);
                } 
                
                else if (line.toLowerCase().equals("creature")) {
                    System.out.println("What is the power? ");
                    int power = in.nextInt();
                    System.out.println("What is the toughness? ");
                    int toughness = in.nextInt();
                    System.out.println("What is the creature type? ");
                    String typeC = in.nextLine();
                    System.out.println("Is it legendary? (true/false) ");
                    boolean boolC = in.nextBoolean();
                    Card temp = new Creature(name, mana, color, text, power, toughness, typeC, boolC);
                    cards.add(temp);
                }

                System.out.println("Do you want to add more cards? (y/n) ");
                line = in.nextLine();
                if (line.equals("n")) {
                    break;
                }

            }
            break;
        }

        System.out.println();
        System.out.println("\033[1mHeres all the cards: \033[0m");
        System.out.println();

        int count = 1;
        for (Card a : cards) {
            System.out.println(count + ". " + a);
            count++;
        }

    }
}
