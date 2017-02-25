/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.a07;
import java.util.Scanner;
/**
 *
 * @author andres
 */
public class SPPAMartinezCA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();}
    public static void menu(){
        System.out.println("Agenda telefónica de 10 personas");
      Scanner kb=new Scanner(System.in);
      long telefono;
        long[] toppings= new long[10];
            for (int i = 0; i <toppings.length; i++) {
            System.out.println("\nIntroduce el numero de la persona "+(i+1)+": ");
            toppings[i]=kb.nextLong();
    }
        
        try{
            System.out.print("\nIndique el número de persona de la que quiere saber el teléfono: ");
                int casilla=(int) kb.nextLong();
                telefono=toppings[casilla];
                System.out.println("\nEl telefono de la persona "+casilla+" es: "+telefono);
            

        }catch (Exception ex) {
            System.out.println("Dato fuera de rango");
        }
    }
    
}
    
