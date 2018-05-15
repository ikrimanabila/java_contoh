/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_and_dowhile;

/**
 *
 * @author GeeksFarm
 */
public class While_and_dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hasil menggunakan for");
        for(int i=0; i>1; i++){
            System.out.print(i);
        }
        System.out.println();
        
        System.out.println("hasil menggunakan while");
        int j=0;
        while(j>1){
            System.out.print(j);
            j++;
        }
         System.out.println();
         
         System.out.println("hasil menggunakan do while");
         int k=0;
         do{
           System.out.print(k);  
           k++;
         }while(k>1);
          System.out.println();
    }
    
}
