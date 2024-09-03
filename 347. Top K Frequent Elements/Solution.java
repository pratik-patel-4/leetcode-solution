class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // 1. create a freq map to store the freq of each element.
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        //2. implement PriorityQueue and store the map Entry: 
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        );

        for(Map.Entry<Integer,Integer> me : freqMap.entrySet()) {
            pq.offer(me);
            
            if(pq.size() > k) {
                pq.poll();
            }
        }


        // 3. we have to select first k elements from that sorted list. 
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }
        
        return ans;
    }
}
