package lc2206;

import java.util.Arrays;
import java.util.Scanner;

public class l0629_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        StringBuffer res = new StringBuffer();
        char[] str = n.toCharArray();
        for(int j = 0; j < str.length; j++){
            for(int i = 0 ;i <= j; i++){
                if(Character.isDigit(str[j])){
                    i = j;
                    count = j - i;
                    if(count < j-i){
                        for(int k = i; k<j; k++){
                            res.append(str[k]);
                        }
                    }
                }
            }
        }

        System.out.println(res);

    }
}
