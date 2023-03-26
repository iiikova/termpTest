import Animals.Cat;
import Animals.Dog;
import interfaces.AbleToSound;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {


        Map<String, Integer> m = new HashMap<>();
        m.put("name", 1);
        m.put("name2", 2);
        System.out.println(m);

//        Dog.InnerDog dog2 = dog.new InnerDog();
        Dog.InnerDog dog3 = new Dog.InnerDog();
        dog3.say();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        AbleToSound able = (suf) -> "Hello" + suf;
        System.out.println(sayMeow(able));

    }

    public static String sayMeow(AbleToSound think) {
        return think.makeSound("!");
    }


}





