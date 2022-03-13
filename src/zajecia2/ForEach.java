package zajecia2;

public class ForEach {
    public static void main(String[] args) {
        int tab1[]={10,10,11,14,56,6,57,4,98,10};
        int tab2[]={11,12,5,4,54,66,47,65,84,76};
        for(int i = 0;i<tab1.length;i++){
            System.out.print(tab1[i]);
            System.out.print("\t\t");
            System.out.print(tab2[i]);
            System.out.print("\t\t");
            System.out.println(tab1[i]*tab2[i]);
        }

        //double a = 3+Math.PI;
        for(int i = 0;i<tab1.length;i++) {
            int temp=Math.max(tab1[i],tab2[i]);
            if(temp==tab1[i]){
                System.out.println("Tab1 jest wieksza");
            }else{
                System.out.println("Tab2 jest wieksza");
            }
        }
        System.out.println("-------------------------");
        //operator warunkowy
        // (warunek)?co jesli prawda:co jesli nieprawda;

        for(int i = 0;i<tab1.length;i++) {
            System.out.println((tab1[i]>tab2[i])?"Tab1 jest wiekszy":"Tab2 jest wiekszy");
        }


//For Each
/*
        int index=0;
        for(int liczba : tablica){
            liczba+=1;
            tablica[index]=liczba;
            index++;
        }

        for(int i = 0; i<tablica.length;i++){
            System.out.println(tablica[i]);
        }
*/

    }
}
