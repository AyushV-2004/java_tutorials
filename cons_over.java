class Demo{
            Demo(){
             System.out.println("default");
            }
            Demo(int a){
             System.out.println(a);
        
            }
            Demo(float a){
                System.out.println(a);
        
            }
            Demo(double a){
                System.out.println(a);
        
            }
}

class cons_over{
    public static void main(String[] args) {
       
        Demo obj = new Demo();
        Demo obj2 = new Demo(10);
        Demo obj3 = new Demo(10.2);
        Demo obj4 = new Demo(10.666);
    
    }
}
