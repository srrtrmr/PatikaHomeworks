package week4;

public class MyList<T> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public MyList(int capacity) {
        this.data = new Object[capacity];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public int getCapacity() {
        return this.data.length;
    }

    public void add(T data) {
        if (size == this.data.length) {
            increaseCapacity();
        }
        this.data[size++] = data;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) this.data[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T removedData = (T) this.data[index];
        System.arraycopy(this.data, index + 1, this.data, index, size - index - 1);
        this.data[--size] = null;
        return removedData;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T previousData = (T) this.data[index];
        this.data[index] = data;
        return previousData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(this.data[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void increaseCapacity() {
        int newCapacity = this.data.length * 2;
        Object[] newData = new Object[newCapacity];
        System.arraycopy(this.data, 0, newData, 0, size);
        this.data = newData;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (this.data[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (this.data[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        System.arraycopy(this.data, 0, array, 0, size);
        return array;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            this.data[i] = null;
        }
        size = 0;
    }

    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            throw new IndexOutOfBoundsException("Invalid index range.");
        }
        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subList.add(this.get(i));
        }
        return subList;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}
