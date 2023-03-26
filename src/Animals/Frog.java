package Animals;

public class Frog {
    public String name;

    public Frog(String name) {
        this.name = name;
    }

    public Frog() {

    }

    public void getName(String name) {
        System.out.println(name);
    }

    public void ding() {
        System.out.println("im static");
    }

    public <T> T say(T value) {
        return value;
    }
}
