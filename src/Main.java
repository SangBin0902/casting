class Animal {
    void sound() {
        System.out.println("Animal sound");
    }

    void fetch() {

    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
    void fetch() {
        System.out.println("Fetch!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();

        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal; // 안전한 다운캐스팅
            myDog.fetch(); // 출력: Fetch!
        }
    }
}