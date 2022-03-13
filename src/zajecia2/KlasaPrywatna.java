package zajecia2;

import java.util.Scanner;

public class KlasaPrywatna {
    private int a;
    private int b;

    KlasaPrywatna(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe a");
        this.a=input.nextInt();
        System.out.println("Podaj liczbe b");
        this.b=input.nextInt();
    }

    public void suma(){
        System.out.println(this.a+this.b);
    }

    //10! = 1*2*3*4....*10
    //1+1+2+3+5+8
    public int rekurencja(int n){
        if(n>0){
            return n+rekurencja(n-1);
        }else{
            return 0;
        }
    }
    public int silnia(int n){
        if(n>1){
            return n*rekurencja(n-1);
        }else{
            return 1;
        }
    }
}
