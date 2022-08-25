public class insertInMaxHeap {
    private Integer[] heap;
    private int n;

    public insertInMaxHeap(int capacity){
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public void insert(int x){
        if(n == heap.length - 1){
            resize(2 * heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    public void swim(int k) {
        while(k > 1 && heap[k/2] < heap[k]){
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2;
        }
    }

    public void resize(int capacity) {
        Integer arr[] = new Integer[capacity];
        for(int i = 0; i < heap.length; i++){
            arr[i] = heap[i];
        }
        heap = arr;
    }

    public void printHeap(){
        for(int i = 1; i <= n; i++){
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args){
        insertInMaxHeap m = new insertInMaxHeap(3);
        m.insert(4);
        m.insert(5);
        m.insert(2);
        m.insert(6);
        m.insert(1);
        m.insert(3);
        System.out.println(m.size());
        m.printHeap();
    }
}
