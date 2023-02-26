package BaithuchanhJava.Baithuchanh2302;

import java.util.Scanner;

public class slide30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sumOfElement(scan);
    }
    private static void sumOfElement (Scanner scan) {
        int n;
        System.out.print("Nhập vào giá trị của n = ");
        n=Integer.parseInt(scan.nextLine());
        int sumElement =0;
        while (n != 0) {
            sumElement+=n% 10;
            n/=10;
        }
        System.out.println("Tổng các chữ số của "+ n +" là: "+sumElement);
    }
}
