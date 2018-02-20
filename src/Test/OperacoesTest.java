package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import principal.Operacoes;

/**
 * Classe para execução dos testes dos método - Exercicio GuiaBolso
 *
 * "I find your lack of faith disturbing - Vader, Darth"
 * @author Soave
 * @since 02/18
 */

class OperacoesTest {

    Integer[] lista = {1, 2, 3, 4, 55, 6, 7, 8, 9, 10};

    @Test
    void testValidarMenorNumero(){
        Assertions.assertEquals(1, Operacoes.validarMenorValor(lista));
    }

    @Test
    void testValidaMaiorNumero(){
        Assertions.assertEquals(55, Operacoes.validarMaiorValor(lista));
    }

    @Test
    void testEncontrarMedia(){
        //O resultador correto nesse teste é 52 com a lista declarada, portanto irá exibir erro
        Assertions.assertEquals(53, Operacoes.encontrarMedia(lista));
    }

}