/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilai = 0;
        Scanner input=new Scanner(System.in);
        
        System.out.println("input nilai 3 buah");
        for(int i=0;i<3;i++){
            System.out.print("masukan nilai ke-"+i+" : ");
            nilai=input.nextInt();
        }
        System.out.print("jadi nilainya adalah"+nilai);
        
        //ARRAY
        
        System.out.println("---------------");
        System.out.println("ARRAY");
        System.out.println("input nilai 3 buah");
        
        int nilai_ar[]=new int[3];
        for(int i=0;i<3;i++){
            System.out.print("masukan nilai ke-"+i+" : ");
            nilai_ar[i]=input.nextInt();
        }
        System.out.print("jadi nilainya adalah ke-1 : "+nilai_ar[0]+"ke-2 : "+nilai_ar[1]+"nilai ke-3 : "+nilai_ar[2]);
    }
    
}
