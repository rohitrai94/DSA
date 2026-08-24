class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // 2. Create buckets
        List<Character>[] buckets = new List[n+ 1];

        for (char ch : freq.keySet()) {
            int count = freq.get(ch);

            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }

            buckets[count].add(ch);
        }

        // 3. Take elements from highest frequency
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {

            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                   for(int j =0; j<i; j++){
                    sb.append(c);
                   }
                }
            }
        }

        return sb.toString();
    }
}