package Laboop1;

import java.util.Scanner;
import java.util.Arrays;
public class oop5 {
    public static double avg (int[] arr){
        int length = arr.length;
        int sum = 0;
        for(int i = 0;i<length;i++){
            sum += arr[i];
        }
        return (double)sum / length;
    }

    public static void print(int[] arr){
        int length = arr.length;
        for(int i = 0;i<length;i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println("");
    }

    public static double sum(int[] arr){
        int length = arr.length;
        double sum = 0;
        for(int i=0;i<length;i++){
            sum+=(double)arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for(int i = 0;i <n;i++){
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        print(array);
        double temp = avg(array);
        double sum = sum(array);

        System.out.printf("Sum cua mang: %.2f\n",sum);
        System.out.printf("Avg cua mang: %.2f",temp);
        input.close();
    }
    
}
