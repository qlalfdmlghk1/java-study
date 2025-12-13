package ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();
                System.out.print("상품명 가격을 입력하세요: ");
                int price = scanner.nextInt();
                scanner.nextLine();
                System.out.print("구매 수량을 입력하세요: ");
                int count = scanner.nextInt();
                scanner.nextLine();
                sum += price * count;
                System.out.println("상품명:"+product+" 가격:"+price+" 수량:"+count+" 합계:"+sum);
            } else if (option == 2) {
                System.out.println("총 비용: " + sum);
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
