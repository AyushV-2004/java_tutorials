public class dynamic_dispatch {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        A a2;
        a2=a1;
        a2.callme();
        a2=b1;
        a2.callme();
        a2=c1;
        a2.callme();
    }
}

class A {
    void callme() {
        System.out.println("inside a");
    }
}

class B extends A {
    void callme() {
        System.out.println("inside b");
    }
}

class C extends A {
    void callme() {
        System.out.println("inside c");
    }
}