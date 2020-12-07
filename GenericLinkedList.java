import java.io.Serializable;

public class GenericLinkedList <T>{

    ElementGeneric start = null;
    int whereYouAre = -1;

    public void add(T everyType) {

        if (start == null) {
            start = new ElementGeneric <T>(null, everyType, null);
        } else {
            ElementGeneric<T> current = start;
            while (current.next != null) {
                current = current.next;
            }
            ElementGeneric<T> element = new ElementGeneric(current, everyType, null);
            current.next = element;
        }
    }

    public T next() {
        if (whereYouAre + 1 < size()) {
            whereYouAre++;
            return get(whereYouAre);
        } else {
            System.out.println("Isn't possible");
            return null;
        }
    }

    public T previous() {
        if (whereYouAre + 1 < size()) {
            whereYouAre--;
            return get(whereYouAre);
        } else {
            System.out.println("Isn't possible");
            return null;
        }
    }

    public boolean hasNext() {
        return whereYouAre + 1 < size();
    }

    public boolean hasNext(int index) {
        return index + 1 < size();
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

    public T get(int index) {
        if (start == null) {
            System.out.println("LinkedList is empty");
            return null;
        } else {
            if (index == 0) {
                return (T) start.present;
            } else {
                int count = 0;
                ElementGeneric<T> current = start;
                while (hasNext(index)) {
                    current = current.next;
                    count++;
                    if (count == index) {
                        break;
                    }
                }
                return current.present;
            }
        }
    }
}

















