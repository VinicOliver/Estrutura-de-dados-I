public class Operacoes {

    /*
    Algoritmo que multiplica um número inteiro de maneira recursiva. O método requer um inteiro 'a' que
    representa a quantidade de vezes que a operação será repetida, ou seja, o multiplicador, e outro inteiro 'b'
    que representa o multiplicando. O método retorna um inteiro, o produto da multiplicação.
    */
    public int multiplicacao(int a, int b) {
        if(a > 1)
            return b + multiplicacao(a - 1, b);
        else
            return b;
    }

    /*
    Algoritmo que divide um número inteiro de maneira recursiva. O método requer um inteiro 'a' que
    representa o dividendo da operação, e outro inteiro 'b' que representa o divisor. O método retorna
    um inteiro, a quantidade de vezes que o divisor cabe dentro do dividendo.
    */
    public int divisao(int a, int b) {
        if((a - b) >= 0)
            return 1 + divisao((a - b), b);
        else
            return 0;
    }
}
