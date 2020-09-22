/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergi
 */
public class ex4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        while (c <= 100) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
