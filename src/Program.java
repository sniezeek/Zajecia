package paczka;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        HashMap<Auto,Integer> mapa = new HashMap<Auto,Integer>();
        mapa.put(new Auto("aaa"),1);
        mapa.put(new Auto("drugie"),12);

        if(mapa.containsKey(new Auto("aaa"))){
            System.out.println("kk");

        }else {
            System.out.println("oo");
        }

    }
}
