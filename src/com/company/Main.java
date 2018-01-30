package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 1.3.​ Parašykite programą, kuri paprašytų įvesti vartotojo du skaičius ir atspausdinti jų
        // skirtumą bei sumą
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite du skaicius: ");
        int sk1 = sc.nextInt();
        int sk2 = sc.nextInt();
        int suma = sk1 + sk2;
        int skirtumas = sk1 - sk2;
        System.out.println("Suma= " + suma);
        System.out.println("Skirtumas= " + skirtumas);
    }
}
