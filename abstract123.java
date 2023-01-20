abstract class ansh{
    abstract void patel();
}
class ljp extends ansh{
  void patel(){
    System.out.println("abstract method ");
  }  
}
public class abstract123 {
    public static void main(String[] args) {
        ansh obj = new ljp();
        obj.patel();
    }
}
