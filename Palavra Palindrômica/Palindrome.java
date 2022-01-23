// Classe que implementa uma pilha de caracteres.

import java.util.Locale;

public class Palindrome {
    private String word;
    private String unstackedword;
    private StackString stack;

    public Palindrome() {
        stack = new StackString();
    }

    /*
    Esse método é utilizado para receber e separar cada letra da string passada, e inserir cada letra em um nó
    da pilha. Isso é feito recebendo a string como parâmetro no método. O argumento passado é armazena no atributo
    'word'. Na estrutura 'for' percorremos todos os caracteres da string passada, acessando cada caracter via o
    método 'charAt()' da classe String. Obtido o caracter, inserimos na pilha e imprimimos uma mensagem informando
    qual letra estamos empilhando.
    */
    public void store(String s) {
        this.word = s.toLowerCase().replace(" ", "");
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
            System.out.println("Empilhando: " + stack.peek());
        }
    }

    /*
    Esse método é utilizado para desempilhar a pilha de caracteres. Para isso, criamos uma variável local chamada
    'palavra' que irá receber cada caracter retirado da pilha. Na estrutura de repetição 'while' percorremos toda a
    pilha até a mesma estar vazia. A cada caracter obtido, atribuímos esse caracter a variável 'palavra' e enviamos
    uma mensagem de qual letrta está sendo retirada da pilha. Após envaziar toda a pilha, atribuímos o resultado
    obtido de concatenação de caracteres armazenado em 'palavra' ao atributo 'unstackedword'.
    */
    public void unstack() {
        String palavra = "";
        while (!(stack.isEmpty())) {
            palavra += stack.peek();
            System.out.println("Desempilhando: " + stack.pop());
        }
        unstackedword = palavra;
    }

    /*
    Método para verificar se uma palavra é palindrôme. É necessário passar uma string para
    o método. No corpo do método, é chamado o método store() e passado como argumento a string. Em seguida,
    é chamado unstack(). Feito isso, a estrutura if-else decide se a sequencia é palindrômica ou não, comparando a
    string passado no início com a que foi obtido após desempilhar a pilha de caracteres.
    */
    public void isPalindrome(String s) {
        store(s);
        unstack();
        if(word.equals(unstackedword))
            System.out.println("Palíndromo? " + true);
        else
            System.out.println("Palíndromo? " + false);
    }
}