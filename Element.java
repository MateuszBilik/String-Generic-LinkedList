public class Element {

    public Element previous;
    public String present;
    public Element next;

    public Element(Element previous, String present, Element next) {
        this.previous = previous;
        this.present = present;
        this.next = next;
    }

    public String getPresent() {
        return present;
    }
}
