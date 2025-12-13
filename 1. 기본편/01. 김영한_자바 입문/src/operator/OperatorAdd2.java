package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 2

        //후위 증감 연산자
        a = 1;
        b = 0;

        b = a++; // a의 현재 값을 b에 먼저 대입하고 그 후 a 값을 증가
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 1

        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
    }
}
