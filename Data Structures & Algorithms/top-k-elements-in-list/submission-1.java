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
        int[] ans = new int[k];
        int index =0;
        for(int i=b.length-1;i>=0 && index<k;i--){
            if(b[i]!= null){
                for(int x: b[i]){
                    ans[index++] = x;
                    if(index==k) break;
                }
            }
        }
        return ans;
        }

    }
