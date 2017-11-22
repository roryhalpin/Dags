/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computest;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author roryhalpin
 */
public class CompuTest {
    
    static Double odds;
    static String dag;
    static int amountBet;
    static int amountWon;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("D'ya wanna bet on sum dags?");
        System.out.println("Whass the dag called?");
        
        dag = scan.next();
        
        System.out.println("How well d'ya think he'll do?");
        System.out.println("Keep in mind now bai, yer gonna hav ta enter th' odds as a decimal representation of the odds hey. Like 11/4 is entered as 3.75, bai");
        odds = scan.nextDouble();
        
        System.out.println("And how much are ya gonna bet bai, whole numbers only skip.");
        
        amountBet = scan.nextInt();
        
        compute();
    }
    
    public static void compute() {
        
        amountWon = (int) (odds*amountBet);
        System.out.println("So if ya bet "+amountBet+ " punts on "+dag+", and he wins then you get €"+amountWon+ ", but if he loses you get nout and can fuck off back to Dublin ya West-Brit prick.");
    }
}
