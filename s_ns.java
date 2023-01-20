class demos {
    static int a = 20;
 
    static void m1()
    {
        int a = 30;
        System.out.println(a);
      
    }
    void m2(){
        m1();
    }
}

public class s_ns {
public static void main(String[] args) {
    demos obj = new demos();
obj.m2();
}
}