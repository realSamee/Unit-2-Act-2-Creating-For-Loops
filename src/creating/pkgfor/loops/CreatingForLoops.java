/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creating.pkgfor.loops;

/**
 *
 * @author saliy5109
 */
import java.util.Scanner;

public class CreatingForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("---Cool Counting Program---");
        System.out.println("\n\nPlease enter your choice:");
        System.out.println("1... Count from 0 to 10 by 1"
                + "\n2... Count from 100 to 0 by 10"
                + "\n3... Count from 50 to 500 by 50"
                + "\n4... Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");
        int choice = scan.nextInt();
        int start = 0;
        int end = 0;
        int by = 0;
        
        if (choice == 1) {
            start = 0; end = 10; by = 1;
        } else if (choice == 2) {
            start = 100; end = 0; by = -1;
        } else if (choice == 3) {
            start = 50; end = 500; by = 50;
        } else if (choice == 4) {
            start = 6000; end = 1000; by = -1000;
        }
        
        System.out.println("\n---------------------------------------"
                + "\nYou have chosen to count from " + start + " to " + end + " by " + by + ":");
        
        for (int i = start; i != end + by; i += by) {
            System.out.println(i);
        }
        
        System.out.println("---------------------------------------");
    }
}
