package ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] scores = {90,80,70,60,50};
        int total = 0;

        for (int i = 0; i < scores.length; i++){
            total += scores[i];
        }
        double average = (double) total / scores.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
