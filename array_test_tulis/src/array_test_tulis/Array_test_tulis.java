/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_test_tulis;

/**
 *
 * @author GeeksFarm
 */
public class Array_test_tulis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1,2,3,4,5,6};
        System.out.println("sebelum diubah");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
        //untuk membalikan array
        for(int i=0; i<arr.length/2; i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        //batas pembalikan array
        System.out.println("setelah diubah");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
        }
    }
    

