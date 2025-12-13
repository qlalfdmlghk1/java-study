package oop.ex;

public class Rectangle {
    // 필드
    int width;
    int heigth;

    // 메소드
    void area() {
        int area = calculateArea(width, heigth);
        System.out.println("넓이: " + area);
    }
    void perimeter() {
        int perimeter = calculatePerimeter(width, heigth);
        System.out.println("둘레 길이: " + perimeter);
    }
    void square() {
        boolean square = isSquare(width, heigth);
        System.out.println("정사각형 여부: " + square);
    }

    int calculateArea(int width, int height) {
        return width * height;
    }
    int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }
    boolean isSquare(int width, int height) {
        return width == height;
    }
}
