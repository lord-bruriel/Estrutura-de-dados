/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula_2;

/**
 *
 * @author bruno gabriel
 */
public class Aula_2{
   public static void main(String[] args) {
    
      double x, z, valor;
      int valorint;
      
      x = 64;
      valor = (float) Math. sqrt(x);
      System.out.println("Raiz de 64 = "+valor);

      valor = Math.pow(Math.E,1/2*(Math.log(Math.E)/Math.log(64)));
      valor = (int) valor;
      System.out.println("exp(1/2*log(64)) = "+valor);
      
       valor = Math.cbrt(512);
      System.out.println("Raiz cubica 512 = "+valor);
      
      x = -8;
      z = 0;
      valor = Math.abs(z + x);
      System.out.println("absoluto -8 = "+valor);
      
      x = 8;
      valor = Math.abs(z + x);
      System.out.println("absoluto 8 = "+valor);
      
      
      //
      valorint = (int) Math.round(5.5);
      System.out.println("convertendo 5.5 para inteiro : "+valorint);
      
       valorint = (int) Math.floor(6.5);
      System.out.println("convertendo 6.5 para inteiro : "+valorint);
      
      x = 6.5 + 0.0001;
      valorint = (int) Math.round(x);
      System.out.println("convertendo para inteiro 6.5 + 0.0001 : "+valorint);
      
      valorint = (int) Math.floor(5.45);
      System.out.println("convertendo para inteiro 5.45: "+valorint);
       
      
      valorint = (int) Math.floor(6.5);
      System.out.println("convertendo para inteiro 5.51: "+valorint);
      
      
      valorint = 87;
      valor = (double) valorint;
      System.out.println("convertendo para real 87: "+valor);
      
      valorint = (int) Math.floor(3/4);
      float valorb = 3/4;
      System.out.println("convertendo para int 3/4: "+valorb);
   }

    
}

