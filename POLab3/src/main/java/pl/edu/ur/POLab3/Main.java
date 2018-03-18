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
    
    public static double potega_iteracja(double liczba, int potega)
    {
      double wynik=1;
        
      for(int i = 0;i<potega;i++)
      {
          wynik = wynik*liczba;
      }
      
      return wynik;
    }
    
    public static double potega_rekurencja(double liczba, int potega)
    {
        if(potega==1) return liczba;
        else return liczba*potega_rekurencja(liczba,potega-1);
    }
    
    public static int fibonacci(int pozycja)
    {
        if(pozycja==0) return 0;
        else if(pozycja==1) return 1;
        else return fibonacci(pozycja-1)+fibonacci(pozycja-2);
    }

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
        case "1.7" :
        {
            //NOT - !a
            //XOR = ^
            
           boolean a = true;
           if(a==true)
           {
               System.out.println(!a);
           }
           else
           {
               System.out.println(a);
           }
           
           boolean b = true,c=false;
           
           if(a^b)
           {
               System.out.println("It doesn`t works");
           }
           else if(a^c)
           {
               System.out.println("It works!");
           }
            
        }
        case "2.2" :
        {
            // toCharArray() kowertuje napis ze zmiennej typu String na nową tablice typu char[]
            System.out.println("1.");
            String a = "asd";
            
            char[] b = a.toCharArray();
            for(int i = 0;i<3;i++)
            {
                System.out.print(" "+b[i]);
            }
            
            System.out.println("");
            
            // getBytes() zwraca tablice typu byte z danego napisu
            System.out.println("2.");
            
            byte[] c = a.getBytes();
            for(int i = 0;i<3;i++)
            {
                System.out.print(" "+c[i]);
            }
            
             System.out.println("");
             
            // boolean equals(String str) zwraca true jesli 2 zmienne typu String sa rowne
            System.out.println("3.");
            
            String a1 = "abc";
            String a2 = "abc";
            String a3 = "cba";
            if(a1.equals(a2))
            {
                System.out.println("Sa rowne");
            }
            if(a1.equals(a3)==false)
            {
                System.out.println("Sa rozne");
            }
            
             System.out.println("");
             
             // boolean equalsIgnoreCase(String str) działa tak samo jak poprzednia metoda z tą różnicą, że podczas porównywania ignoruje wielkość liter 
             
             System.out.println("4.");
            
            String b1 = "ABc";
            String b2 = "abC";
            if(b1.equalsIgnoreCase(b2))
            {
                System.out.println("Sa rowne");
            }
             System.out.println("");
            
             // int campareTo(String str) porównuje 2 zmienne typu String i zwraca liczbęe ujemną jeśli pierwszy napis jest leksykograficznie wiekszy od 
             // drugiego, 0 jeśli są leksykograficznie równe oraz liczbę dodatnią jeśli pierwszy wyraz jest leksykograficznie mniejszy od drugiego.
             
             System.out.println("5.");
             
             String c1 = "aSd";
             String c2 = "asdSAd";
             String c3 = "aB";
             
             int wynik1 = c1.compareTo(c1);
             int wynik2 = c1.compareTo(c2);
             int wynik3 = c1.compareTo(c3);
             
             System.out.println(wynik1+" "+wynik2+" "+wynik3);
             
             System.out.println("");
             
             // int campareToIgnoreCase(String str) działa tak samo jak poprzednia metoda, ale nie zwraca uwagi na wielkość liter
             
             System.out.println("6.");
             
             int wynik4 = c1.compareToIgnoreCase(c1);
             int wynik5 = c1.compareToIgnoreCase(c2);
             int wynik6 = c1.compareToIgnoreCase(c3);
             
             System.out.println(wynik4+" "+wynik5+" "+wynik6);
             
             System.out.println("");
             
             // int indexOf(int i) - wyszukuje w podanej zmiennej typu String podany przez nas znak i zwraca jego pozycje, jeśli
             // nie znajdzie żadnego wystąpienia zwraca -1
             
             System.out.println("7.");
             
             String liczba = "12345";
             int wynik7 = liczba.indexOf('2');
           
             System.out.println(wynik7);
             
             System.out.println("");
             
             // int indexOf(String str) działa podobnie jak powyższa metoda tylko wyszukuje ciąg znaków i zwraca pozycje pierwszego znaku.
             
             System.out.println("8.");
             
             String d1 = "konstantynopol";
             
             int wynik8 = d1.indexOf("yn");
             int wynik9 = d1.indexOf("asd");
             
             System.out.println(wynik8+" "+wynik9);
             
             System.out.println("");
             
             // int lastIndexOf(int i) zwraca pozycje ostatniego znalezionego znaku
             
             System.out.println("9.");
             
             String liczba2 = "12321";
             int wynik10 = liczba2.lastIndexOf('1');
           
             System.out.println(wynik10);
             
             System.out.println("");
             
             // int lastIndexOf(String str) zwraca pozycje ostatniego znalezionego ciągu znaków
             
             System.out.println("10.");
             
             String d2 = "aabbccbbaa";
             
             int wynik11 = d2.lastIndexOf("bb");
             
             System.out.println(wynik11);
             
             System.out.println("");
             
             // String substring(int startString) zwraca ciag znakow od podanego do ostatniego
             
             System.out.println("11.");
             
             String e = "abcdefghijklmnoprstuwxyz";
             
             String wynik12 = e.substring(17);
             
             System.out.println(wynik12);
             
             System.out.println("");
                 
             // String substring(int startString, int stopString) zwraca ciąg znaków z przedziału podanego w nawiasach
             
             System.out.println("12.");
             
             String e2 = "abcdefghijklmnoprstuwxyz";
             
             String wynik13 = e2.substring(5,12);
             
             System.out.println(wynik13);
             
             System.out.println("");
             
             // String replace(char orginal, char zamiennik) zamienia kazdy znak podany jako pierwszy parametr na drugi znak podany jako drugi parametr
             
             System.out.println("13.");
             
             String f = "kochambekon";
             
             String wynik14 = f.replace('k','q');
             
             System.out.println(wynik14);
             
             System.out.println("");
             
             // String trim() zwraca podany ciag znaków pomijając początkowe i końcowe znaki białe
             
             System.out.println("14.");
             
             String g = "       5        ";
             
             String wynik15 = g.trim();
             
             System.out.println(wynik15);
             
             System.out.println("");
             
             // String toLowerCase() zamienia wszystkie znaki z na małe
             
             System.out.println("15.");
             
             String h = "WIELKIEmale";
             
             String wynik16 = h.toLowerCase();
             
             System.out.println(wynik16);
             
             System.out.println("");
             
             // String toUpperCase() zamienia wszystkie znaki z na duże
             
             System.out.println("16.");
             
             String h2 = "WIELKIEmale";
             
             String wynik17 = h.toUpperCase();
             
             System.out.println(wynik17);
             
             System.out.println("");
             
             // String[] split(String regex, int limit) dzieli zmienną typu String na kilka osobnych elemntów nowej tablicy typu String[]
             // Jako pierwszy parametr podałem "//s" czyli znak biały, natomiast drugi element oznacza limit nowej tablicy
             
             System.out.println("17.");
             
             String i1 = "kolejne wyrazy sa teraz elementami nowej tablicy";
             
             String[] wynik18 = i1.split("\\s",3);
             
             for(int i=0;i<3;i++)
             {
                 System.out.println(wynik18[i]+" ");
             }
             
             System.out.println("");
             
             // String[] split(String regex) działa tak samo jak powyższa metoda, tylko nie podajemy limitu
             
              System.out.println("18.");
             
             String i2 = "kolejne wyrazy sa teraz elementami nowej tablicy";
             
             String[] wynik19 = i2.split("\\s");
             
             for(int i=0;i<7;i++)
             {
                 System.out.println(wynik19[i]+" ");
             }
             
             System.out.println("");
             
        }
        
        case "3.3" :
        {
            System.out.println("Prosze podac liczbę i potegę");
            
            double liczba = odczyt.nextDouble();
            int potega = odczyt.nextInt();
            
            double wynik1 = Main.potega_iteracja(liczba,potega);
            double wynik2 = Main.potega_rekurencja(liczba, potega);
            
            System.out.println("Iteracyjnie-"+wynik1+" "+"Rekurencyjnie-"+wynik2);
        }
        
        case "3.4" :
        {
            System.out.println("Prosze podac pozycję");
            
            int pozycja = odczyt.nextInt();
            
            int wynik = Main.fibonacci(pozycja);
            
            System.out.println(wynik);
        }
        
        }  
    }
    
}
