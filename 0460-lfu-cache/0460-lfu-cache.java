class LFUCache {
    class Node{
        int key,val,freq;
        Node prev, next;
        Node(int key, int val){
            this.key = key;
            this.val = val;
            this.freq = 1;
        }
    }

    class DoublyLL{
            Node head;
            Node tail;
            int size;
            DoublyLL(){
                head = new Node(0,0);
                tail = new Node(0,0);
                head.next = tail;
                tail.prev = head;
                size = 0;
            }

            void add(Node node){
                node.next = head.next;
                node.prev =head;

                head.next.prev = node;
                head.next = node;
                size++;
            }


            void remove(Node node){
                node.prev.next = node.next;
                node.next.prev = node.prev;
                size--;
            }

            Node removeLast(){
                if(size ==0){
                    return null;
                }
                Node node = tail.prev;
                remove(node);
                return node;
            }
    }

    int capacity;
    int minFreq;

    Map<Integer,Node> cache;
    Map<Integer,DoublyLL> freqMap;

   


    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;

        cache = new HashMap<>();
        freqMap = new HashMap<>();
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        Node node = cache.get(key);
        update(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(capacity == 0){
            return;
        }

        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.val = value;
            update(node);
            return;
        }

        if(cache.size() == capacity){
            DoublyLL Dll = freqMap.get(minFreq);
            Node remove = Dll.removeLast();
            cache.remove(remove.key);
        }

        Node node = new Node(key, value);
        minFreq = 1;
        DoublyLL Dll = freqMap.getOrDefault(1,new DoublyLL());
        Dll.add(node);
        freqMap.put(1,Dll);
        cache.put(key,node);
    }
    private void update(Node node){
        int freq = node.freq;
        DoublyLL Dll = freqMap.get(freq);
        Dll.remove(node);
        if(freq == minFreq  && Dll.size == 0){
            minFreq++;
        }
        node.freq++;
        DoublyLL newList = freqMap.getOrDefault(node.freq, new DoublyLL());
        newList.add(node);
        freqMap.put(node.freq, newList);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */