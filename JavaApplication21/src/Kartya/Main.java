/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Kartya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author makra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();

        Kirak();
        Melyik();
        Kever();
        Ezvolt();

    }

    private static void Kirak() {
        Scanner input = new Scanner(System.in);
        String lap = "";
        String szin[] = {"P", "Z", "M", "T"};
        String ertek[] = {"__ALS", "__FEL", "___V", "__VI_", "__VII", "_VIII", "__ÁSZ"};
        String pakli[] = new String[22];
        List<String> listaPakli = new ArrayList<String>();

        for (int i = 0; i < szin.length; i++) {
            for (int j = 0; j < ertek.length; j++) {

                lap = szin[i] + ertek[j];
                listaPakli.add(lap);
                System.out.println(lap);

            }

        }
        
    }

    private static void Melyik() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Kever() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Ezvolt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
