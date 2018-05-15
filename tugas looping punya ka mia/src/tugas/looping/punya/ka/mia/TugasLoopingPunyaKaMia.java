/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.looping.punya.ka.mia;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasLoopingPunyaKaMia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String nama,kode_kota,jenis_kelamin,nama_kota,jk;
         Scanner inputan = new Scanner(System.in);
         for(int i=1;i<=3;i++){
             System.out.println(".......................");
             System.out.println("data peserta ke-"+i);
             System.out.println(".......................");
             System.out.print("masukan nama : ");
             nama=inputan.nextLine();
             System.out.print("masukan kode kota [B/D/E] : ");
             kode_kota=inputan.nextLine();
             System.out.print("masukan jenis kelamin [L/P] : ");
             jenis_kelamin=inputan.nextLine();
             
             switch(kode_kota){
                 case "B":
                     nama_kota="jakarta";
                     break;
                 case "D":
                     nama_kota="bandung";
                     break;
                 case "E":
                     nama_kota="cirebon";
                     break;   
                 default:
                     nama_kota="kota tidak tersedia";
                     break;
            }
            if("P".equals(jenis_kelamin)){
                jk="perempuan";
            }
            else if("L".equals(jenis_kelamin)){
                jk="laki-laki";   
            }
            else{
                jk="jenis kelamin tidak terdeteksi";
            }
            System.out.println(nama+"berasal dari kota"+nama_kota+"dan berjenis kelamin"+jk);
            System.out.println();
         }
    }
    
}
