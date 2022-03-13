package zajecia2;

import java.util.ArrayList;

public class Listy {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        //Dodawanie
        lista.add("Niebieski");
        lista.add("Czerwony");
        lista.add("Żółty");
        lista.add("Czarny");
        //Zmiana
        lista.set(0, "Zielony");
        //Pobieranie
        String zmienna_dodatkowa = lista.get(0);
        //Usuwanie
        lista.remove(1);
        System.out.println(zmienna_dodatkowa);
        System.out.println(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
        }

        for (String i : lista) {
            System.out.print(i);
        }

        //ArrayList<Integer>

    }
}
