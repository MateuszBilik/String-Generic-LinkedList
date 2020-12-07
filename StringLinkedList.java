import java.io.Serializable;

public class StringLinkedList {

    Element start = null;
    int whereYouAre = -1;

    public void add(String jakiś_tekst) {

        if (start == null) {
            start = new Element(null, jakiś_tekst, null);
        } else {
            Element current = start;
            while (current.next != null) {
                current = current.next;
            }
            Element element = new Element(current, jakiś_tekst, null);
            current.next = element;
        }
    }

    public String next() {
        if (whereYouAre + 1 < size()) {
            whereYouAre++;
            return get(whereYouAre);
        } else {
            System.out.println("Isn't possible");
            return null;
        }
    }

    public String previous() {
        if (whereYouAre + 1 <= size()) {
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

    public int size() {
        if (start == null) {
            return 0;
        } else {
            int count = 1;
            Element current = start;
            while (current.next != null) {
                current = current.next;
                count++;
            }
            return count;
        }
    }

    public String get(int index) {
        if (start == null) {
            return null;
        } else {
            if (index == 0) {
                return start.present;
            } else {
                int count = 0;
                Element current = start;
                while (current.next != null) {
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

















