
package lab1_dannacasco;

import java.util.Scanner;/**
 *
 * @author Danna Casco
 */
public class Lab1_DannaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema de calculo de promedio");
        System.out.print("Ingrese su nombre:");//se ingresa nombre del usuario//
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese la nota final de la primera clase:");
        double primeraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase:");
        double segundaClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la tercera clase:");
        double terceraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase:");
        double cuartaClase = entrada.nextDouble();
        
        //calculo
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase; 
        double promedio = sumaClase /4;
        
        //imprimi calculo 
        System.out.println("---"+nombre +"el promedio de las cuatro clases es:" +promedio);
        
    }
    
}
