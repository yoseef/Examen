/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadordenumeros;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author user
 */
public class BuscadorDeNumeros {

    //Timer timer = new Timer();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Timer timer = new Timer();
        //s'ha de crear un llista amb numeros ordenats 
        Scanner lc = new Scanner(System.in);

        ArrayList<Integer> llista = new ArrayList<>();
        for (int i = 0; i <= 500000; i++) {
            llista.add(i);
            //System.out.println(i);
        }
        System.out.println("Introdueix numero a buscar: ");
        int num = lc.nextInt();
        long start = System.currentTimeMillis();
        if (llista.contains(num)) {
            //counter.countPrimes(1000000);
            long vfinal = System.currentTimeMillis();
            System.out.println("Trobat en : " + ((vfinal - start)) + "milliseconds");
        }else{
            System.out.println("No s'ha trobat el numero.");
        }

    }
}
