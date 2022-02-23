package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /* Feladat: Írj programot, amely beolvassa a felhasználó nevét, majd köszön neki! */
        Scanner konzol = new Scanner(System.in);
        /* A Scanner osztály segítségével tudunk konzolról adatot beolvasni.
        *  Létrehozunk ebből az osztályból egy példányt, úgy hogy megadjuk
        *  a System.in-t mint paraméter (ez jelzi azt, hogy a standard bemenetről,
        *  a konzolról történjen a beolvasás). */
        System.out.print("Kérem az ön nevét: ");
        String név = konzol.nextLine();
        // .nextLine() metódus segítségével tudunk a sor végéig minden beírt dolgot beolvasni.
        // Ezt a beolvasott adatot String-ként (karakterláncként) adja vissza.
        System.out.println("Hello, " + név + "!");
        // String konkatenáció (összefűzés) segítségével összeállítom a kiírandó szöveget és ezt kiíratom.
    }
}
