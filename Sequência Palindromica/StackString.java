// Classe destinada a definição de uma lista simplesmente encadeada implementando uma TAD do tipo pilha.

public class StackString {
    private Link top;

    // Inicia uma pilha com referência nula, logo, não há elementos nela e seu tamanho é zero.//
    public StackString() {
        top = null;
    }

    /*
    Método que verifica se a lista está vazia. Para sabermos se a lista está vazia, olhamos se há algum
    elemento na cabeça da lista, ou seja, verificamos se a cabeça está nula. Se sim, o método retorna verdadeiro
    caso não, retorna false.
    */
    public boolean isEmpty() {
        return top == null;
    }

    /*
    Método para inserir um elemento na pilha. Sendo uma pilha de caracteres, é obrigatório a passagem de um parâ
    metro do tipo char ao método. Utilizamos esse argumento para criar um novo nó para a pilha utilizando o constru
    tor da classe Link. Verificamos se a pilha está vazia, caso esteja, o elemento será inserido na cabeça. Caso não,
    o atributo next do novo nó apontará para o elemento que está no topo da pilha, e esse novo elemento será
    inserido no topo, seguindo as regras de inserção de uma pilha, onde os elementos são inseridos sempre na frente
    dos que já estão na pilha.
    */
    public void push(char c) {
        Link elem = new Link(c);

        if(isEmpty())
            top = elem;
        else{
            elem.next = top;
            top = elem;
        }
    }

    /*
    Sendo do tipo pilha, retiramos sempre pela cabeça. Criamos uma variável local 'aux' que recebe o elemento
    que está no topo, e que será retirado da pilha. Então, fazemos com que topo aponte para aux.next, que é o segundo
    elemento da pilha elemento, dessa maneira, estamos fazendo topo deixar de apontar para um objeto (nesse caso aux)
    e apontar para outro. Assim, retiramos um elemento da pilha, e retornamos o dado que estava armazenado naquela
    referência.
    */
    public char pop() {
        Link aux = top;
        top = aux.next;
        return aux.data;
    }

    // Nesse método, retornamos o valor do dado que está armazenado no link que está no topo da pilha.//
    public char peek() {
        return top.data;
    }

    /*
    Método length retorna o tamanho da pilha, ou seja, a quantidade de elementos contida nela. A maneira que foi
    implementado esse método é percorrer cada nó da lista até chegar o final, e a cada nó percorrido adicionar uma
    unidade a variável local "length", que após percorrida toda a lista, é retornada.
    */
    public int length() {
        int length = 0;
        Link aux = top;
        while (aux != null) {
            length++;
            aux = aux.next;
        }
        return length;
    }
}
