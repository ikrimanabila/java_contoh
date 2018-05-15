/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation_java;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Validation_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner inputan=new Scanner(System.in);
        int a;
        
        System.out.print("masukan angka : ");
        if(!inputan.hasNextInt()){//has dipakai jika input tidak memiliki isi berupa integer,! berarti nor.
            System.out.println("that's not a number!");
        }
        else{
            a=inputan.nextInt();
            System.out.println("number"+a);
        }
        
    }
    
}
