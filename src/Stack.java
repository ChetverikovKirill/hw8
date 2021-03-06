public class Stack<T> {

    private Element first;

    public <T> void push(T value) {
        first = new Element(value, first);
    }

    public T pop() {
        if (first == null) {
            throw new NullPointerException();
        }
        T result = (T) first.getValue();
        first = first.getNext();
        return result;
    }

    public T peek() {
        if (first == null) {
            throw new NullPointerException();
        }
        return (T) first.getValue();
    }

    public void print(){
        Element current = first;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
