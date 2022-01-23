public class SequencePalindromic {
    StackString stack;
    QueueString queue;
    private String word1;
    private String word2;

    public SequencePalindromic() {
        stack = new StackString();
        queue = new QueueString();
    }

    /*
    Esse método é utilizado para receber duas strings, separar cada letra de cada uma das strings
    e inserir cada letra em um nó da estrutura apropriada. Isso é feito recebendo as strings como parâmetro no
    método. Os argumentos passados são armazenados nas variáveis 'str1' e 'str2'.
    A string armazenada em 'str1' iremos separar cada caracter e inserir numa pilha.
    A string armazenada em 'str2' iremos separar cada caracter e inserir numa fila.
    Na estrutura 'for' percorremos todos os caracteres de cada string passada, acessando cada caracter via o
    método 'charAt()' da classe String. Obtido o caracter, inserimos na pilha/fila e imprimimos uma mensagem
    informando qual letra estamos empilhando/enfileirando.
    */
    public void store(String s1, String s2) {
        String str1 = s1.toLowerCase().replace(" ", "");
        String str2 = s2.toLowerCase().replace(" ", "");

        for (int i = 0; i < str1.length(); i++) {
            stack.push(str1.charAt(i));
            System.out.println("Empilhando (seq1): " + stack.peek());
        }

        for (int i = 0; i < str2.length(); i++) {
            queue.toQueue(str2.charAt(i));
            System.out.println("Enfileirando (seq2): " + str2.charAt(i));
        }
    }

    /*
    Esse método é utilizado para desempilhar a pilha de caracteres. Para isso, criamos uma variável local chamada
    'palavra' que irá receber cada caracter retirado da pilha. Na estrutura de repetição 'while' percorremos toda a
    pilha até a mesma estar vazia. A cada caracter obtido, atribuímos esse caracter a variável 'palavra'. Após
    envaziar toda a pilha, atribuímos o resultado obtido da concatenação de caracteres armazenado em 'palavra' ao
    atributo 'word1'.
    */
    public void unstack() {
        String palavra = "";
        while (!(stack.isEmpty())) {
            palavra += stack.pop();
        }
        word1 = palavra;
    }

    /*
    Esse método é utilizado para esvaziar uma fila de caracteres. Para isso, criamos uma variável local chamada
    'palavra' que irá receber cada caracter retirado da fila. Na estrutura de repetição 'while' percorremos toda a
    fila até a mesma estar vazia. A cada caracter obtido, atribuímos esse caracter a variável 'palavra'. Após
    envaziar toda a pilha, atribuímos o resultado obtido da concatenação de caracteres armazenado em 'palavra' ao
    atributo 'word2'.
    */
    public void unqueue() {
        String palavra = "";
        while (!(queue.isEmpty())) {
            palavra += queue.dequeue();
        }
        word2 = palavra;
    }

    /*
    Método para verificar se duas palavras são uma sequência palindrômica. É necessário passar duas strings para
    o método. No corpo do método, é chamado o método store() e passado como argumento as duas strings. Em seguida,
    é chamado unstack(). Feito isso, a estrutura if-else decide se a sequencia é palindrômica ou não, comparando as
    duas strings.
    */
    public void isSequencePalindromic(String s1, String s2) {
        store(s1, s2);
        unstack();
        unqueue();

        if(word2.equals(word1))
            System.out.println("Is Sequence palindromic: " + true);
        else
            System.out.println("Is Sequence palindromic: " + false);
    }
}
