class LRUCache {
    Map<Integer, Integer> map;
    LinkedList<Integer> order;
    int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        map = new HashMap<>();
        order = new LinkedList<>();
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        if (order.getLast() != key) {
            order.remove((Integer) key);
            order.add(key);
        }
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            order.remove((Integer)key);
        }
        if (order.size() >= cap) {
            int removed = order.poll();
            map.remove(removed);
        }
        order.add(key);
        map.put(key, value);
    }
    // Map<Integer, Integer> map;
    // Map<Integer, Integer> index;
    // LinkedList<Integer> order;
    // int cap;

    // public LRUCache(int capacity) {
    //     cap = capacity;
    //     map = new HashMap<>();
    //     index = new HashMap<>();
    //     order = new LinkedList<>();
    // }
    
    // public int get(int key) {
    //     if (!map.containsKey(key)) {
    //         return -1;
    //     }
    //     if (index.get(key) < order.size() - 1) {
    //         order.remove(index.get(key));
    //         order.add(key);
    //         index.put(key, order.size() - 1);
    //     }
    //     System.out.println("get:" + order);
    //     return map.get(key);
    // }
    
    // public void put(int key, int value) {
    //     if (map.size() >= cap) {
    //         int removed = order.poll();
    //         map.remove(removed);
    //         index.remove(removed);
    //     }
    //     if (map.containsKey(key)) {
    //         int i = index.get(key);
    //         order.remove(i);
    //     }
    //     order.add(key);
    //     index.put(key, order.size() - 1);
    //     map.put(key, value);
    //     System.out.println("put:" + order);
    // }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */