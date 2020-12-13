import java.io.Serializable;

public class GenericLinkedList <T>{

    ElementGeneric start = null;
    ElementGeneric currentElement = null;


    public void add(T everyType) {

        if (start == null) {
            start = new ElementGeneric <T>(null, everyType, null);
            currentElement = start;
        } else {
            ElementGeneric<T> current = start;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            ElementGeneric<T> element = new ElementGeneric(current, everyType, null);
            current.setNext(element);
        }
    }

    public T next() {
        if (currentElement.getNext() != null) {
            currentElement = currentElement.getNext();
            return (T) currentElement.getPresent();
        } else {
            System.out.println("Isn't possible");
            return null;
        }
    }

    public T previous() {
        if (currentElement.getPrevious() != null) {
            currentElement = currentElement.getPrevious();
            return (T) currentElement.getPresent();
        } else {
            System.out.println("Isn't possible");
            return null;
        }
    }

    public boolean hasNext() {
        return currentElement.getNext() != null;
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
            while (current.getNext() != null) {
                current = current.getNext();
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
                return (T) start.getPresent();
            } else {
                int count = 0;
                ElementGeneric<T> current = start;
                while (hasNext(index)) {
                    current = current.getNext();
                    count++;
                    if (count == index) {
                        break;
                    }
                }
                return current.getPresent();
            }
        }
    }
}

















