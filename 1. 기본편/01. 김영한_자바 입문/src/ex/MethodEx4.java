package ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            //scanner.nextInt();
            if (choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                int price = scanner.nextInt();
                //scanner.nextInt();
                balance += price;
                System.out.println(price + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdraw = scanner.nextInt();
                //scanner.nextInt();
                if (balance < withdraw) {
                    System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다");
                } else {
                    balance -= withdraw;
                    System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
                }
            } else if (choice == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }
}
