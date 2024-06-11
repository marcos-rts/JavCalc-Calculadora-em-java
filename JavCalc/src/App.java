public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();

        calc.Soma(10, 5);
        System.out.println(calc.getResultado()); // Deve imprimir o resultado da soma
        System.out.println(calc.getMsgFinal()); // Deve imprimir a mensagem formatada
    }
}
