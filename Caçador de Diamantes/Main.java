import java.util.Scanner;

// Na classe Main, apenas executa o método main

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}

// Interface Texto é uma classe responsável pela interface com o usuário. O método "executar()" lê a quantidade de casos
// de teste. A estrutura for chama o método escavação(), método no qual são chamados construtor e métodos da classe
// escavação responsáveis por instanciar uma "escavação", coletar os diamantes e retornar a quantidade de diamantes
// coletados.
class InterfaceTexto {
    Scanner entrada;

    public InterfaceTexto() {
        this.entrada = new Scanner(System.in);
    }

    public void executar() {
        int casos = entrada.nextInt();
        String material = "";
        material = entrada.nextLine();

        for (int i = 0; i < casos; i++) {
            material = entrada.nextLine();
            realizaEscavacao(material);
        }
    }

    private void realizaEscavacao(String s) {
        Escavacao escavacao = new Escavacao(s);
        escavacao.procuraDiamantes();
        pln(escavacao.getDiamantes());
    }

    private void pln(int i) {
        System.out.println(i);
    }
}