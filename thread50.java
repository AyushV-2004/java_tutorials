class t1 extends Thread{
    void even(){
        try {
            for(int i=0;i<=50;i++){
            Thread.sleep(200);
            
            if(i%2==0){
                System.out.print(" "+ i);
            }
        }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}

class t2 extends Thread{
    void odd(){
        try {
            for(int i=0;i<=50;i++){
                Thread.sleep(200);
                if(i%2!=0){
                    System.out.print(" "+i);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}

public class thread50{
     public static void main(String[] args) {
         t1 obj1 = new t1();
         obj1.even();
        System.out.println("\n");
        t2 obj2 = new t2();
        obj2.odd();
     }
}