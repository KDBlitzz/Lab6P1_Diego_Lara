/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_diego_lara;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author diego
 */
public class Lab6P1_Diego_Lara {
    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean respuesta = true;
        
        while(respuesta) {
            System.out.println("1. ¿Cuántos primos tienes?");
            System.out.println("2. Frecuencia de Letras");
            System.out.println("3. Salir");
            int opcion = leer.nextInt();
            switch(opcion) {
                case 1: {
                    System.out.println("Ingrese el tamaño del arreglo a generar: ");
                    int size = leer.nextInt();
                    while(size <= 1) {
                        System.out.println("El tamaño ingresado tiene que ser mayor que 1");
                        size = leer.nextInt();
                    }
                    System.out.println("Ingrese el límite inferior: ");
                    int limiteInf = leer.nextInt();
                    System.out.println("Ingrese el limite superior: ");
                    int limiteSup = leer.nextInt();
                    
                    if(limiteInf >= limiteSup) {
                        System.out.println("El limite inferior no puede ser mayor o igual que el limite superior.");
                    }
                    
                    int [] length = new int[size];
                    Imprimir(length);
                    
                }
                    break;
                case 2: {
                    
                }
                break;
                case 3: {
                    System.out.println("Salio.");
                    respuesta =  false;
                }
                break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }
    public static int[] Limite(int [] arreglo,int a, int b) {
        int [] temporal = new int[a];
        for (int i = 0; i < a; i++) {
            temporal[i] = rand.nextInt(a,b); 
        }
        return temporal;
    }
    public static void Imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Valor de la posicion " + i + " = " + arreglo[i]);
            
        }
    }
}
