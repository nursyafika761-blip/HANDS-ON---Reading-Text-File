import java.io.Serializable;

public class Employees implements Serializable {
    private String name;

    public Employees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}