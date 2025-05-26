package lesson_29;

public class Passenger {
    private static int idCounter = 10_000;

    private final int id;
    private String name;

    public Passenger(String name) {
        this.id = idCounter++;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Passenger: {");
        sb.append("id: ").append(id).append(", name: ").append(name).append("}");
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
