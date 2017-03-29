/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Waruwu
 */
public class OddDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int totalsemua = 0;
          for(int j=0;j<input;j++){
            long num = sc.nextInt(), i;
            int total = 1;
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    if(i%2==1)
                        total+=i;
                }
            }
            if(num%2==1 && num!=1) total+=num;
            
            totalsemua += total;
          }
          System.out.println(totalsemua);
    }
}
