package lc2206;

import java.util.Arrays;
import java.util.Scanner;

public class l0630_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n*3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        long res = 0;

        Arrays.sort(arr);

        for(int i = n; i < 3*n; i += 2){
            res += arr[i];
        }
        System.out.println(res);

    }
}
