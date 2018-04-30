/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai_latihan, nilai_uts, nilai_uas;
        double hasil;
        String nama;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("masukan nama anda : ");
        nama=inputan.nextLine();
        
        System.out.print("masukan nilai latihan : ");
        nilai_latihan=inputan.nextInt();
        
        System.out.print("masukan nilai uts : ");
        nilai_uts=inputan.nextInt();
        
        System.out.print("masukan nilai uas : ");
        nilai_uas=inputan.nextInt();
        
        hasil=(double)(0.2*nilai_latihan)+(0.3*nilai_uts)+(0.5*nilai_uas);
        
        System.out.print("nilai yang diperoleh adalah"+hasil+".");
        //ini yg dibawah untuk 2 perbandingan
        
        /*if (hasil>=70)
        {
            System.out.print("anda hebat");
        }
        else
        {
            System.out.print("sayang sekali, belajar lebih giat");
        }*/
        
        //ini yang dibawah untuk perbandingan lebih dari 2
        if (hasil>80)
        {
            System.out.print("grade A");
        }
        else if (hasil>65)
        {
            System.out.print("grade B");
        }
        else if (hasil>50)
        {
            System.out.print("grade C");
        }
        else if (hasil<=50)
        {
            System.out.print("grade D");
        }    
        }
          
        
        }
        
        
    
    

