/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;
//DO NOT NEED FOR HW!!!!!
/**
 *
 * @author Scott
 */

// Note: You do not need this for your assignment...
//       I included it just because it is awesome! :)

public interface StackInterface {


	public int size();
	public boolean isEmpty();
	public Object top() throws EmptyStackException;
	public Object pop() throws EmptyStackException;
	public void push(Object item);

	
}

