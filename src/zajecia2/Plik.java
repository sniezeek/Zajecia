package zajecia2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Plik {
    public static void main(String[] args) throws IOException {
        //Tworzenie pliku
        try {
            File plik = new File("plik_tekstowy.txt");
            if(plik.createNewFile()){
                System.out.println("Stworzony plik");
            }else{
                if(plik.exists()){
                    System.out.println("Nie udalo sie stworzyc pliku bo istnieje");
                }else{
                    System.out.println("Nie udalo sie stworzyc pliku bo nie wiem");
                }
            }
        }catch (IOException e){
            System.out.println("wywaliło błąd");
        }
        //Zapis do pliku
        FileWriter plik = new FileWriter("plik_tekstowy.txt");
        plik.write("zapiszmy coś w pliku");
        plik.write("\nzapiszemy coś innego w pliku");
        plik.close();

    }
}
