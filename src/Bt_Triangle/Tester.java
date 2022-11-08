package Bt_Triangle;

import java.util.Scanner;

public class Tester {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Triangle triangle = getTriangle();
        System.out.print("nhập màu: ");
        triangle.setColor(sc.nextLine());
        System.out.print("có muốn fill không Y/N: ");
        String option = sc.nextLine();
        switch (option) {
            case "y":
            case "Y":
                break;
            default:
                triangle.setFilled(false);
                break;
        }
        System.out.println("\n \n" + triangle.toString());
    }
    private static Triangle getTriangle() {
        System.out.print("nhập 3 cạnh a,b,c: ");
        String input = sc.nextLine();
        if (!input.matches("^(?:[0-9],){2}[0-9]")) {
            System.out.println("không hợp lệ");
            System.out.print("nhập 3 cạnh a,b,c: ");
            input = sc.nextLine();
        }
        String[] triangle = input.split(",");
        Triangle outTriagle = new Triangle(
                Double.parseDouble(triangle[0]),
                Double.parseDouble(triangle[1]),
                Double.parseDouble(triangle[2])
        );
        if (!outTriagle.isValid()) {
            System.out.println("tam giác không hợp lệ!");
            outTriagle = getTriangle();
        }
        return outTriagle;
    }
}
