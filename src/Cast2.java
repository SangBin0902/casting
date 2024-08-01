class Animal2 {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog2 extends Animal2 {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal2 {
    void sound() {
        System.out.println("Meow");
    }
}

public class Cast2 {
    public static void main(String[] args) {
        Animal2[] animals = { new Dog2(), new Cat() };

        for (Animal2 animal : animals) {
            animal.sound(); // 각각 Woof와 Meow를 출력
        }
    }
}
