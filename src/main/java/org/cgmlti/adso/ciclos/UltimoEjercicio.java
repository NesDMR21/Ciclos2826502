package org.cgmlti.adso.ciclos;

import java.util.ArrayList;
import java.util.Scanner;

public class UltimoEjercicio {
    public static void main(String[] args) {
        int promedio = 0 ;
        int i = 1;
        ArrayList<Integer> notas = new ArrayList<Integer>();

        while (i <= 10) {
            Scanner notain = new Scanner(System.in);
            System.out.print("Ingrese la nota:  ");
            String nota = notain.nextLine();
            notas.add(Integer.parseInt(nota));
            i += 1;
        }

        for(int nota : notas) {
            promedio += nota;
        }
        System.out.println("promedio: " + promedio/notas.size());
    }
}
