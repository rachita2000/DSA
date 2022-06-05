package backtracking;

public class RathInAMazePath {


	static void ratInAMaze(int maze[][], int n) {
		
        int[][] path = new int[n][n];
        
        printAllPaths(maze, 0, 0, path, n);
	}
    
    
    static void printAllPaths(int[][] maze, int i, int j, int[][] path, int n){
        
        //Goal
        if(i == n-1 && j == n-1){
            path[i][j] = 1;
            for(int r = 0; r < n; r++) {
            	for(int c = 0; c < n; c++) {
                    System.out.print(path[r][c] + " ");
                }
            }
            System.out.println();
            return;
        }
        
        // abandoned
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1)
            return;

        // visited
        path[i][j] = 1;
        
        
        // top
        printAllPaths(maze, i - 1, j, path, n);
        
        // bottum
        printAllPaths(maze, i + 1, j, path, n);  

        // left
        printAllPaths(maze, i, j - 1, path, n);
        
        // right
        printAllPaths(maze, i, j + 1, path, n);  
        
        // going back
        path[i][j] = 0;
    }
    public static void main(String[] args) {
		int[][] maze= {{1,1,0}, {1,1,0}, {0,1,1}};
		ratInAMaze(maze, 3);
	}
}
