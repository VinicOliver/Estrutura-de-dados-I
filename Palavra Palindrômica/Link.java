// Nessa classe definimos um nó que pertece a estrutura pilha.

// A classe Link contém o dado do tipo char que irá compôr a pilha e uma referência para o próximo nó da estrutura.

public class Link {
    protected Link next;
    protected char data;

    // No construtor inicializamos um novo nó na estrutura, passando como dado um char e definimos o próximo
    // elemento como nulo.
    public Link(char data) {
        this.data = data;
        next = null;
    }
}
