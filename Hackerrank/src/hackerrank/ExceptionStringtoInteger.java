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
public class ExceptionStringtoInteger {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int t = Integer.valueOf(S);
            System.out.println(t);
        }catch(Exception e){
            System.out.println("Bad String");
        }
    }
    
}
