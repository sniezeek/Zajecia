import org.junit.jupiter.api.*;

public class Testowanie {
    private Przedzial tmp;

    @BeforeEach
    public void przedTestem(){
       this.tmp = new Przedzial(2,10);
       System.out.println("Zaczynamy Test");
    }

    //Wyjątki
    @Test
    void testMinimalnaWiekszaOdMaksymalnej(){
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Przedzial(23,12);
        });
        Assertions.assertEquals("Minimalna jest wieksza od maksymalnej",exception.getMessage());
    }
    //Zwykle testy
    @Test
    @DisplayName("Test jakiś tam inny")
    @Disabled
    void czyLiczbaBrzegowaJestWPrzedziale(){
        Assertions.assertTrue(tmp.sprawdzanie(2));
    }
    @Test
    void czyLiczbaWPrzedzialeDajeWartosTrue(){
        Assertions.assertTrue(tmp.sprawdzanie(5));
    }
}
