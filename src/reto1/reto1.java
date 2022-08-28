/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;



import java.util.*;

/**
 *
 * @author ivanf
 */
public class reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = Integer.parseInt(leer.nextLine());
        int V [] = new int [n], mayor = 0, menor = 0, suma = 0, promedio = 0;
        
        for (int i = 0; i < V.length; i++) {
            V[i] = Integer.parseInt(leer.nextLine());
        }
        
        for (int i = 0; i < V.length; i++) {
            suma+= V[i];
        }
        
        Arrays.sort(V);
                
        promedio = suma/n;
        mayor = V [n-1];
        menor = V [0];
        
        clasificacionIrca(promedio);
        clasificacionIrca(mayor);
        clasificacionIrca(menor);
    }
    
    public static void clasificacionIrca(int valor){
        if(valor >= 0 && valor <= 5){
            System.out.println("SIN RIESGO");
        }else{
            if(valor > 5 && valor <= 14){
                System.out.println("BAJO");
            }else{
                if(valor > 14 && valor <= 35){
                    System.out.println("MEDIO");
                }else{
                    if(valor > 35 && valor <= 80){
                        System.out.println("ALTO");
                    }else{
                        if(valor > 80 && valor <= 100){
                           System.out.println("INVIABLE SANITARIAMENTE"); 
                        }
                    }
                }
            }
        }
    }


}
