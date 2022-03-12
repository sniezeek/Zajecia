import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        //Tworzymy obiekt Scanner
        Scanner input = new Scanner(System.in);
        //Deklarujemy zmienną string aby jej później używać
        String dzialanie = "1";
        //warunek pętli while jeśli jest true to ta pętla zawsze się wykonuje chyba że natrafi na break;
        while (true){
            //Pytamy o dzialanie
            System.out.println("Wyjscie(x),Dodawanie(d),Odejmowanie(o),Mnozenie(m),Dzielenie(dz)");
            dzialanie = input.next();
            //Przerwanie aplikacji jesli x
            if(dzialanie.equals("x")){
                break;
            }
            //Pytamy o liczby
            System.out.println("Podaj pierwszą:");
            int a = input.nextInt();
            System.out.println("Podaj drugą:");
            int b = input.nextInt();
        }
    }
}
