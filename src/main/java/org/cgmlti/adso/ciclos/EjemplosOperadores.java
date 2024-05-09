package org.cgmlti.adso.ciclos;

public class EjemplosOperadores {
    public static void main(String[] args) {
        int a = 2, b=3, c=5;
        boolean y = c * b++ < 10 && b <6;
        System.out.println(y);
        System.out.println(b);

        b = 3;
        boolean x = (--b + 2 * a < 10) && 7 * b++ < 5 * (c +2);
        System.out.println(x);
        System.out.println(b);
    }

}
