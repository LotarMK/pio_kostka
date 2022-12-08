import java.util.HashMap;
import java.util.Map;

public class Statistics {

    private Map<String, Integer> stats = new HashMap<>();

    public void print() {
        System.out.println("Tabela Wyników");

        stats.forEach( (name, score) -> {
            System.out.println(name + ": " + score);
        });
    }

    public void winner(Player player) {
        Integer score = stats.getOrDefault(player.getName(), 0);
            score++;
            stats.put(player.getName(), score);
     }

    public void clear() {
        stats.clear();
    }

}
