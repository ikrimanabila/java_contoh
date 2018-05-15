/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation_java;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Animation_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner input=new Scanner(System.in);
        
        System.out.print("masukan panjang/lebar kotak : ");
        if(!input.hasNextInt()){
            System.out.print("harus angka! tidak bisa diproses");
        }
        else{
            n=input.nextInt();
            for(int i=1;i<=n;i++){
               for(int j=1;j<=n;j++){
                 if(j==1 || j==n || i==1 || i==n){
            System.out.print("*");
    }
              else{
                  System.out.print(" ");
              }}
        System.out.println();
            }
}}}
