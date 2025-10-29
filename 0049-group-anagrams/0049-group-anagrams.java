class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, Integer> index = new HashMap<>();
        int i = 0;
        for (String element : strs) {
            char[] array = element.toCharArray();
            Arrays.sort(array);
            String sorted = new String(array);
            if (!index.containsKey(sorted)) {
                index.put(sorted, i++);
                result.add(new ArrayList<>());
            }
            result.get(index.get(sorted)).add(element);
        }
        return result;
    }
}