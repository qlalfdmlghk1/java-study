package ex;
public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println("평균값: " + aver(1,2,3));

        System.out.println("평균값: " + aver(15,25,35));
    }

    public static double aver(int a,int b,int c){
        double sum = a + b + c;
        return sum / 3;
    }
}