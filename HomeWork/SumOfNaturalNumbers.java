package HomeWork;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int to = 1000;
        int sum = 0;

        for(int i=0;i<to;i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of numbers : " + sum);
    }
}
