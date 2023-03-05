package BaithuchanhJava.BaiThucHanh0203;

import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (sum <= 100) {
                sum += sc.nextInt();
            }
        }
        System.out.println("Tong cac so da nhap: "+sum);
        }
        
    
    
}
