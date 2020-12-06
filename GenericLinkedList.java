public class GenericLinkedList <T>{

    ElementGeneric start = null;

    public void add(T everyType) {

        if (start == null) {
            start = new ElementGeneric(null, everyType, null);
        } else {
            ElementGeneric current = start;
            while (current.next != null) {
                current = current.next;
            }
            ElementGeneric<T> element = new ElementGeneric(current, everyType, null);
            current.next = element;
        }
    }

    public ElementGeneric next(ElementGeneric current) {
        return current.next;
    }

    public boolean hasNext(ElementGeneric current) {
        return current.next != null;
    }

    public int size() {
        if (start == null) {
            return 0;
        } else {
            int count = 1;
            ElementGeneric current = start;
            while (current.next != null) {
                current = current.next;
                count++;
            }
            return count;
        }
    }

    public ElementGeneric get(int index) {
        if (start == null) {
            return null;
        } else {
            if (index == 0) {
                return start;
            } else {
                int count = 0;
                ElementGeneric current = start;
                while (current.next != null) {
                    current = current.next;
                    count++;
                    if (count == index) {
                        break;
                    }
                }
                return current;
            }
        }
    }
}

















