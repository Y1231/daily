package lc2206;

import java.util.Scanner;

public class l0630 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < arr.length; i++){

            arr[i] = sc.nextInt();
            if(arr[i] < -30 || arr[i] > 30){
                System.out.println("No");
            }
        }



        int a = 0;
        int b = 0;
        int c = 0;
        a = (arr[0] + arr[2]) / 2;
        b = (arr[1] + arr[3]) / 2;
        c = (arr[3] - arr[1]) / 2;

        if(a - ((arr[0] + arr[2]) / 2) != 0){
            System.out.println("No");
        }

        if(b - ((arr[1] + arr[3]) / 2) != 0 || b - ((arr[2] - arr[0]) / 2) != 0){
            System.out.println("No");
        }

        if(c - ((arr[3] - arr[1]) / 2) != 0){
            System.out.println("No");
        }

        System.out.println(a+" "+b+" "+c);




    }
}
