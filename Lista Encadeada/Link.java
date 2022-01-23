public class Link {
    protected Link next;
    protected Product product;

    public Link(Product product) {
        this.product = product;
        this.next = null;
    }
}
