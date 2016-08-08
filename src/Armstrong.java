
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tofiq Quadri
 */
public class Armstrong {

    public static void main(String args[]) {

        int t = 0, a = 10;
        System.out.print("Enter the number of armstrong numbers required: ");
        Scanner in = new Scanner(System.in);

        t = Integer.parseInt(in.nextLine());

        while( t != 0)
        {
        int b = 0, rem = 0, div = 0;
        int i = 0, j = 0;

        b = a;
        div = a;
        while (div != 0) {
            rem = div % 10;
            div = div / 10;

            i++;
        }

        div = a;
        a = 0;
        while (div != 0) {
            rem = div % 10;
            div = div / 10;

            a += (int) Math.pow(rem, i);

        }

        if (b == a) {
            System.out.println(a);
            t--;
            
            a=b;
            a++;
        }
        
        a=b;
        a++;
        }
    }
}
