package ExpressionBlock;

public class LogicalOpeators {
    public static void main(String[] args) {
        //Logical operaters are used to check whether an expression is true or false.
        //They are used in decision making

        //1. && (Logical AND) expression1 && expression2
        //true if both expression1 & expression2 both are true

        System.out.println((5>3)&&(8>5));
        System.out.println((5<3)&&(8>5));

        //2. || (Logical OR) expression1 || expression2
        //true if experssion1 or expression2 is true

        System.out.println((5>3)||(8>5));
        System.out.println((5<3)||(8>5));

        //3. ! (Logical NOT) !expression
        //true if expression is false and vice true

        System.out.println(!(5==3));
        System.out.println(!(8>5));
    }
}
