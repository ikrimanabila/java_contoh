/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_ifstring;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Project_ifstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String jk, nama;
        Scanner inputan = new Scanner(System.in);
        System.out.print("nama : ");
        nama=inputan.nextLine();
        System.out.print("jenis kelamin [L/P] : ");
        jk=inputan.nextLine();
        /*
        if ("P".equals(jk)||"p".equals(jk)){
            System.out.print(nama+"berjenis kelamin perempuan");
        }
        else if ("L".equals(jk)||"l".equals(jk)){
            System.out.print(nama+"berjenis kelamin laki-laki");
        }
        else {
            System.out.print("maaf"+nama+ "jenis kelamin anda tidak terdeteksi");
        }
        */ 
        switch (jk){
            case "P":
                System .out.print(nama+"berjenis kelamin perempuan");
                break;
            case "L":
                System.out.print(nama+"berjenis kelamin laki-laki");
                break;
            default:
                System.out.print("maaf"+nama+"jenis kelamin anda tidak terdeteksi");
                break;
        }
    }
    
}
