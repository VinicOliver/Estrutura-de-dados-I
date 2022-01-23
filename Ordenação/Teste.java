import java.util.Random;

public class Ordenacao {
    private int dimension;
    private int[] vector;

    /*
    Construtor da classe Teste. Requer um número inteiro que definirá o tamanho do vetor de teste. Este vetor
    será ordenado pelos métodos definidos nessa classe.
    */
    public Ordenacao(int dimension) {
        this.dimension = dimension;
        vector = new int[dimension];
    }

    /*
    Método privado utilizado para gerar número randomicamente, entre 0 e 100. Utiliza a classe Random do
    pacote Java.util.
    */
    private int createRandomNumbers() {
        Random r = new Random();
        return (r.nextInt(100) + 1);
    }

    /*
    Método público que preenche um vetor com tamanho definido por 'dimension', com números inteiros. Esse
    método chama o método createRandomNumbers(), que gera um número aleatório, e insere o mesmo no vetor.
    */
    public void fillVector() {
        for (int i = 0; i < dimension; i++) {
            vector[i] = createRandomNumbers();
        }
    }

    /*
    Método público que retorna o vetor que pertence a determinada instância da classe. Utilizada no método
    Main como parâmetro nos métodos de ordenação.
    */
    public int[] getVector() {
        return vector;
    }

    /*
    Método que ordena os vetor de inteiros pelo método de trocas. Requer como parâmetro um vetor de inteiros,
    e retorna o mesmo vetor, ordenado.
    */
    public int[] bubbleSort(int[] vetor) {
        int i, j, aux;

        for (i = 0; i < vetor.length; i++) {
            for (j = 1; j <= vetor.length - i; j++) {
                if (vetor[j - 1] < vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
        return vetor;
    }
    
    /*
    Método que realiza a ordenação de um vetor de inteiros utlizando recursão. Requer como parâmetros
    o vetor de inteiros a ser ordenado, um inteiro 'i' e um inteiro 'j'. Retorna o vetor de entrada, ordenado.
    */
    public int[] recursivo(int[] vetor, int i, int j) {
        int aux;

        if(i == vetor.length)
            return vetor;
        if(j == vetor.length - i)
            return recursivo(vetor, i + 1, 0);
        if(vetor[j] > vetor[j + 1]){
            aux = vetor[j];
            vetor[j] = vetor[j + 1];
            vetor[j + 1] = aux;
            return recursivo(vetor, i, j + 1);
        } else
            return recursivo(vetor, i, j + 1);
    }

    /*
    Método que ordena os vetor de inteiros pelo método de seleção. Requer como parâmetro um vetor de inteiros,
    e retorna o mesmo vetor, ordenado. Para encontrar o menor valor no vetor, o método selectionSort() chama
    o método getMin() desta mesma classe.
    */
    public int[] selectionSort(int[] vetor) {
        int eleito, posicao;

        for (int i = 0; i < vetor.length - 1; i++) {
            eleito = vetor[i];
            posicao = getMin(vetor, i);

            if(vetor[posicao] < eleito) {
                vetor[i] = vetor[posicao];
                vetor[posicao] = eleito;
            }
        }
        return vetor;
    }

    /*
    Método privado que faz uma busca pelo menor valor em um sub-vetor, e retorna a posição desse valor no vetor.
    Requer um vetor de inteiros e um número inteiro 'i'. O valor 'i' indica a partir de qual índice do vetor
    se iniciará a busca pelo valor mínimo.
    */
    private int getMin(int[] vetor, int i) {
        int menor = vetor[i + 1];
        int posicao = i + 1;

        for(int j = i + 2; j <= vetor.length - 1; j++) {
            if(vetor[j] < menor) {
                posicao = j;
                menor = vetor[j];
            }
        }
        return posicao;
    }

    /*
    Método público que ordena um array de String por inserção. Requer como parâmetro um array de Strings, e
    retorna o mesmo array, ordenado por ordem alfabética.
    */
    public String [] insertionSort (String[] vetor ) {
        int i, j;
        String eleito;

        for (i = 1; i < vetor.length; i++) {
            eleito = vetor [i];
            j = i - 1;

            while ((j >= 0) && (vetor[j].compareToIgnoreCase(eleito)) > 0) {
                vetor [j + 1] = vetor [j];
                j = j -1;
            }
            vetor [j + 1] = eleito ;
        }
        return vetor ;
    }

    /*
    Método que realiza uma busca binária em um vetor de inteiros, e retorna 'true' caso o elemento buscado
    esteja na sequência ou retorna 'false' caso não. Requer um vetor de inteiros e um número inteiro, sendo
    esse último o valor a ser buscado na sequência.
    */
    public boolean BinarySearch(int[] vetor, int elem) {
        int medio;
        int inicio = 0;
        int fim = vetor.length;

        while (inicio <= fim) {
            medio = (inicio + fim) / 2;

            if(elem == vetor[medio])
                return true;
            if(elem > vetor[medio])
                inicio = medio + 1;
            if(elem < vetor[medio])
                fim = medio - 1;
        }
        return false;
    }
}
