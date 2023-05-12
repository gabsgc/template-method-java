import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssinantePremiumTest {
    @Test
    void deveRetornarDescricaoCatalogo() {
        AssinantePremium assinantePremium = new AssinantePremium();
        assertEquals("Confira conteúdos exclusivos e lançamentos", assinantePremium.visualizarCatalogo());
    }

    @Test
    void deveRetornarInformacoes() {
        AssinantePremium assinantePremium = new AssinantePremium();
        assinantePremium.setNome("Gabi");
        assinantePremium.setUsername("gabi");
        assinantePremium.setPlano("Premium");
        assertEquals("Assinante{nome='Gabi', username='gabi', plano='Premium'}", assinantePremium.toString());
    }
}