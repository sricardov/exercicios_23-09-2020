
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergi
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer value:");
        int x = input.nextInt();
        System.out.print(x + "! = " + fat(x));
    }
    
    public static int fat(int x) {
        if (x == 1 || x == 0) return 1;
        else return x*fat(x-1);
    }
}
