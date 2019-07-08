package Builder2;

public class Phone {

    private int id;
    private String name;

    public Phone() {
    }

    public Phone(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Phone setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Phone setName(String name) {
        this.name = name;
        return this;
    }
    
}
