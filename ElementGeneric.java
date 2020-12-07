public class ElementGeneric <T> {

    public ElementGeneric previous;
    public T present;
    public ElementGeneric next;

    public ElementGeneric (ElementGeneric previous, T present, ElementGeneric next) {
        this.previous = previous;
        this.present = present;
        this.next = next;
    }
}
