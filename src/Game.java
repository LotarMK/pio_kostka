import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {

    private Statistics statistics;
    private Random rand = new Random();
    private List<Player> players = new ArrayList<>(); //lista graczy

    public Game() {
        this(null);
    }

    public Game(Statistics statistics) {
        if (statistics != null)
            this.statistics = statistics;
        else
            this.statistics = new NullStatistics();
    }

    //dodawanie graczy a jeżeli imie się powtarza to dodanie cyfry do imienia
    public void addPlayer(Player player) {
        if (!nameExists(player.getName())) { //czy imie już występuje
            players.add(player);
        } else {
            player.setName(player.getName() + rand.nextInt(10));
            addPlayer(player);
        }
    }

    //sprawdzenie czy imie już występuje
    private boolean nameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void play() {
        int number;
        int guess;
        boolean repeat;

        do {
            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            repeat = true;

            for (Player player : players) {
                guess = player.guess(); //klasa player zgaduje
                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("nie Git");
                } else {
                    System.out.println("Git");
                    statistics.winner(player);
                    repeat = false;
                }
            }
            System.out.println("---------------------");
        } while (repeat);

    }

    public void printPlayer() {
        System.out.println("---------");
//        for(Player player : players) {
//            System.out.print(player.getName() + " ");
//        }

        players.forEach ( player -> {
            System.out.println(player.getName());
        } );

    }

    public void removePlayer(String name) {
//        for (int i = 0; i < players.size(); i++) {
//            Player player = players.get(i);
//            if(player.getName().equals(name)) {
//                players.remove(player);
//                break;
//            }
//        }

        players.removeIf(player -> player.getName().equals(name));

    }

    public void printStats() {
        statistics.print();
    }

}