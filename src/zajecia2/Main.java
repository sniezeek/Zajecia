package zajecia2;

public class Main {
    public int a;
    public String b;

    //Przeciążanie konstruktorów
    Main(){
        this.a=123;
        this.b="Nasza Klasa";
    }
    Main(int a,String b){
        this.a=a;
        this.b=b;
    }
    Main(int a){
        this.a=a;
    }

    public static void main(String[] args) {
        Main ob = new Main(100);
        ob.a=111111;

        System.out.println(ob.a);

    }

/*
    //Przeciążanie metod funkcji czyli tworzenie tej samej nazwy z różnymi parametrami
    public int suma(int a,int b,int c){
        return a+b+c;
    }
    public int suma(int a,int b){
        return a+b;
    }
    public float suma(float a,float b){
        return a+b;
    }
    public float suma(int a,float b){
        return a+b;
    }*/
}
