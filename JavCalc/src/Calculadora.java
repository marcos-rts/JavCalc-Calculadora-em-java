public class Calculadora {

    // Atributos da classe
    private float resultado;
    private String operacao;
    private String msgFinal;
    private float sobra;

    void Soma(int n1, int n2){
        operacao = "soma";
        resultado = n1+n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Subtracao(int n1, int n2){
        this.operacao = "subtracao";
        this.resultado = n1-n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Multiplicacao(int n1, int n2){
        this.operacao = "multiplicacao";
        this.resultado = n1*n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Divisao(int n1, int n2){
        this.operacao = "divisao";
        this.resultado = n1/n2;
        this.sobra = n1%n2;

        Resultado(resultado, n1, n2, operacao);
        
    }

    private void Resultado(float resultado, int n1, int n2, String operacao){
        if (this.operacao == "soma") {
            this.msgFinal = n1 + " + " + n2 + "\n---\n= " + this.resultado;
        }if (this.operacao == "subtracao") {
            this.msgFinal = n1 + " - " + n2 + "\n---\n= " + this.resultado;
        }if (this.operacao == "multiplicacao") {
            this.msgFinal = n1 + " x " + n2 + "\n---\n= " + this.resultado;
        }if (this.operacao == "divisao") {
            this.msgFinal = n1 + " / " + n2 + "\n---\n= " + this.resultado + "\nSObras: " + this.sobra;
        }
    }

    // Get and Set

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getMsgFinal() {
        return this.msgFinal;
    }

    public void setMsgFinal(String msgFinal) {
        this.msgFinal = msgFinal;
    }

    public float getSobra() {
        return sobra;
    }

    public void setSobra(float sobra) {
        this.sobra = sobra;
    }

   
    
}
