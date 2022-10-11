import org.junit.Assert;
import org.junit.Test;

public class AlphabetAlgorithmTest {

    @Test
    public void testWordA() throws Exception{
        boolean resultado = true;
        Assert.assertEquals(resultado, AlphabetAlgorithm.verifyWord("libro"));
    }
    @Test
    public void testWordLibro() throws Exception{
        boolean resultado = true;
        Assert.assertEquals(resultado, AlphabetAlgorithm.verifyWord("libro"));
    }
    @Test
    public void testWordBozo() throws Exception{
        boolean resultado = false; //"BOZO"
        Assert.assertEquals(resultado, AlphabetAlgorithm.verifyWord("bozo"));
    }
    @Test
    public void testWordTraje() throws Exception{
        boolean resultado = true;
        Assert.assertEquals(resultado, AlphabetAlgorithm.verifyWord("Traje"));
    }
    @Test
    public void testWordComun() throws Exception{
        boolean resultado = true;
        Assert.assertEquals(resultado, AlphabetAlgorithm.verifyWord("Comun"));
    }
    @Test
    public void testWordCampana() throws Exception{
        boolean resultado = false;
        Assert.assertEquals(resultado, AlphabetAlgorithm.verifyWord("Campana"));
    }
    @Test
    public void testWordDorito() throws Exception{
        boolean resultado = true;
        Assert.assertEquals(resultado, AlphabetAlgorithm.verifyWord("Dorito"));
    }
    @Test
    public void testWordArlequin() throws Exception{
        boolean resultado = true;
        Assert.assertEquals(resultado, AlphabetAlgorithm.verifyWord("Arlequin"));
    }

}
