/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medidas;

import java.util.Scanner;

/**
 *
 * @author Wilson
 */
public class Medidas {
    private static int e;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float medidas[]=new float[50];
        float CanVara[]= new float[10];
        int cantidad;
        int tira;
        float sumatoria = 0;
        float maxvara=585;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Cantidad de medidas que va a introducir max 50"); 
       cantidad= sc.nextInt();
       
       for(int i=0;i<=(cantidad-1);i++)
       {
            System.out.println("Introdusca medida numero " +(i+1) );
            medidas[i]=sc.nextFloat();
            sumatoria=medidas[i]+sumatoria;
            if(sumatoria>=maxvara)
            {
                int e=0;
                sumatoria=sumatoria-medidas[i];
                CanVara[e]=sumatoria;
                e++;
                sumatoria=0;
            }
            
       }
        System.out.println(CanVara[0]);
        System.out.println(sumatoria);
       
        
        
        
        
    }
    
}
