import java.util.Random;

public class PioGame {
    public static void main(String[] args) {

        //polimorfizm
        Player player = new PlayerHuman();

        try {
            player.setName("Michal");
        }
        catch (IllegalArgumentException ex) {
            System.err.println("Błąd " + ex.getMessage());
        }
        catch (Exception ex) {
            System.err.println("Błąd");
        }

        Random rand = new Random(); //obiekt losujący
        int number; //wylosowana liczba
        int guess; //strzał gracza

        number = rand.nextInt(6)+1;

        do {
            System.out.println("Kostka: " + number);

            guess = player.guess(); //odgadywanie przez obiekt klasy Player
            System.out.println("Gracz:\n" + player.getName() + ": " + guess);

            if(guess != number) {
                System.out.print("Żle\n");
            }

        } while(number != guess);

        System.out.println("Dobrze!");
    }
}