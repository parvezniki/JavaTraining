public class Inheritance2 {
    public static void main(String []arg) {
//        Animal animal = new Animal();
//        animal.walk();
//        animal.eat();
//        animal.sleep();
//        animal.makesSound();
        //--------------------

        Cat1 cat = new Cat1();
        cat.setName("My Cat");
        cat.printName();
        cat.makesSound();

        Dog1 dog = new Dog1();
        dog.setName("Jimmy");
        dog.printName();
        dog.makesSound();

        Horse1 horse = new Horse1();
        horse.setName("Pony");
        horse.printName();
        horse.makesSound();


    }
}


class Animal1 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("My Name: "+name);
    }

    public void walk() {
        System.out.println("I can walk");
    }
    public void eat() {
        System.out.println("I can eat");
    }
    public void sleep() {
        System.out.println("I can sleep");
    }
    public void makesSound() {
        System.out.println("I can make sound ");
    }
    public void tail() {
        System.out.println("I have a tail");
    }
}
// Overriding -> [ POLY MORPH ISM -> Cmpile time - Run Time Poly]
class Dog1 extends Animal1 {
    public void tail() {

        System.out.println("I can wag my tail");
    }
    public void makesSound() {
        System.out.println("I can Bark");
    }
}

class Cat1 extends Animal1 {
    public void makesSound() {
        super.tail();
        System.out.println("I can Meow");
    }
}

class Horse1 extends Animal1 {
    public void makesSound() {
        System.out.println("I can Neigh");
    }
    public void tail() {
        System.out.println("I have a hairy tail");
    }
}







