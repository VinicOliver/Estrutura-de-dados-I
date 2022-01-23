public class DoublyList {
    protected DoublyList prev;
    protected DoublyList next;
    protected Product product;

    public DoublyList(Product product) {
        this.product = product;
        prev = null;
        next = null;
    }
}
