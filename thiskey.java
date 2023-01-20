class ayush{
    int a,b;
    void verma(int x ,int y){
        this.a=x;
        this.b=y;
        System.out.println(a+b);
    }

}
public class thiskey {
    public static void main(String[] args) {
        ayush obj = new ayush();
        obj.verma(10, 20);
    }
}
