package paczka;

public class Auto {
    private int przyspieszenie;
    public String nazwa;
    public Auto(String nazwa){
        this.przyspieszenie=100;
        this.nazwa=nazwa;
    }

    @Override
    public int hashCode(){
        return nazwa.hashCode();
    }

    @Override
    public boolean equals(Object other){
        if (this == other)return true;
        if (other == null || getClass() != other.getClass()) return false;
        return (nazwa == ((Auto) other).nazwa);
    }
}
