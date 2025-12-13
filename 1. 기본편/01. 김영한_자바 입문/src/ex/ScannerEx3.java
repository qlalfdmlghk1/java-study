package ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String food1 = scanner.nextLine();
        System.out.print("음식의 가격을 입력해주세요: ");
        int money = scanner.nextInt();
        System.out.print("음식의 수량을 입력해주세요: ");
        int count = scanner.nextInt();
        int total = money * count;
        System.out.println("피자 "+ count + "개를 주문하셨습니다. 총 가격은 "+total+"원입니다.");
    }
}
