package lab103;

/**
 *
 * @author Ethan Hedrick
 * @version Jan 26, 2018
 *
 */
public class SinglyLinkedList<E> {

    private static class Node<E> {

        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E e, Node<E> n) {
            this.element = e;
            this.next = n;
            this.prev = null;
        }

        public E getElement() {
            return this.element;
        }

        public Node<E> getNext() {
            return this.next;
        }

        public Node<E> getPrev() {
            return this.prev;
        }

        public void setNext(Node<E> n) {
            this.next = n;
        }
        
        public void setPrev(Node<E> p) {
            this.prev = p;
        }
    }
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
            tail = newest;
            size++;
        }
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }

    public boolean remove(E e) {
        Node<E> nodeBeforeDelete = this.head;
        if (nodeBeforeDelete == null) {
            return false;
        } else if (nodeBeforeDelete.getElement() == e) {
            this.head = this.head.getNext();
            return true;
        }
        while (true) {
            Node<E> next = nodeBeforeDelete.getNext();
            if (next == null) {
                return false;
            } else if (next.getElement() == e) {
                break;
            }
            nodeBeforeDelete = next;
        }
        Node<E> next = nodeBeforeDelete.getNext();
        nodeBeforeDelete.setNext(next.getNext());
        next.setNext(null);
        size--;
        return true;
    }

    public void removeByIndex(int index) {
        if (index == 0) {
            Node<E> q = head;
            head = q.getNext();
            size--;
        } else if ((index > size - 1) || (index < 0)) {
            throw new IndexOutOfBoundsException();
        } else {
            Node<E> currNode = head;
            for (int i = 0; i < index; i++) {
                currNode = currNode.getNext();
            }
            Node temp = currNode;
            currNode = temp.getPrev();
            currNode.setNext(temp.getNext());
            temp = null;
            size--;
        }
    }
    
    public void reset() {
        this.head = null;
    }
    
    public int getFrequencyOf(E e) {
        int frequency = 0;
        Node<E> temp = head;
        for(int i = 0; i < size; i++) {
            if(temp.getElement() == e)
                frequency++;
            temp.getNext();
        }
        return frequency;
    }
    
    public boolean isContained(E e) {
        Node<E> temp = head;
        for(int i = 0; i < size; i++) {
            if(temp.getElement() == e)
                return true;
            temp.getNext();
        }
        return false;
    }
}
