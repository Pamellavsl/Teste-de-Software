package test;

import main.Doador;
import org.junit.Assert;
import org.junit.Test;

public class DoadorTest {
    @Test
    public void testarDoador() {
        Doador doador1 = new Doador();
        Doador doador2 = new Doador("Rafael Alves de Oliveira", 61, 70.5, "M", false, false, false, true, false);
        Doador doador3 = new Doador("Luiza Mota Ferreira", 27, 80, "F", false, true, false, true, true);

        doador1.setNome("Maria Eduarda Silva Santos");
        doador1.setIdade(35);
        doador1.setPeso(67.8);
        doador1.setSexo("F");
        doador1.setEstaGravida(true);
        doador1.setEstaAmamentando(false);
        doador1.setTempParto(true);
        doador1.setJaDoouAnteriormente(false);
        doador1.setEstaComFebre(false);

        Assert.assertEquals(doador1.getNome(), "Maria Eduarda Silva Santos");
        Assert.assertEquals(doador1.getIdade(), 35);
        Assert.assertEquals(doador1.getPeso(), 67.8, 0.0);
        Assert.assertEquals(doador1.getSexo(), "F");
        Assert.assertTrue(doador1.isEstaGravida());
        Assert.assertFalse(doador1.isEstaAmamentando());
        Assert.assertTrue(doador1.isTempParto());
        Assert.assertFalse(doador1.isJaDoouAnteriormente());
        Assert.assertFalse(doador1.isEstaComFebre());

        Assert.assertEquals(doador2.getNome(), "Rafael Alves de Oliveira");
        Assert.assertEquals(doador2.getIdade(), 61);
        Assert.assertEquals(doador2.getPeso(), 70.5, 0.0);
        Assert.assertEquals(doador2.getSexo(), "M");
        Assert.assertFalse(doador2.isEstaGravida());
        Assert.assertFalse(doador2.isEstaAmamentando());
        Assert.assertFalse(doador2.isTempParto());
        Assert.assertTrue(doador2.isJaDoouAnteriormente());
        Assert.assertFalse(doador2.isEstaComFebre());

        Assert.assertEquals(doador3.getNome(), "Luiza Mota Ferreira");
        Assert.assertEquals(doador3.getIdade(), 27);
        Assert.assertEquals(doador3.getPeso(), 80, 0.0);
        Assert.assertEquals(doador3.getSexo(), "F");
        Assert.assertFalse(doador3.isEstaGravida());
        Assert.assertTrue(doador3.isEstaAmamentando());
        Assert.assertFalse(doador3.isTempParto());
        Assert.assertTrue(doador3.isJaDoouAnteriormente());
        Assert.assertTrue(doador3.isEstaComFebre());
    }
}
