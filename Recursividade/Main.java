public class Main {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();

        // Teste do algoritmo de multiplicação
        System.out.println(op.multiplicacao(4, 3));
        System.out.println(op.multiplicacao(8, 2));
        System.out.println(op.multiplicacao(5, 3));
        System.out.println(op.multiplicacao(4, 5));
        System.out.println(op.multiplicacao(7, 8));

        // Teste do algoritmo de divisão
        System.out.println(op.divisao(9, 3));
        System.out.println(op.divisao(15, 3));
        System.out.println(op.divisao(40, 10));
        System.out.println(op.divisao(5, 2));
        System.out.println(op.divisao(5, 3));
    }
}
