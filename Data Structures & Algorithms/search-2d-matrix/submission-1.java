class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length;
        int COL = matrix[0].length;
        int t=0,b=ROW-1;
        while(t<=b){
            int ro = (t+b)/2;
            if(target > matrix[ro][COL-1])
            t = ro+1;
            else if(target < matrix[ro][0])
            b = ro-1;
            else
            break;
        }
        if(!(t<=b))
        return false;
        int l=0,r = COL-1;
        int ro = (t+b)/2;
        while(l<=r){
        int m = (l+r)/2;
        if(target>matrix[ro][m])
        l = m+1;
        else if (target<matrix[ro][m])
        r = m-1;
        else
        return true;
        }
        return false;
        
    }
}
