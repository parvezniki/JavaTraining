public class PolyMorphRuntime1 {
    public static void main(String args[]) {
        // Any parent can call it's public child methods
        Animal animal1 = new Animal();          // -> HashCode 5456487987981
        animal1.iCan();

        Animal animal2 = new Dog();             // -> HashCode 5456487987982
        animal2.iCan();

                        Animal a1;
                        Dog d1 = new Dog();        // -> HashCode 5456487987983

                        a1 = d1;
                        a1.iCan();


        Animal animal3 = new Cat();
        animal3.iCan();
    }
}


class Animal {
    public void iCan() {
        System.out.println("Make sound");
    }
}

class Dog extends Animal {
    @Override
    public void iCan() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void iCan() {
        System.out.println("Meow");
    }
}