package commons;

public class Animal {

    public void speak(){

        System.out.println("Hello");

    }

}


public class TestAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.speak();
    }

}
