class Solution {
    public boolean isValidSudoku(char[][] board) {
            int[] r = new int[9];
            int[] c = new int[9];
            int[] s = new int[9];
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    if(board[i][j]=='.') continue;
                    int val = board[i][j] - '1';
                    if((r[i] & (1<<val)) > 0 || (c[j] &(1<<val)) >0 || ((s[(i/3)*3+(j/3)]&(1<<val))) > 0){
                        return false;
                    }
                    r[i] |= (1<<val);
                    c[j] |= (1<<val);
                    s[(i/3)*3+(j/3)] |=(1<<val);
                }
            }
            return true;

    }
}
