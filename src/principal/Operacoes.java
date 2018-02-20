package principal;

/**
 * Classe para execução do exercicio da GuiaBolso
 *
 * @author Soave
 * @since 02/18
 */


public class Operacoes {


    //Validar qual o menor numero da lista
    public static int validarMenorValor(Integer[] numeros){
        Integer menorNumero = null;

        //Percorrer lista para definir o primeiro valor
        for(int i=0; i<numeros.length; i++){
            if(menorNumero == null){
                menorNumero = numeros[i];
            }

        //comparar valor anterior da lista com o valor atual
        if(menorNumero.intValue() > numeros[i]){
            menorNumero = numeros[i];
            }
        }
        return menorNumero;
    }

    //Validar qual o maior numero da lista
    public static int validarMaiorValor(Integer[] numeros){
        Integer maiorNumero = null;
        for(int i=0; i<numeros.length; i++){
            if(maiorNumero == null){
                maiorNumero = numeros[i];
            }
            if(maiorNumero.intValue() < numeros[i]){
                maiorNumero = numeros[i];
            }
        }
        return maiorNumero;
    }

    //Encontrar média nos valores da lista
    public static int encontrarMedia(Integer[] numeros){
        //inicializando a média para evitar nullpointer
        Integer valorDaMedia = 0;
        for(int i=0;i<numeros.length; i++){
            valorDaMedia += numeros[i];
        }
        valorDaMedia = valorDaMedia / 2;
        return valorDaMedia;
    }
}