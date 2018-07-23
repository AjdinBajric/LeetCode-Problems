
public class WordSearch {

	public static boolean exist(char[][] board, String word) {
		// DFS
		// complexity of this solution is mn * 4^k
		// where m is number of rows
		// n is number of columns
		// k is length of word

		    int rows = board.length;
		    int cols = board[0].length;
		    boolean[][] used = new boolean[rows][cols];
		    
		    for(int r=0; r<rows; r++) {
		        for(int c=0; c<cols; c++) {
		            if(DFS(board, used, word, 0, r, c)) return true;
		        }
		    }
		    
		    return false;
		}

		public static boolean DFS(char[][] board, boolean[][] used, String word, int index, int r, int c) {
		    if(index == word.length()) return true;
		    
		    if(r<0 || r>=board.length || c<0 || c>=board[0].length || used[r][c] || board[r][c] != word.charAt(index)) return false;
		    
		    used[r][c] = true;
		    if(  DFS(board, used, word, index+1, r+1, c)
		      || DFS(board, used, word, index+1, r-1, c)
		      || DFS(board, used, word, index+1, r, c+1)
		      || DFS(board, used, word, index+1, r, c-1)){
		        return true;
		    }
		    used[r][c] = false;
		    
		    return false;
		}

	
	public static void main(String[] args) {
		// first test case
		char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word="ABCCED";
		System.out.println(exist(board,word));
	}

}
