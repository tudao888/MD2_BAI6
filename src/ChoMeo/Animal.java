package ChoMeo;

public class Animal {
    public void talk() {
    }

    public void doAnimalThings() {
    }
}

class Dog extends Animal {
    @Override
    public void talk() {
        System.out.println("Go go!");
    }

    @Override
    public void doAnimalThings() {
        System.out.println("Dog things...");
    }
}

class Cat extends Animal {
    @Override
    public void talk() {
        System.out.println("Miao miao!");
    }

    @Override
    public void doAnimalThings() {
        System.out.println("Cat things...");
    }
}

class test {
    public static void talk(Animal animal) {
        animal.talk();
        animal.doAnimalThings();
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        talk(a);
        talk(b);
    }
}

