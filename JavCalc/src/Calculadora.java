public class Calculadora {

    // Atributos da classe
    private float resultado;
    private String operacao = "";
    String msgFinal;
    float sobra;

    void Soma(int n1, int n2){
        operacao = "soma";
        resultado = n1+n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Subtracao(int n1, int n2){
        operacao = "subtracao";
        resultado = n1-n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Multiplicacao(int n1, int n2){
        operacao = "multiplicacao";
        resultado = n1*n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Divisao(int n1, int n2){
        operacao = "divisao";
        resultado = n1/n2;
        sobra = n1%n2;

        Resultado(resultado, n1, n2, operacao);
        
    }

    private void Resultado(float resultado, int n1, int n2, String operacao){
        if (operacao == "soma") {
            msgFinal = n1 + " + " + n2 + "\n---\n= " + resultado;
        }if (operacao == "subtracao") {
            msgFinal = n1 + " - " + n2 + "\n---\n= " + resultado;
        }if (operacao == "multiplicacao") {
            msgFinal = n1 + " x " + n2 + "\n---\n= " + resultado;
        }if (operacao == "divisao") {
            msgFinal = n1 + " / " + n2 + "\n---\n= " + resultado + "\nSObras: " + sobra;
        }
    }
    
}
