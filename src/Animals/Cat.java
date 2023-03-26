package Animals;

import interfaces.AbleToSound;

public class Cat implements AbleToSound {

    @Override
    public String makeSound(String suf) {
        return suf;
    }


}
