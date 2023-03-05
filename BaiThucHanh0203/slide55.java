package BaithuchanhJava.BaiThucHanh0203;

public class slide55 {
    public static void main(String[] args) {
        System.out.println("Cac so chia het cho 5 trong pham vi tu 0 den 200 la: ");
        for (int i = 1, j = 1; i < 201; i++) {
            if(i%5==0) {
                if(i < 100) {
                    System.out.print(" ");
                }
                if(i < 10) {
                    System.out.print(" ");
                }
                System.out.print(i+" ");
            if(j%10==0) {
                System.out.println();
                j=0;
            }
                j++;
            }
        }
    }
    
}
