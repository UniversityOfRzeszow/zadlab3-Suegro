/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;
import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        
        Scanner odczyt = new Scanner(System.in);
        
        
        //1.4
        System.out.println("Prosze podac numer zadania(1.4, 1.7, 2.2, 3.3 lub 3.4)");
        String zadanie;
        zadanie = odczyt.next();
        
        switch(zadanie)
        {
            case "1.4" :
            {
                System.out.println("Prosze podac liczbe calkowita");
        
        int liczba;
   
        liczba = odczyt.nextInt();
        
        System.out.println("Prosze wybrac opcje 1(>>), 2(<<) lub 3(>>>)");
        String opcja;
        opcja = odczyt.next();
        
        switch(opcja)
        {
            case "1" :
            {
                System.out.println("Prosze podac o ile miejsc maja zostac przesuniete bity");
                int ilosc;
                ilosc = odczyt.nextInt();
                
                liczba=liczba>>ilosc;
                System.out.println("Wynik to "+liczba);
                break;
            }
            case "2" :
            {
                System.out.println("Prosze podac o ile miejsc maja zostac przesuniete bity");
                int ilosc;
                ilosc = odczyt.nextInt();
                
                liczba=liczba<<ilosc;
                System.out.println("Wynik to "+liczba);
                break;
            }
             case "3" :
            {
                System.out.println("Prosze podac o ile miejsc maja zostac przesuniete bity");
                int ilosc;
                ilosc = odczyt.nextInt();
                
                liczba=liczba>>>ilosc;
                System.out.println("Wynik to "+liczba);
                break;
            }
             default :
             {
                 System.out.println("Podano nieprawidlowy numer");
                 break;
             }
        }
            }
        }
        
        
        
        
    }
    
}
