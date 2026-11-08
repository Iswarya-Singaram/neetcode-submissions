class Solution {
    public int[] countBits(int n) {
        List<Integer> a = new ArrayList<>();
        a.add(0); 
        for(int i=1;i<=n;i++){
            int num =i;
            int res =0;
            while(num!=0){
                num = num & (num-1);
                res++;
            }
            a.add(res);
        }
        int[] arr = new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i] = a.get(i);
        }
        return arr;
    }
}
