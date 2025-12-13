package oop.ex;

public class Account {
    // 필드
    int balance = 0;

    // 메소드
    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        if (balance - amount < 0 ) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }
}
