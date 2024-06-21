package myqueue;

public class MyQueue {
    int [] queue ;
    int rear ;
    int front ;
    int size ;

    public MyQueue (int sizeOfArray) {
        queue = new int  [ sizeOfArray] ;
        rear = -1 ;
        front = -1 ;
        size = 0 ;

    }
    public boolean isEmpty() {
        boolean responce = false ;
        if(size == 0) {
            responce = true ;

        }
        return responce ;
    }
    public boolean enqueue (int element) {
        boolean responce = false ;
        if(rear != queue.length - 1) {
            rear ++ ;
            queue [rear] = element ;
            size ++ ;

        }
        return responce ;
    }
    public int dequeue () {
        int responce = 0;
        if(size != 0) {
            front++ ;
            responce = queue[front];
            size --;
        }
        return responce ;
    }
    public int peek() {
        int responce = 0;
        if(!isEmpty()) {
            responce = queue[front + 1] ;

        }
        return responce ;
    }
    public int getSize() {
        return size ;
    }
}
