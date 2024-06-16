import java.util.Scanner;
/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 *     <b>Note:</b> Leia atentamente a documentação desta classes para desfrutar dos recursos oferecidos pelo autor
 * </p>
 * @author Marcos Alexandre
 * @version 0.1
 * @since 16/06/2024
 */
public class Calculadora {

    Scanner scanner = new Scanner(System.in);


    // Atributos da classe
    private float resultado;
    private String operacao;
    public String msgFinal;
    private float sobra;
    /**
     * Este método é utilizado para somar dois números inteiros
     *
     * @param n1   este é o primeiro parâmetro do método
     * @param n2 este é o segundo parâmetro do método
     */
    void Soma(int n1, int n2) {
        operacao = "soma";
        resultado = n1 + n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Subtracao(int n1, int n2) {
        operacao = "subtracao";
        resultado = n1 - n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Multiplicacao(int n1, int n2) {
        operacao = "multiplicacao";
        resultado = n1 * n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Divisao(int n1, int n2) {
        if (n2 == 0) {
            operacao = "divisao";
            resultado = Float.NaN;
            sobra = Float.NaN;
            msgFinal = "Divisão por zero não é permitida.";
        } else {
            operacao = "divisao";
            resultado = (float) n1 / n2;
            sobra = n1 % n2;
            Resultado(resultado, n1, n2, operacao);
        }
    }

    private void Resultado(float resultado, int n1, int n2, String operacao) {
        switch (this.operacao) {
            case "soma" -> this.msgFinal = n1 + " + " + n2 + "\n---\n= " + this.resultado;
            case "subtracao" -> this.msgFinal = n1 + " - " + n2 + "\n---\n= " + this.resultado;
            case "multiplicacao" -> this.msgFinal = n1 + " x " + n2 + "\n---\n= " + this.resultado;
            case "divisao" -> this.msgFinal = n1 + " / " + n2 + "\n---\n= " + this.resultado + "\nSobras: " + this.sobra;
        }


    }

}
