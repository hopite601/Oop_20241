package Laboop1;

import java.util.Scanner;

public class oop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int n = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // In dấu sao theo công thức cân đối
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Xuống dòng sau mỗi tầng
            System.out.println();
        }

        // Đóng đối tượng scanner
        sc.close();
    }
}
