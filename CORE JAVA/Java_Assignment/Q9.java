class Parent {
    int value = 100;

    Parent(String message) {
        System.out.println("Parent Constructor: " + message);
    }

    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    int value = 200;

    Child() {
        super("Hello from Child");
    }

    void showValues(int value) {
        System.out.println("Local value: " + value);
        System.out.println("Child instance value (using this): " + this.value);
        System.out.println("Parent instance value (using super): " + super.value);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Child display method");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.showValues(500);
        obj.display();
    }
}
```<FollowUp>
Would you like another example covering constructor chaining using `this()` as well?
</FollowUp>