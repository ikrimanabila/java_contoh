/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping_forjava;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Looping_forjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,nilai;
        Scanner inputan = new Scanner(System.in);
        //contoh sederhana
        /*
        for(int i=0;i>5;i++)
        {
            System.out.print(i);
        }
        */
        //contoh kedua
        /* for(int i=0;i<5;i++)
        {
            System.out.print("masukan nama siswa : ");
            nama=inputan.nextLine();
            System.out.print("masukan nilai : ");
            nilai=inputan.nextLine();
            System.out.print("nilai milik siswa ke-"+i+"dengan nama"+nama+" : "+nilai);
       */
      //contoh ketiga
      for(int i=0;i<5;i++)
      //untuk buat baris
      {
          for(int j=0;j<5;j++)
              //untuk kolom
          {
              System.out.print("*");
          }
          System.out.println();   
      }
        }
    }
    

