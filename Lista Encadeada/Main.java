public class Main {
    public static void main(String[] args) {
        
        // Testando a Lista simplesmente encadeada
        
        ProductQueue produtos = new ProductQueue();
        Product produto1 = new Product(1, "lápis", 12.99);
        Product produto2 = new Product(2, "borracha", 5.99);
        Product produto3 = new Product(3, "Caderno", 29.90);

        produtos.unqueue(produto1);
        produtos.unqueue(produto2);
        System.out.println(produtos.print());
        System.out.println(produtos.find(3));
        produtos.dequeue();
        System.out.println(produtos.print());
        System.out.println(produtos.search(2));
        System.out.println(produtos.replace(produtos.search(2), produto3));
        System.out.println(produtos.print());

        //Testando lista dupalmente encadeada

        ProductDoublyList produtos2 = new ProductDoublyList();
        Product produto4 = new Product(1, "lápis", 12.99);
        Product produto5 = new Product(2, "borracha", 5.99);
        Product produto6 = new Product(3, "Caderno", 29.90);
        produtos2.add(produto4);
        produtos2.add(produto5);
        produtos2.add(produto6);
        System.out.println(produtos2.print());
        produtos2.remove(2);
        System.out.println(produtos2.print());
        produtos2.reverse();
        System.out.println(produtos2.print());
    }
}
