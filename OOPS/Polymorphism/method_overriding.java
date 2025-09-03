//Runtime polymorphis =>  when a subclass provides a specific implementation of a method that is already defined in its superclass. The method

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Animal b = new Dog(); // upcasting
        b.sound(); // Runtime polymorphis
    }

}
