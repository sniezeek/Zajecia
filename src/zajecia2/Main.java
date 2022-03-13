package zajecia2;

public class Main {
    public static void main(String[] args) {
        //For Each
        int tablica[]={1,2,3,4,56,677,8657};

        int index=0;
        for(int liczba : tablica){
            liczba+=1;
            tablica[index]=liczba;
            index++;
        }

        for(int i = 0; i<tablica.length;i++){
            System.out.println(tablica[i]);
        }


    }
}
