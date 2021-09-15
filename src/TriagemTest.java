import org.junit.Assert;
import org.junit.Test;

public class TriagemTest {
    Triagem triagem = new Triagem();
    Doador doador1 = new Doador("Pamela", 20, 56.7, "F", false, false,  false, false, false);
    Doador doador2 = new Doador("Antonio", 60, 99, "M", false, false,  false, false, false);
    Doador doador3 = new Doador("Amanda", 22, 49, "F", false, false,  false, false, false);
    Doador doador4 = new Doador("Patricia", 30, 60.5, "F", true, false,  false, false, false);
    Doador doador5 = new Doador("Letícia", 45, 60.5, "F", false, true,  true, false, false);
    Doador doador6 = new Doador("Luna", 35, 55.9, "F", false, false,  false, false, true);
    Doador doador7 = new Doador("Carolina", 15, 60, "F", false, false,  false, false, false);
    Doador doador8 = new Doador("Maria", 60, 60, "F", false, false,  false, true, false);
    Doador doador9 = new Doador("Carolina", 16, 49, "F", false, false,  false, false, false);
    Doador doador10 = new Doador("Pedro", 16, 60, "M", false, false,  false, false, false);

    @Test
    public void Etapa1() {
        Assert.assertTrue(triagem.Etapa1(doador1));
        Assert.assertFalse(triagem.Etapa1(doador2));
        Assert.assertTrue(triagem.Etapa1(doador8));
        Assert.assertFalse(triagem.Etapa1(doador3));
        Assert.assertTrue(triagem.Etapa1(doador4));
        Assert.assertTrue(triagem.Etapa1(doador5));
        Assert.assertTrue(triagem.Etapa1(doador6));
        Assert.assertFalse(triagem.Etapa1(doador7));
        Assert.assertFalse(triagem.Etapa1(doador9)); // gap
        Assert.assertTrue(triagem.Etapa1(doador10));
    }

    @Test
    public void Etapa2 () {
        Assert.assertTrue(triagem.Etapa2(doador1));
        Assert.assertFalse(triagem.Etapa2(doador4));
        Assert.assertFalse(triagem.Etapa2(doador5));
        Assert.assertFalse(triagem.Etapa2(doador6));
        Assert.assertTrue(triagem.Etapa2(doador10));
    }

}
