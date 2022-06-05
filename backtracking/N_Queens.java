package backtracking;

public class N_Queens {

	
	public static void placeNQueens(int n){
	
        int[][] board=new int[n][n];
        solve(board, 0);
	}
    
    private static void solve(int[][] board, int col)
    {
        if(col==board.length)
        {
            print(board);
            System.out.println();
            return;
        }
        
        for(int row=0;row<board.length;row++)
        {
            if(validate(board, row, col))
            {
                board[row][col]=1;
            	solve(board, col+1);
                board[row][col]=0;
            }
        }
    }
                      
	private static boolean validate(int[][] board, int row, int col){
        int tempRow=row;
        int tempCol=col;
        while(row>=0 && col>=0){
            if(board[row][col]==1)
                return false;
            
            row--;
            col--;
        }
        
        row=tempRow;
        col=tempCol;
        while(col>=0){
            if(board[row][col]==1)
                return false;
            
            col--;
        }
        
        row=tempRow;
        col=tempCol;
         while (col >= 0 && row < board.length) {
            if (board[row][col] == 1) 
                  return false;
            col--;
            row++;
        }
        return true;
    }
	
    private static void print(int[][] board){
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
                System.out.print(board[i][j]+" ");
        }
    }

}
