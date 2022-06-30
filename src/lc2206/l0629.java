package lc2206;

import java.util.Scanner;

public class l0629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        StringBuffer res = new StringBuffer();
        int count = 0;
        char[] str = n.toCharArray();

        for(int j = 0; j < str.length; j++){
            for(int i = 0; i <= j; i++){
                if(Character.isDigit(str[j])){
                    i = j;
                    count = j - i;
                    j++;
                }
            }
        }

        for(int i=0; i < str.length; i++){
            if(Character.isDigit(str[i]) && res.length() < 255){
                res.append(str[i]);
            }
        }
        System.out.println(res);

    }
}
