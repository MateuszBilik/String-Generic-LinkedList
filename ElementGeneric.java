public class ElementGeneric <T> {

    private ElementGeneric previous;
    private T present;
    private ElementGeneric next;

    public ElementGeneric (ElementGeneric previous, T present, ElementGeneric next) {
        this.previous = previous;
        this.present = present;
        this.next = next;
    }

    public ElementGeneric getPrevious() {
        return previous;
    }

    public void setPrevious(ElementGeneric previous) {
        this.previous = previous;
    }

    public T getPresent() {
        return present;
    }

    public void setPresent(T present) {
        this.present = present;
    }

    public ElementGeneric getNext() {
        return next;
    }

    public void setNext(ElementGeneric next) {
        this.next = next;
    }
}
