public abstract class Player {

    public Player() {}

    public Player(String name) {
        setName(name);
    }

    private String name = "Domyslny Anonymous";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.matches("^[A-Za-z0-9,.\\-_]{3,}$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe imie");
        }
    }

    public abstract int guess();

}