import java.util.Scanner;

public class Calculadora {

    Scanner scanner = new Scanner(System.in);


    // Atributos da classe
    private float resultado;
    private String operacao;
    private String msgFinal;
    private float sobra;
    private int escolha;

    void Start(){
        System.out.println("Escolha a operação que deseja fazer:\n Adição - 1\n Subtração - 2\n Divisão - 3\n Multiplicação - 4\n Sair - 0" );
        int escolha = scanner.nextInt();
        Escolha(escolha);
    }

    /**
     * @param escolha
     */
    void Escolha(int escolha){
        System.out.print("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = scanner.nextInt();
        
        
        switch (escolha) {
            case 1:
                Soma(n1, n2);
                break;

            case 2:
                Subtracao(n1, n2); 
                break;
            
            case 3:
                Divisao(n1, n2);
                break;
             
            case 4:
                Multiplicacao(n1, n2);
                break;

            default:
                break;
        }
    }

    void Soma(int n1, int n2) {
        operacao = "soma";
        resultado = n1 + n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Subtracao(int n1, int n2) {
        this.operacao = "subtracao";
        this.resultado = n1 - n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Multiplicacao(int n1, int n2) {
        this.operacao = "multiplicacao";
        this.resultado = n1 * n2;
        Resultado(resultado, n1, n2, operacao);
    }

    void Divisao(int n1, int n2) {
        if (n2 == 0) {
            this.operacao = "divisao";
            this.resultado = Float.NaN;
            this.sobra = Float.NaN;
            this.msgFinal = "Divisão por zero não é permitida.";
        } else {
            this.operacao = "divisao";
            this.resultado = (float) n1 / n2;
            this.sobra = n1 % n2;
            Resultado(resultado, n1, n2, operacao);
        }
    }

    private void Resultado(float resultado, int n1, int n2, String operacao) {
        if (this.operacao.equals("soma")) {
            this.msgFinal = n1 + " + " + n2 + "\n---\n= " + this.resultado;
        } else if (this.operacao.equals("subtracao")) {
            this.msgFinal = n1 + " - " + n2 + "\n---\n= " + this.resultado;
        } else if (this.operacao.equals("multiplicacao")) {
            this.msgFinal = n1 + " x " + n2 + "\n---\n= " + this.resultado;
        } else if (this.operacao.equals("divisao")) {
            this.msgFinal = n1 + " / " + n2 + "\n---\n= " + this.resultado + "\nSobras: " + this.sobra;
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

    public int getEscolha() {
        return escolha;
    }

    private void setEscolha(int escolha) {
        this.escolha = escolha;
    }
}
