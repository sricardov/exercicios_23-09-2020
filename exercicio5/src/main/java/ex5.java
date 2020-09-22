
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
public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x value:");
        int x = input.nextInt();
        while (x > 1) {
            System.out.print(x + " -> ");
            x = foo(x);
        }
        System.out.print(1);
    }
    
    public static int foo(int x) {
        if (x%2 == 0) return x/2;
        else return 3*x+1;
    }
}
