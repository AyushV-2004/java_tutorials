// Write a program in Java that find middle number from three numbers.
// 123
// 1 2 3 

import java.util.Scanner;

class que_2b{
       public static void main(String[] args) {
        //three inputs
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 =  sc.nextInt();
        int num3 =  sc.nextInt();
     sc.close();
        //find out the largest number
        int max = Math.max(num1, Math.max(num2, num3));
        
        //find out the smallest number
        int min = Math.min(num1, Math.min(num2, num3));
        
        //calculate the middle number
        int mid = num1 + num2 + num3 - min - max;
        
        //Display the result
        System.out.println("Middle number is: " + mid);
      }
    


    
}
