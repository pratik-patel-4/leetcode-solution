class Solution {

    private int size = 9; 

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                char num = board[i][j];
                if(num != '.') {
                    if(!isValidPlacement(board,num,i,j)) {
                       return false;
                   } 
                }
            }
        }
        return true;
    }

    private boolean isValidPlacement(char[][] board, char num, int row, int column) {
        return !isNumInRow(board,num,row,column) && !isNumInColumn(board,num, row, column) && !isNumInBox(board,num, row, column);
    }

    private boolean isNumInRow(char[][] board, char num, int row, int col) {
        for(int i = 0; i < size; i++) {
            if(i == col) {
                continue;
            }
            if(board[row][i] == num) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumInColumn(char[][] board, char num, int row, int col) {
        for(int i = 0; i < size; i++) {
            if(i == row) {
                continue;
            }
            if(board[i][col] == num) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumInBox(char[][] board, char num, int row, int col) {
        int localBoxRow = row - row%3;
        int localBoxCol = col - col%3;

        for(int i = localBoxRow; i < localBoxRow+3; i++) {
            for(int j = localBoxCol; j < localBoxCol+3; j++) {
                if(i == row && j == col) {
                    continue;
                }
                if(board[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    } 
}
