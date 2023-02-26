package BaithuchanhJava.Baithuchanh2302;

import java.util.Scanner;

/**
 * Slide35
 */
public class slide35 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào giá trị của số thứ 1 = ");
        int x=Integer.parseInt(scan.nextLine());
        System.out.print("Nhập vào giá trị của số thứ 2 = ");
        int y=Integer.parseInt(scan.nextLine());
        System.out.println("Số nhỏ nhất trong 2 số là: "+ getMinimum(x,y));
        scan.close();
    }

    private static int getMinimum(int x, int y) {
        if(x>y)
            return y;
        return x;
    }
}
