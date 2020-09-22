/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergi
 */
public class ex2 {
    public static void main(String[] args) {
        int n = 3;
        int i = 2;
        do {
            System.out.println(n);
            n = 3*i++;
        } while (n <= 100);
    }
}