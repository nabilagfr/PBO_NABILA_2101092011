/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila19102022;

/**
 *
 * @author LABMM07
 */
import java.io.*;
public class Latihan2 {
    public static void main( String[] args )
    {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int grade = 0;

        try {
            System.out.print("Input Grade : ");
            grade = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error!");
        }
        
        switch(grade){
        case 100:
                System.out.println( "Excellent!" );
            break;
        case 90:
                System.out.println("Good job!" );
            break;
        case 80:
                System.out.println("Study harder!" );
            break;
        default:
                System.out.println("Sorry, you failed.");
        }
    }
}
