/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nama anda :");
        nama=input.nextLine();
        
        System.out.println("halo "+nama);
       
        System.out.print("selamat datang");
    }
    
}
