package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // double 형 매개변수(파라미터)에 int 형 인수를 전달하는데 문제없다.

    }

    public static void printNumber(double n) {

        System.out.println("숫자: "+n);
    }
}
