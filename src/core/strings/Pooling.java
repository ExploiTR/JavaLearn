package core.strings;

public class Pooling {
    public static void main(String[] args) {

        //"Hello" is a string literal, so the JVM puts it into the String Pool (inside the method area / metaspace)
        String a = "Hello";

        //This explicitly creates a new String object on the heap, even though "Hello" already exists in the pool
        String b = new String("Hello");

        System.out.println(a == b ? "Same Obj" : "Diff Obj");
        // equals() compares values, == compares references
        System.out.println(a.equals(b) ? "Values equal" : "Values differ");

        //b.intern() checks if "Hello" exists in the pool.
        //So intern() returns a reference to the pooled version.
        //then we reassign and original b becomes eligible for garbage collection (#refc  = 0)
        b = b.intern();

        System.out.println(a == b ? "Same Obj" : "Diff Obj");
        System.out.println(a.equals(b) ? "Values equal" : "Values differ");

        a = a.replace("e", "1");

        System.out.println(a == b ? "Same Obj" : "Diff Obj");
        System.out.println(a.equals(b) ? "Values equal" : "Values differ");
    }
}
