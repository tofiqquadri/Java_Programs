
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
public class MatrixExistance {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int a[][] = new int[9][9];
        int i, j, k, l, flag=0;

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = (i + 1);
            }
        }

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }

        int b[][] = new int[3][3];
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b[i].length; j++) {
                b[i][j] = Integer.parseInt(in.nextLine());
            }
        }

        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println("");
        }
        
        for (i = 0; i < a.length - 3; i++) {
            for (j = 0; j < a[i].length - 3; j++) {

                for (k = 0; k < b.length; k++) {
                    for (l = 0; l < b[k].length; l++) {
                       if(b[k][l] != a[i+k][j+l])
                       {                         
                       }
                       else if((k==2)  &&  (l==2))
                       {
                          flag=1;
                       }
                    }
                }

            }
        }
        
        if(flag == 1)
        {
            System.out.println("Yes Matrix 2 exists in matrix 1");
        }
        else
        {
            System.out.println("Matrix 2 does not exists in matrix 1");
        }
    }
}
