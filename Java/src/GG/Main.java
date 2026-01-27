interface Animal {
    void eat();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("The dog eats pedigree");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("The cat eats fish");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.eat();

        Cat c1 = new Cat();
        c1.eat();

        // Polymorphism
        Animal myAnimal = new Dog();
        myAnimal.eat();

        myAnimal = new Cat();
        myAnimal.eat();
    }
}
