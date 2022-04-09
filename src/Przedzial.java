import java.util.List;
import java.util.Map;

public class Przedzial {
    private int minimalna;
    private int maksymalna;
    private List<Integer> lista;
    private Map<String,Auto> mapa;
    public Przedzial(int minimalna, int maksymalna){
        if(minimalna>maksymalna){
            throw new IllegalArgumentException("Minimalna jest wieksza od maksymalnej");
        }
        this.minimalna=minimalna;
        this.maksymalna=maksymalna;
        this.lista.add(1);
        this.lista.add(2);
        //lista.size();
        //lista.isEmpty();
        //lista.clear();
        //lista.set(0,20);
        //System.out.println(lista.get(0));


        this.mapa.put("BMW",new Auto(100));
        this.mapa.put("AUDI",new Auto(200));

        mapa.get("BMW").getPrzyspieszenie();

    }
    public boolean sprawdzanie(int a){
        if(a<=minimalna||a>=maksymalna)return false;
        else return true;
    }
}
