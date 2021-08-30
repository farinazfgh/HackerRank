import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a=999999992344444444444499999990000000000000000000000
        //b=213200000000000001231230000000000000000000000000000000000000000000000000000000000000000000000
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        BigInteger add = a.add(b);
        BigInteger multiply = a.multiply(b);
        System.out.println(add);
        System.out.println(multiply);
        //213200000000000001231230000000000000000000999999992344444444444499999990000000000000000000000
        //213199998367835556786797390572118333333401734987687700000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
    }

}
