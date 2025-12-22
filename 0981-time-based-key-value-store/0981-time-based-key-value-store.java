class TimeMap {

    private Map<String, List<Pair<Integer, String>>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!timeMap.containsKey(key)) {
            timeMap.put(key, new ArrayList<>());
        }
        timeMap.get(key).add(new Pair<>(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        String result = "";
        if (timeMap.containsKey(key)) {
            if (timeMap.get(key).isEmpty()) {
                return result;
            }
            int len = timeMap.get(key).size();
            int l = 0, r = len - 1;
            while (l <= r) {
                int mid = (r - l) / 2 + l;
                if (timeMap.get(key).get(mid).getKey() > timestamp) {
                    r = mid - 1;
                } else {
                    result = timeMap.get(key).get(mid).getValue();
                    l = mid + 1;
                }
            }
        }
        return result;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */