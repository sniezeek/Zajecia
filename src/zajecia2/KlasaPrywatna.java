package zajecia2;

public class KlasaPrywatna {
    private int a;

    KlasaPrywatna(){
        this.a=100;
    }

    public void wypisanie_a(){
        System.out.println(this.a);
        powiekszanie_a();
        System.out.println(this.a);
    }
    public int get_a(){
        return this.a;
    }
    private void powiekszanie_a(){
        this.a+=10;
    }
}
