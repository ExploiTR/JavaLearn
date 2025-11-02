package oops.polymorphism;

class A {
    void show() {
        System.out.println("A -> " + this.getClass().getName());
    }
}

class B extends A {
    void show() {
        System.out.println("B -> " + this.getClass().getName());
    }
}

class C extends A {

}

/*
 * Dynamic Method Dispatch (Runtime Polymorphism)
 * ----------------------------------------------
 * We can use a parent class reference to refer to a child class object.
 *
 * When a method is called through such a reference:
 *  - If the child class overrides the method, the child version is executed.
 *  - If the child does not override it, the parent version is used.
 *
 * This mechanism allows Java to decide which method to call at runtime
 * based on the actual object being referenced.
 *
 * Summary:
 *  - The type of reference (A) determines which methods are visible to the compiler.
 *  - The type of object (A, B, or C) determines which method is actually executed at runtime.
 */
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();

        a.show(); //A -> oops.polymorphism.A
        b.show(); //B -> oops.polymorphism.B
        c.show(); //A -> oops.polymorphism.C
    }
}
