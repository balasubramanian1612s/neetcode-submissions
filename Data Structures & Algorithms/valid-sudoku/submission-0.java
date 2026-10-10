class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new Set[9];
        Set<Character>[] cols = new Set[9];
        Set<Character>[] boxes = new Set[9];

        for(int i=0; i<9; i++){
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                int boxIndex = (i / 3) * 3 + (j / 3);
                if(board[i][j]!='.'){
                    if(rows[i].contains(board[i][j])){
                        return false;
                    }

                    if(cols[j].contains(board[i][j])){
                        return false;
                    }

                    if(boxes[boxIndex].contains(board[i][j])){
                        return false;
                    }

                    rows[i].add(board[i][j]);
                    cols[j].add(board[i][j]);
                    boxes[boxIndex].add(board[i][j]);      
                }
            }
        }

        return true;
    }
}
