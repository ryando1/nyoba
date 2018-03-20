/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection.sort;

import java.util.Scanner;

/**
 *
 * @author SCT-N3WB13
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);
    int jumlah;
    System.out.print("Masukkan panjang array : ");
    jumlah = scan.nextInt();
    int[] data = new int[jumlah];
    System.out.println("Masukkan " +jumlah+ " angka : ");
    for (int i = 0; i<data.length; i++){
        data[i]=scan.nextInt();
        }
    for (int i = 0; i<data.length-1; i++) {  
            int index = i;  
            for (int j = i+1; j <data.length; j++){  
                if (data[j]<data[index]){  
                    index = j;  
                }  
            }  
            int swap = data[index];   
            data[index] = data[i];  
            data[i] = swap;  
            System.out.println(swap);
        }
    
    System.out.print("Hasil sorting : ");
    for (int i = 0; i<data.length; i++){
        System.out.print(data[i]+ " , ");
      
     
    }
    }
}
    
    

