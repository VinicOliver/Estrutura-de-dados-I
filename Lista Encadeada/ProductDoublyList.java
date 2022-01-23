// Alocação dinâmica
// Lista duplamente encadeada

public class ProductDoublyList {
    private DoublyList head;

    public ProductDoublyList() {
        head = null;
    }

    // Inserir um objeto na lista
    public void add(Product newElem) {
        DoublyList link = new DoublyList(newElem);

        if(head == null)
            head = link;
        else {
            DoublyList aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = link;
            link.prev = aux;
        }
    }

    // Remove um objeto de qualquer lugar da lista com um id específico
    public void remove(int id) {
        for (DoublyList elem = head; elem.next != null; elem = elem.next) {
            if (elem.product.getId() == id) {
                elem.prev.next = elem.next;
                elem.next.prev = elem.prev;
            }
        }
    }

    // imprime os elementos
    public String print() {
        if(head == null)
            return "Lista vazia \n";
        String lista = "Lista duplamente encadeada\n";
        for (DoublyList aux = head; aux != null; aux = aux.next) {
            lista += "" + aux.product.toString();
        }
        return lista;
    }

    // Inverte os elementos da lista, sem mudar o conteúdo de posição na memória, apenas modificando os apontamentos
    public void reverse() {
        for (DoublyList elem = head; elem.next != null; elem = elem.next) {
            if(elem.prev == null) {
                DoublyList aux = elem.next;
                elem.next = null;
                elem.prev = aux;
            } else if(elem.next == null) {
                DoublyList aux = elem.prev;
                elem.next = aux;
                elem.prev = null;
            } else if(elem.next != null && elem.prev != null) {
                DoublyList aux = elem.next;
                elem.next = elem.prev;
                elem.prev = aux;
            }
        }
    }
}
