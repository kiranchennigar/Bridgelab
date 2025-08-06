public class MyArray {
    private int[] data;
    private int size;        
    private int capacity;    

    public MyArray() {
        capacity = 4;        
        data = new int[capacity];
        size = 0;
    }

    public void add(int element) {
        if (size == capacity) {
            resize(); 
        }
        data[size++] = element;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index: " + index);
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    private void resize() {
        capacity *= 2;
        int[] newData = new int[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i]; // copy old data
        }
        data = newData;
    }

    public void print() {
        System.out.print("MyArray contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyArray arr = new MyArray();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50); 

        arr.print(); 

        System.out.println("Element at index 2: " + arr.get(2));
        System.out.println("Size: " + arr.size());
    }
}
