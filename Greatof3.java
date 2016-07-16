/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatof3;

import java.util.Scanner;

/**
 *
 * @author StarHP
 */
public class Greatof3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);System.out.println("Enter A");
        int a=sc.nextInt();System.out.println("Enter B");
        int b=sc.nextInt();System.out.println("Enter C");
        int c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("A is Great");
    }
        else if(b>a&&b>c){
            System.out.println("B is Great");
        }else{
            System.out.println("C is Great");
        }
    
}
}