import java.util.Scanner;

public class PlayerHuman extends Player {

    private Scanner scanner = new Scanner(System.in);

    public PlayerHuman() {}

    public PlayerHuman(String name) {
        super(name);
    }

    @Override
    public int guess() {
        System.out.println("Wpisz liczbę (1-6): ");
        return scanner.nextInt();
    }
}
