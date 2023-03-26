// CREATE GENERIC TYPE
public class Say<T> {
    T say;

    public Say(T say) {
        this.say = say;
    }

    public <T> void sayHello(T say) {
        System.out.println(say);
    }
}
