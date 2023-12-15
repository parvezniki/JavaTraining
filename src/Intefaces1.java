public class Intefaces1 {
    public static void main(String []arg) {
        Dog d1 = new Dog();
        d1.makesSound();

        Cat c1 = new Cat();
        c1.makesSound();

    }
}


interface Animal {
    public void makesSound();
}

class Dog implements Animal {
    public void makesSound() {
        System.out.println("I can Bark");
    }
}

class Cat implements Animal {
    public void makesSound() {
        System.out.println("I can Meow");
    }
}