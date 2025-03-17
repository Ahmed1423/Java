public class Operators {

    public void arithmeticOperator() {
        System.out.println(1 + 2);
        System.out.println(2 - 1);
        System.out.println(3 * 5);
        System.out.println(4 / 3);
        System.out.println(6 % 4);
    }

    public void unaryOperator() {

        int num1 = 1, num2 = 0;

        System.out.println(+3);
        System.out.println(-3);

        num2 = ++num1;
        System.out.println("num1= " + num1 + " " + "num2= " + num2);

        num2 = --num1;
        System.out.println("num1= " + num1 + " " + "num2= " + num2);

        num2 = num1++;
        System.out.println("num1= " + num1 + " " + "num2= " + num2);

        num2 = num1--;
        System.out.println("num1= " + num1 + " " + "num2= " + num2);
    }

    public void logicalOperators() {

        // logical AND
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // logical OR
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // logical NOT
        System.out.println(!true);
        System.out.println(!false);
    }

    public void relationalOperators() {
        System.out.println(3 > 2);
        System.out.println(2 < 3);
        System.out.println(4 >= 4);
        System.out.println(3 <= 2);
        System.out.println(2 == 2);
        System.out.println(1 != 2);
    }

    public void ternaryOperator() {
        System.out.println((4 % 2 == 0) ? "Even" : "Odd");
    }

    public void instanceOfOperator() {
        String name = "ajdnnckr";

        System.out.println(name instanceof  String);
    }

    public void bitwiseOperators() {
        System.out.println(4 & 2);
        System.out.println(6 | 3);
        System.out.println(4 << 2);
        System.out.println(8 >> 1);
        System.out.println(5 ^ 7);
        System.out.println(~6);
        System.out.println(-20 >>> 2);
    }

    public void typeCastingOperators() {
        //implicit

        double b = 1;

        //explicit

        int i = (int)3.43;

        System.out.println(b);
        System.out.println(i);
    }

    public void assignmentOperators() {
        int num = 2;

        System.out.println(num);

        num += 2;

        System.out.println(num);

        num -= 3;

        System.out.println(num);

        num *= 2;

        System.out.println(num);

        num /= 3;

        System.out.println(num);

        num %= 3;

        System.out.println(num);
    }

    public static void main(String[] args) {
        Operators operators = new Operators();
        operators.arithmeticOperator();
        operators.logicalOperators();
        operators.unaryOperator();
        operators.bitwiseOperators();
        operators.relationalOperators();
        operators.instanceOfOperator();
        operators.ternaryOperator();
        operators.typeCastingOperators();
        operators.assignmentOperators();
    }
}
