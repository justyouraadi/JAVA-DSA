package ExpressionBlock;

public class AssignmentOperators {
    public static void main(String[] args) {
        //Assignment operators are used in Java to assign value to variables.

        int age;
        age = 5;

        int a = 30;
        int value = age;

        System.out.println(value);

        value += a; //value = value + a

        System.out.println(value);

        value -= a; //value = value - a
        value *= a; //value = value * a
        value /= a; //value = value / a
        value %= a; //value = value % a
    }
}
