public class Main {
    public static void main(String[] args) {
        Ordenacao t = new Ordenacao(10);

        // Teste do método para preencher um vetor de 1 posições
        t.fillVector();
        // Imprimindo os valores do vetor.
        for (int i: t.getVector()) {
            System.out.println(i);
        }

        // Teste do método bubble sort para o vetor de 10 posições. Imprimido o vetor ordenado
        for (int i: t.bubbleSort(t.getVector())) {
            System.out.println(i);
        }

        // Teste do método selection sort para o vetor de 10 posições. Imprimido o vetor ordenado
        for (int i: t.selectionSort(t.getVector())) {
            System.out.println(i);
        }

        // Definindo e preenchendo um vetor de Strings de 6 posições
        String[] s = new String[6];

        s[0] = "Beltrano";
        s[1] = "Ciclano";
        s[2] = "Humberto";
        s[3] = "Doisberto";
        s[4] = "Gertudres";
        s[5] = "Pafûncia";

        // Teste do método de ordenação via insertion Sort. Imprimido o vetor de Strings ordenado.
        for (String i: t.insertionSort(s)) {
            System.out.println(i);
        }

        // Teste da busca binária, utilizando um vetor de 10 posições, e ordenando o mesmo via selection sort.
        // Nesse teste, é realizada a busca pelo número 5. Se existir, retorna 'true'. Caso não, retorna 'false'.
        System.out.println(t.BinarySearch(t.selectionSort(t.getVector()), 5));

        for (int i: t.recursivo(t.getVector(), 1, 0)) {
            System.out.println(i);
        }
    }
}
