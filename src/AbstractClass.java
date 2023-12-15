public class AbstractClass {
    public static void main(String []arg) {
        DogClass d1 = new DogClass();
        d1.printName();
        d1.makesSound();

        CatClass c1 = new CatClass();
        c1.printName();
        c1.makesSound();
    }
}



abstract class AnimalClass {
    abstract void makesSound();
    protected void printName(){
        System.out.println("Hi, I am an Animal");
    }
}

class DogClass extends AnimalClass {
    public void makesSound() {
        System.out.println("I can Bark");
    }
}

class CatClass extends AnimalClass {
    public void makesSound() {
        System.out.println("I can Meow");
    }
}