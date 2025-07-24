class LRUCache {

    class Node{
        Node prev, next;
        int key, value;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    int capacity;
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    HashMap<Integer,Node> map = new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail; // create doubly linked list
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node nn = map.get(key);
            remove(nn); // remove krke aage insert kar denge kyuki vo abhi use huyi hai
            insert(nn);
            return nn.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }

    public void remove(Node nn){
        map.remove(nn.key);
        nn.prev.next = nn.next; 
        nn.next.prev = nn.prev;
    }

    public void insert(Node nn){
        map.put(nn.key, nn);
        nn.next = head.next;
        nn.next.prev = nn;
        head.next = nn;
        nn.prev = head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */