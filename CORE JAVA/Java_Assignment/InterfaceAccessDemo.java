// Question 2
interface Animal {
    void makeSound();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public String name = "Buddy";
    protected String breed = "Labrador";
    int age = 3;
    private String tagId = "D12345";

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void play() {
        System.out.println(name + " is playing fetch.");
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Tag ID: " + tagId);
    }
}

public class InterfaceAccessDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.play();
        dog.printDetails();
    }
}