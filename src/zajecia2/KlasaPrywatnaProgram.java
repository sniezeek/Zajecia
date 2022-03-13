package zajecia2;

public class KlasaPrywatnaProgram {
    public static void main(String[] args) {
        //KlasaPrywatna obj = new KlasaPrywatna();
        //obj.suma();
        //System.out.println(obj.rekurencja(800));
        int a[] = {1, 2, 3};
        try {
            System.out.println(a[10]);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(a[0]);
        System.out.println("Dalsza czesc programu");

    }
}
