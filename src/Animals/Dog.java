package Animals;

public class Dog {

    public static class InnerDog {
        String name = "inner dog";

        public void say() {
            System.out.println("Helllo im dog: " + name);

            class LocalDog {
                String localDogName = "local dog name";

                void localSay() {
                    System.out.println(localDogName);
                }
            }
            LocalDog localDog = new LocalDog();
            localDog.localSay();
        }

    }


}
