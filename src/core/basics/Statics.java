package core.basics;

public class Statics {
    static int testInt = 12;
    int id = 0;
    private static int count = 0;

    static {
        System.out.println("Class is loaded");
    }

    Statics() {
        id = ++count;
    }

    int getCreateCount() {
        return count;
    }

    static void staticMethod() {
        //this cant be reffed
    }

    public static void main(String[] args) {
        System.out.println("code runs now -");
        System.out.println("test int -> " + Statics.testInt);

        Statics a = new Statics();
        Statics b = new Statics();

        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(a.getCreateCount());
        System.out.println(b.getCreateCount());
    }
}
