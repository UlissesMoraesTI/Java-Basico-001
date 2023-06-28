import br.ce.wcaquino.entidades.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class JunitAssertTest {

    @Test
    public void test () {
        Assert.assertTrue(true);
        Assert.assertFalse(false);

        Assert.assertEquals("Erro de comparação:", 1, 1);
        Assert.assertEquals(0.51, 0.51, 0.01); //Para Float - 0.01 margem de erro/comparação

        int i = 5;
        Integer i2 = 5;
        Assert.assertEquals(Integer.valueOf(i), i2);
        Assert.assertEquals(i, i2.intValue());

        Assert.assertEquals("bola", "bola");
        Assert.assertNotEquals("bola", "casa");
        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
        Assert.assertTrue("bola".startsWith("bo"));

        Usuario u1 = new Usuario("Usuario 1");
        Usuario u2 = new Usuario("Usuario 1");
        Usuario u3 = u2;

        Assert.assertEquals(u1, u2);

        //Para comparar se são da mesma instância
        Assert.assertSame(u1, u1);
        Assert.assertSame(u2, u2);
        Assert.assertSame(u3, u2);
        Assert.assertNotSame(u1, u2);

        u3 = null;

        Assert.assertTrue(u3 == null);
        Assert.assertNull(u3);
        Assert.assertNotNull(u2);
    }
}
