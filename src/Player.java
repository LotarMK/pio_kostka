import java.util.Random;
public class Player {
    private Random brain = new Random();

    public Player() {}

    //konstruktor żeby ustawić imie podczas tworzenia nowego obiektu
    public Player(String name) {
        setName(name);
    }

    private String name = "Anonymous"; //domyślne imie

    public String getName() {
        return name;
    }

/*
    - co najmniej 3 znaki
    - A-Z(ASCII 65-90), a-z(ASCII 97-122)
    - 0-9
    - _-.
    REGEX101.COM
    ^[A-Za-z0-9,.\-_]{3,}$
*/

    //sprawdzenie poprawności imienia
    public void setName(String name) {
        if(name != null && name.matches("^[A-Za-z0-9,.\\-_]{3,}$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException();
//            System.err.println("Nieprawidłowe imie");
        }
    }

    //metoda odgadująca liczbę z kostki
    public int guess() {
        return brain.nextInt(6) + 1;
    }
}