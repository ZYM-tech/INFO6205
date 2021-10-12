public class HW4_Q3 {
    class MyCircularDeque {
        int[] q;
        int head, tail, size, count, cap;
        public MyCircularDeque(int k) {
            this.q = new int[k+1];
            this.head = this.count = 0;
            this.tail = 1;
            this.cap = k;
            this.size = k+1;
        }
        public boolean insertFront(int value) {
            if (isFull()) return false;
            this.q[this.head] = value;
            this.count++;
            this.head = (this.head - 1 + this.size) % this.size;
            return true;
        }
        public boolean insertLast(int value) {
            if (isFull()) return false;
            this.q[this.tail] = value;
            this.count++;
            this.tail = (this.tail + 1) % this.size;
            return true;
        }
        public boolean deleteFront() {
            if (isEmpty()) return false;
            this.head = (this.head + 1) % this.size;
            this.count--;
            return true;
        }
        public boolean deleteLast() {
            if (isEmpty()) return false;
            this.tail = (this.tail - 1 + this.size) % this.size;
            this.count--;
            return true;
        }
        public int getFront() {
            if (isEmpty()) return -1;
            int id = (this.head + 1) % this.size;
            return this.q[id];
        }
        public int getRear() {
            if (isEmpty()) return -1;
            int id = (this.tail - 1 + this.size) % this.size;
            return this.q[id];
        }
        public boolean isEmpty() {
            return this.count == 0;
        }
        public boolean isFull() {
            return this.count == this.cap;
        }
    }
}
