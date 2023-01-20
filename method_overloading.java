class demo{
    void m1(){
        System.out.println("default");
    }
    void m1(int a){
        System.out.println(a);
        }
        
    void m1(float a){
        System.out.println(a);
    }
    void m1(double a){
        System.out.println(a);
    }
}
public class method_overloading {
 public static void main(String[] args) {
    demo obj = new demo();
    obj.m1();
    obj.m1(12);
    obj.m1(1.2);
    obj.m1(12.2222222);
 }   
}
