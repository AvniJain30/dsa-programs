public class deleteFromMaxHeap {
    private Integer[] heap;
    private int n;

    public deleteFromMaxHeap(int capacity){
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
            insertResize(2 * heap.length);
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

    public void insertResize(int capacity) {
        Integer arr[] = new Integer[capacity];
        for(int i = 0; i < heap.length; i++){
            arr[i] = heap[i];
        }
        heap = arr;
    }

    public int deleteMax(){
        int max = heap[1];
        swap(1, n);
        n--;
        sink(1);
        heap[n + 1] = null;
        if(n > 0 && (n == (heap.length - 1) / 4)){
            resize(heap.length/2);
        }
        return max;
    }

    private void resize(int capacity) {
        Integer arr[] = new Integer[capacity];
        for(int i = 0; i <= n ; i++){
            arr[i] = heap[i];
        }
        heap = arr;
    }

    private void sink(int k) {
        while(2*k <= n){
            int j = 2*k;
            if(j < n && heap[j] < heap[j+1]){
                j++;
            }
            if(heap[k] >= heap[j]){
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public void swap(int a, int b) {
        int temp = heap[b];
        heap[b] = heap[a];
        heap[a] = temp;
    }

    public void printHeap(){
        for(int i = 1; i <= n; i++){
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args){
        deleteFromMaxHeap m = new deleteFromMaxHeap(3);
        m.insert(4);
        m.insert(5);
        m.insert(2);
        m.insert(6);
        m.insert(1);
        m.insert(3);
        m.printHeap();
        m.deleteMax();
        System.out.println();
        m.printHeap();

    }
}
