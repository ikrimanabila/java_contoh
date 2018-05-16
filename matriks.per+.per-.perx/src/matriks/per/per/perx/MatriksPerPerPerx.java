/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks.per.per.perx;

/**
 *
 * @author Ikrima Nabila
 */
public class MatriksPerPerPerx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //penjumlahan
        /*
        int a[][]={{8,2},{4,5}};
        int b[][]={{6,4},{6,8}};
        int penjumlahan [][]=new int[2][2];
        System.out.println("matriks A");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("matriks B");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
    }
     System.out.println("hasil dari penjumlahan");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                penjumlahan[i][j]=a[i][j]+b[i][j];
                System.out.print(penjumlahan[i][j]+" ");
            }
           System.out.println("");
           
}*/
        //pengurangan
        /*int a[][]={{6,2},{8,4}};
        int b[][]={{3,2},{4,3}};
        int pengurangan [][]=new int[2][2];
        System.out.println("matriks A");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("matriks B");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
    }
         System.out.println("hasil dari pengurangan");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                pengurangan[i][j]=a[i][j]-b[i][j];
                System.out.print(pengurangan[i][j]+" ");
            }
            System.out.println("");
    }*/
        //perkalian
        int a[][]={{1,2},{3,4}};
        int b[][]={{2,1},{3,2}};
        int perkalian [][]=new int[2][2];
        System.out.println("matriks A");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("matriks B");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
    }
        System.out.println("hasil dari perkalian");
        int satu = (a[0][0]*b[0][0]+a[0][1]*b[1][0]);
        int dua = (a[0][0]*b[0][1]+a[0][1]*b[1][1]);
        int tiga = (a[1][0]*b[0][0]+a[1][1]*b[1][0]);
        int empat = (a[1][0]*b[0][1]+a[1][1]*b[1][1]);
        System.out.print(satu+" "+dua+" ");
        System.out.println("");
        System.out.print(tiga+" "+empat+" ");
    }}

    
    
        
