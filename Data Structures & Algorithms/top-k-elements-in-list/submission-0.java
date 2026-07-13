class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] b = new ArrayList[nums.length + 1];
        for(int x: map.keySet()){
            int freq = map.get(x);
            if(b[freq] == null){
                b[freq] = new ArrayList<>();
            }
            b[freq].add(x);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=nums.length; i>=0;i--){
            if(b[i]!= null){
                for(int x : b[i]){
                    res.add(x);
                    if(res.size() == k)
                    break;
                }
            }
            if(res.size() == k)
            break;
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = res.get(i);
        }
        return ans;

        }

    }
