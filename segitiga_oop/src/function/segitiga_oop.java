/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class segitiga{
    double alas;
    double tinggi;
    
    //contructor
    public segitiga(){
        alas=0.0;
        tinggi=0.0;
    }


//procedure input
public void input(){
    Scanner input=new Scanner(System.in);
    System.out.println("perhitungan segitigas");
    System.out.print("masukan alas segitiga : ");
    alas=input.nextDouble();
    System.out.print("masukan tinggi segitiga : ");
    tinggi=input.nextDouble();
}


//function luas
public double luas(){
return(alas*tinggi/2);
}
//prosedure output
public void output(){
System.out.println("luas segitiga : "+luas());
}
}

//program utama
public class segitiga_oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        segitiga sg=new segitiga();
        sg.input();
        sg.output();
    }
    
}
