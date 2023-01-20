 class demo12 {
    final int a = 10 ;
    void display(){
        System.out.println(a);
        // a = 20;
        // final variable cannot be changed or reassigned
    }   
     
}
public class final1{
    public static void main(String[] args) {
        demo12 obj = new demo12();
        obj.display();
    }
}