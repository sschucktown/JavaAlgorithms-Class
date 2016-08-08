
package eightpuzzle;


public class BoardState implements Comparable<BoardState>
{
    public int board[];
	public BoardState parent;
	public int g;
	public int h;
	
	public BoardState(int board[],BoardState parent){
		this.board = new int[9];
		for(int i=0;i<9;i++) this.board[i] = board[i];
		this.parent = parent;
	}
	
	public int compareTo(BoardState boardState){
		return (this.g+this.h) - (boardState.g + boardState.h);
	}
	
	public boolean equals(BoardState boardState){
		for(int i=0;i<9;i++){
			if(this.board[i] != boardState.board[i]) return false;
		}
		return true;
	}
	
	public String toString(){
		String result = "";
		for(int i=0;i<9;i++){
			result += Integer.toString(this.board[i]);
			result += " ";
			if(i==2 || i==5) result += "\n";
		}
		result += "\n";
		return result;
	}
}
