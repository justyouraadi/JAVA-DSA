package HomeWork;
import java.util.Scanner;

public class AreaOfTraingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        
        int sum = side1 + side2 + side3;
        
        if(sum==180 && side1>0 && side2>0 && side3>0){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
            
        }
    }
}
