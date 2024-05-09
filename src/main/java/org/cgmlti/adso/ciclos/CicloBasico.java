package org.cgmlti.adso.ciclos;

public class CicloBasico {
    public static void main(String[] args) {
        //contador de tipo entero
        int contador = 10;

        // while (contador >= 1) {
        //     //instruccion de ciclo
        //     System.out.println(contador);
        //     //instruccion de incremento
        //     contador -= 1 ;
        // }

        //primer punto
        contador = 1;
        while (contador <= 100) {
            System.out.println("primer punto While: " + contador);
            contador += 1;
        }

        System.out.println("****************************");
        
        for(contador = 1; contador <= 100; contador += 1) {
            System.out.println("primer punto For: " + contador);
        }
        
        System.out.println("----------------------------");
        
        //segundo punto
        
        contador = 100;
        
        while (contador >= 1) {
            System.out.println("segundo punto While: " + contador);
            contador -= 1;
        }
        
        System.out.println("****************************");
        
        for(contador = 100; contador >= 1; contador -= 1) {
            System.out.println("segundo punto For: " + contador);
        }

        System.out.println("----------------------------");
        
        //tercer punto
        
        contador = 7;
        
        while (contador <= 77) {
            System.out.println("tercer punto While: " + contador);
            contador += 7;
        }
        
        System.out.println("****************************");
        
        for(contador = 7; contador <= 77; contador += 7) {
            System.out.println("tercer punto For: " + contador);
        }
        
        System.out.println("----------------------------");
        
        //cuarto a punto 
        
        contador = 20;
        
        while (contador >= 2) {
            System.out.println("cuarto punto While: " + contador);
            contador -= 2;
        }
        
        System.out.println("****************************");
        
        for(contador = 20; contador >= 2; contador -= 2) {
            System.out.println("cuarto punto For: " + contador);
        }

        System.out.println("----------------------------");

        //quinto punto
        
        contador = 2;
        
        while (contador <= 20) {
            System.out.println("quinto punto While: " + contador);
            contador += 3;
        }
        
        System.out.println("****************************");
        
        for(contador = 2; contador <= 20; contador += 3) {
            System.out.println("quinto punto For: " + contador);
        }

        System.out.println("----------------------------");

        //sexto punto
        
        contador = 99;
        
        while (contador >= 33) {
            System.out.println("sexto punto While: " + contador);
            contador -= 11;
        }
        
        System.out.println("****************************");
        
        for(contador = 99; contador >= 33; contador -= 11) {
            System.out.println("sexto punto For: " + contador);
        }
    }

}
