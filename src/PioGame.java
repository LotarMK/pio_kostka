public class PioGame {
    public static void main(String[] args) {

        Game game = new Game();

        game.addPlayer(new PlayerComp("Stefan"));
        game.addPlayer(new PlayerComp("Marian"));
        System.out.println("---------");

        //game.removePlayer("Stefan");
        game.printPlayer();

        for (int i = 0; i < 100; ++i) {
            game.play();
            game.printStats();
        }

//        System.out.println("--------------------------------");
//        List<String> list = new ArrayList();
//        list.add("coś");
//        list.add("coś jeszcze");
//
//        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
//            String el = it.next();
//            System.out.println(el);
//        }

//        Iterator<String> it = list.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

//        for (String el : list) {
//            System.out.println(el.toUpperCase());
//        }
    }
}