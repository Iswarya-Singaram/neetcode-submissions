class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] p = new int[position.length][2];
        for(int i=0;i<position.length;i++){
            p[i][0] = position[i];
            p[i][1] = speed[i];
        }
        Arrays.sort(p,(a,b)-> Integer.compare(b[0],a[0]));
        Stack<Double> s = new Stack<>();
        for(int[] i: p){
            s.push((double)(target - i[0])/i[1]);
            if(s.size()>=2 && s.peek()<= s.get(s.size()-2))
            s.pop();
        }
        return s.size();
    }
}
