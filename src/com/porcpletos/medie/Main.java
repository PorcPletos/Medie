package com.porcpletos.medie;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sumaNote = 0;
        float teza;
        float noteMax = 0;
        float medie;
        boolean areTeza=false;
        String raspunsTeza;
        System.out.print("Salut! Cate note ai giOnULe? ");
        noteMax = scanner.nextInt();
        System.out.print("Asa, pai zi-le gHiBOsuLe.. ");
        for (int i = 1; i <= noteMax; i++) {

            sumaNote = sumaNote + scanner.nextInt();
            while(i<noteMax) {
                System.out.print("Mai baga..");
                break;
            }

        }
        System.out.print("Ai dat teza? ");
        raspunsTeza=scanner.next();
        areTeza=raspunsTeza.toLowerCase().contains("da");
        if(areTeza==true)
        {
            System.out.print("Cat ai luat in ea giOnULe? ");
            teza=scanner.nextInt();
            medie=((sumaNote/noteMax)*3+teza)/4;

        }
        else medie=sumaNote/noteMax;
        System.out.println("Media ta este: "+ medie);
    }
}

