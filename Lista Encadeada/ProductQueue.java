// Lista com alocação dinâmica.
// Lista simplesmente encadeada.
// Lista encadeada do tipo Fila.

public class ProductQueue{
    private Link head;

    public ProductQueue() {
        head = null;
    }

    // inserir um objeto Product na fila;
    public void unqueue(Product p) {
        Link elem = new Link(p);

        if(head == null) {
            head = elem;
        } else {
            Link aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = elem;
        }
    }

    // remover um objeto da fila
    public void dequeue() {
        head = head.next;
    }

    // imprimir os elementos da fila;
    public String print() {
        if(head == null)
            return "Lista vazia \n";
        String lista = "Lista encadeada\n";
        for (Link aux = head; aux != null; aux = aux.next) {
            lista += "" + aux.product.toString();
        }
        return lista;
    }

    //retorna true ou false caso encontre um objeto Product com um id específico.
    public boolean find(int id) {
        boolean res = false;

        if (head == null)
            res = false;
        else {
            for (Link aux = head; aux != null; aux = aux.next) {
                if(aux.product.getId() == id)
                    res = true;
            }
        }
        return res;
    }

    //busca por um Product com id específico e retorna o endereço (Link) do nó com objeto Product.
    public Link search(int id) {
        Link res = null;

        if(head == null)
            res = null;
        else {
            for (Link aux = head; aux != null; aux = aux.next) {
                if(aux.product.getId() == id)
                    res = aux;
            }
        }
        return res;
    }

    // substitui um objeto da lista (isto é, altera data, mas não altera prev e next).
    public boolean replace(Link link, Product elem) {
        int idAlterar = link.product.getId();
        boolean deuCerto = false;

        if(head == null)
            deuCerto = false;
        else {
            for (Link aux = head; aux != null; aux = aux.next) {
                if(aux.product.getId() == idAlterar) {
                    aux.product = elem;
                    deuCerto = true;
                }
            }
        }
        return deuCerto;
    }
}
