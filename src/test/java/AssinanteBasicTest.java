import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssinanteBasicTest {
    @Test
    void deveRetornarDescricaoCatalogo() {
     AssinanteBasic assinanteBasic = new AssinanteBasic();
     assertEquals("Confira os conteúdos disponíveis...", assinanteBasic.visualizarCatalogo());
    }

    @Test
    void deveRetornarInformacoes() {
        AssinanteBasic assinanteBasic = new AssinanteBasic();
        assinanteBasic.setNome("Gabi");
        assinanteBasic.setUsername("gabi");
        assinanteBasic.setPlano("Basic");
        assertEquals("Assinante{nome='Gabi', username='gabi', plano='Basic'}", assinanteBasic.toString());
    }
}