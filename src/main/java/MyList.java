public interface MyList<T> {
    void add(int index, T element);
    boolean add (T element);
    T get(int index);
    T set(int index, T element);
    T remove(int index);
    boolean remove(Object T);
}
