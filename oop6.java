package Laboop1;

import java.util.Scanner;

public class oop6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int row = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int col = sc.nextInt();
//ma tran A, B và ma tran ket qua
        double[][] matA = new double[row][col];
        double[][] matB = new double[row][col];
        double[][] matAns = new double[row][col];

        System.out.println("\nHay nhap cac phan tu trong ma tran A: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matA[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\nHay nhap cac phan tu trong ma tran B: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matB[i][j] = sc.nextDouble();
            }
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matAns[i][j] = matA[i][j] + matB[i][j];
            }
        }

        System.out.println("\n________________________________");
        System.out.println("Ket qua matA + amtB la: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matAns[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
