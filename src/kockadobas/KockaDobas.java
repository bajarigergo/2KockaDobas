/* Bajári Gergő
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kockadobas;

import java.util.Random;
import java.util.Scanner;


public class KockaDobas {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        System.out.println("Dobások mennyisége:");
        int mennyiseg = sc.nextInt();
        int[] dobasok = {0,0,0,0, 0,0,0,0, 0,0,0};
        for (int i = 0; i < mennyiseg; i++) {
            int szam = rnd.nextInt(2, 13);
            dobasok[szam-2]++;
        }
        int legnagyobb = 0;
        for (int i = 1; i < dobasok.length; i++) {
            if (dobasok[i] > dobasok[legnagyobb]){
                legnagyobb = i;
            }
        }
        int MAX_CSILLAG = 40;
        for (int i = 0; i < dobasok.length; i++) {
            if (dobasok[i]>0){
                System.out.printf("%d ", i+2);
                int csillagok = (int)(((double)dobasok[i]/(double)dobasok[legnagyobb])*MAX_CSILLAG);
                for (int j = 0; j < csillagok; j++) {
                    System.out.print("*");
                }
                System.out.printf(" (%d db)\n",dobasok[i]);
            }
        }
    }
    
}
