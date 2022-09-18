/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula3;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author bruno gabriel
 */
public class Aula3 {

    public static void main(String[] args) {
        
       
        // 11 e 12
        System.out.print("Aprendendo Algoritimo!!");
        System.out.print("Com Anita Guto");
        
        System.out.println("");
        System.out.println("_________________________________________");
        // 16 e 18
        int a ;
        a = 10;
        System.out.println("Valor de X = " + a +"X + 1" + (a + 1));
        
        System.out.println("");
        System.out.println("_________________________________________");
        
        //23
        a = 326;
       int x = (int) (a/100)%100;
        System.out.println("A quantidade de centenas em: "+a+" eh: "+x);
        
         System.out.println("");
        System.out.println("_________________________________________");
        
        //24
        a = 326;
        x = (int) (a/10)%10;
        System.out.println("A quantidade de centenas em: "+a+" eh: "+x);
        
        
        //25 e 26
        Scanner ler = new Scanner(System.in);
        int dias,mes,ano,data;
        
        System.out.println("Digite a data no fomrato DDMMAA.");
        data = ler.nextInt();
        
        dias = data / 10000;
        mes = (data % 10000)/100;
        ano = data % 100;
        
        System.out.println("Dias :"+ dias);
        System.out.println("Mes :"+mes);
        System.out.println("Ano: "+ano);
        
        System.out.println("Data no formato mmddaa : "+mes+dias+ano);
        
        // 27
        
        int y;
        x = 2;
        y = 5;
        
        System.out.println("X = "+x++);
        System.out.println("Y = "+y--);
        
        System.out.println("Novo valor de X = "+x);
        System.out.println("Novo Valor de Y = "+y);
           
        float media;
        media = (7 + 8 + 9)/3;
        System.out.println("Media Aritimetica de 7 , 8 , 9 eh "+media);

        
        int quoc, rest, num1, num2;
        
        System.out.println("Digite o primeiro valor");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo valor");
        num2 = ler.nextInt();
        
        quoc = num1 / num2;
        rest = num1 % num2;
        
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
        System.out.println("Valor do quociente: "+quoc);
        System.out.println("Valor do resto: "+rest);
        
        //41
        float n1,n2,n3,n4, media41;
        
        System.out.println("Digite o valor das notas");
        System.out.print("N1: ");
        n1 = ler.nextInt();
        System.out.print(" N2: ");
        n2 = ler.nextInt();
        System.out.print(" N3: ");
        n3 =ler.nextInt();
        System.out.print("N4: ");
        n4 = ler.nextInt();
        
        media41 = (n1*1 + n2*2 + n3*3 + n4*4)/10;
        
        System.out.println("Media ponderada: "+media41);
        
        //42
        float angulo, rang;
        String temp;
        temp = JOptionPane.showInputDialog("digite o valor do angulo em graus");
        angulo = Float.parseFloat(temp);
        
        rang = (float) Math.PI*angulo/180;
        
        System.out.println("Sen do angulo: "+Math.sin(rang));
        System.out.println("cos do angulo: "+Math.cos(rang));
        System.out.println("tg do angulo: "+Math.tan(rang));
        System.out.println("secante do angulo: "+1/Math.sin(rang));
        System.out.println("cossecante do angulo: "+1/Math.cos(rang));
        System.out.println("cotangente do angulo: "+1/Math.tan(rang));
    }
    
    
       
}       
