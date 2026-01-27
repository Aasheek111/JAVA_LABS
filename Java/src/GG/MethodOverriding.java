class Parent {
    void print() {
        System.out.println("Hello i am parent class");
    }

}

class Child extends Parent {
    @Override
    void print() {

        System.out.println("Hello i am child class ");
    }

}

public class MethodOverriding {

    public static void main(String[] args) {

        Child c1 = new Child();
        Parent c2 = new Child();
        Parent c3 = new Parent();

        c1.print();
        c2.print();
        c3.print();

    }

}
