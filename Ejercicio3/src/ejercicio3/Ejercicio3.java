/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner tecla = new Scanner (System.in);
        System.out.print("Ingrese valor a: ");
        a= tecla.nextInt();
        System.out.print("Ingrese valor b: ");
        b=tecla.nextInt();   
        int resultado = sumas(a,b);
        System.out.println("="+ resultado);
    }
    
    public static int sumas(int a,int b)
    {
        int resultado,sum;
        if(b==0)
         return a=0;
        else
        {
            
            resultado=a + sumas(a,b-1);
            
            System.out.print(a + " + ");
            return resultado;
            
        }
        
    }
    
}
