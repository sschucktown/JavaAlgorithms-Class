
package eightpuzzle;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class EightPuzzle
{
    
    public int goalState[];
	public BoardState finalState;
	int childrenNum;
	
    public EightPuzzle()//constructor
    {
		Scanner myScan = new Scanner(System.in);
        goalState = new int[9];
        System.out.println("Please enter the goal state: ");
        for(int i = 0;i < 9; i++)
        {
            goalState[i] = myScan.nextInt();
        }
        while(!checkReachable(goalState)){
			System.out.println("This goal is not reachable. Please enter a new goal state:");
			for(int i = 0;i < 9; i++)
			{
				goalState[i] = myScan.nextInt();
			}
		}
		System.out.println("");
		int initialArr[] = {0,1,2,3,4,5,6,7,8}; 
		BoardState initialState = new BoardState(initialArr,null);
		initialState.g = 0;
		initialState.h = manhattan(initialState.board,goalState);
		
		finalState = new BoardState(goalState,null);
		finalState.g = 0;
		finalState.h = 0;
		
		solve(initialState);
		
    }
    
    public boolean checkReachable(int [] goalState)
    {
        boolean result = false;
        int inversionCount = 0;
        for(int i=0; i<9; i++)
        {
            for (int j=i+1; j<9; j++)
            if(goalState[i] > goalState[j] && goalState[i]!=0 && goalState[j]!=0)
            {
                inversionCount++;
            }
        }
        if(inversionCount % 2 == 0)
        {
            result = true;
        }
        return result;
    }
	
    public void solve(BoardState initialState)
    {
		PriorityQueue priorityQueue = new PriorityQueue();
		priorityQueue.priorityEnqueue(initialState);
		
		BoardState currentState = null;
		while(!priorityQueue.isEmpty()){
			currentState = (BoardState) priorityQueue.dequeue();
			//System.out.println(currentState);
			if(currentState.equals(finalState)) break;
			LinkedList children = makeChildren(currentState);
			while(childrenNum-->0){
				if(!initialState.equals(children.getHead())) priorityQueue.priorityEnqueue((BoardState)children.removeFront());
			}
		}
		
		printPath(currentState);
		return;
    }
    
    public void printPath(BoardState state)
    {
		if(state == null) return;
		printPath(state.parent);
		System.out.println(state);
    }
    
    public LinkedList makeChildren(BoardState boardState)
    {
        LinkedList result = new LinkedList();
		int index = 0;
		while(boardState.board[index] != 0) index++;
		int row = index/3;
		int col = index%3;
		childrenNum = 0;
		if(row+1>=0 && row+1<=2){
			BoardState child = new BoardState(boardState.board,boardState);
			child.board[index] = child.board[index+3];
			child.board[index+3] = 0;
			child.g = boardState.g + 1;
			child.h = manhattan(child.board,goalState);
			result.insertBack(child);
			childrenNum++;
		}
		if(row-1>=0 && row-1<=2){
			BoardState child = new BoardState(boardState.board,boardState);
			child.board[index] = child.board[index-3];
			child.board[index-3] = 0;
			child.g = boardState.g + 1;
			child.h = manhattan(child.board,goalState);
			result.insertBack(child);
			childrenNum++;
		}
		if(col+1>=0 && col+1<=2){
			BoardState child = new BoardState(boardState.board,boardState);
			child.board[index] = child.board[index+1];
			child.board[index+1] = 0;
			child.g = boardState.g + 1;
			child.h = manhattan(child.board,goalState);
			result.insertBack(child);
			childrenNum++;
		}
		if(col-1>=0 && col-1<=2){
			BoardState child = new BoardState(boardState.board,boardState);
			child.board[index] = child.board[index-1];
			child.board[index-1] = 0;
			child.g = boardState.g + 1;
			child.h = manhattan(child.board,goalState);
			result.insertBack(child);
			childrenNum++;
		}
        return result;
    }
    
    public int manhattan(int[] firstState, int[] secondState)
    {
        int manhattanDist = 0;
		for(int i=0;i<9;i++){
			int indexInSecond;
			if(firstState[i]==0) continue;
			int j = 0;
			while(firstState[i] != secondState[j]) j++;
			int row1 = i/3;
			int col1 = i%3;
			int row2 = j/3;
			int col2 = j%3;
			manhattanDist += (Math.abs(row1 - row2) + Math.abs(col1 - col2));
		}
		return manhattanDist;
    }
	
	
    
}
