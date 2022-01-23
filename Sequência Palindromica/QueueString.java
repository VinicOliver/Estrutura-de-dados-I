// Classe destinada a definição de uma lista simplesmente encadeada implementando uma TAD do tipo lista.

public class QueueString {
    protected Link head;

    /*
    Inicia uma fila com referência nula, logo, não há elementos nela e seu tamanho é zero.
    */
    public QueueString() {
        head = null;
    }

    /*
    Método que verifica se a lista está vazia. Para sabermos se a lista está vazia, olhamos se há algum
    elemento na cabeça da lista, ou seja, verificamos se a cabeça está nula. Se sim, o método retorna verdadeiro
    caso não, retorna false.
    */
    public boolean isEmpty() {
        return head == null;
    }

    /*
    Método para inserir um elemento na fila. Sendo uma fila de caracteres, é obrigatório a passagem de um parâ
    metro do tipo char ao método. Utilizamos esse argumento para criar um novo nó para a fila utilizando o constru
    tor da classe Link. Verificamos se a fila está vazia, caso esteja, o elemento será inserido na cabeça. Caso não,
    é percorrida toda a fila via uma estrutura de repetição 'while' até chegar ao último elemento. Ao localizar o
    último elemento, o atributo next desse último elemento irá receber a referência do novo nó.
    */
    public void toQueue(char letter) {
        Link elem = new Link(letter);

        if (isEmpty())
            head = elem;
        else {
            Link aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = elem;
        }
    }

    /*
    Como o TAD é do tipo fila, retiramos pela cabeça da lista. Esse método faz com que a cabeça recebá o elemento
    sequinte que a cabeça anteriormente referenciava e retorna o dado que estava na cabeça.
     */
    public char dequeue() {
        Link aux = head;
        head = aux.next;
        return aux.data;
    }

    /*
    Método length retorna o tamanho da lista, ou seja, a quantidade de elementos contida nela. A maneira que foi
    implementado esse método é percorrer cada nó da lista até chegar o final, e a cada nó percorrido adicionar uma
    unidade a variável local "size", que após percorrida toda a lista, é retornada.
    */
    public int length() {
        int size = 0;
        Link aux = head;
        while (aux != null) {
            size++;
            aux = aux.next;
        }
        return size;
    }
}
