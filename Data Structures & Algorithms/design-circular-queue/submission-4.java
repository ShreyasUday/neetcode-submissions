class MyCircularQueue {
    int front = -1;
    int rear = -1;
    int size;
    int[] q;

    public MyCircularQueue(int k) {
        this.size = k;
        q = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;

        if(front == -1) front = 0;

        rear = (rear+1)%size;
        q[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else front = (front+1)%size;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : q[front];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : q[rear];
    }
    
    public boolean isEmpty() {
        if(front == -1) return true;
        else return false;
    }
    
    public boolean isFull() {
        if(front == 0 && rear == size-1) return true;
        if(front == rear+1) return true;
        else return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */