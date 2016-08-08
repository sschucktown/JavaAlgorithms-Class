/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.tree.practice;


public class Main {

	public static void main(String[] args) {
		
		
		BST t = new BST();
		t.insert("elephant");
		t.insert("cat");
		t.insert("frog");
		t.insert("fish");
		t.insert("dog");
		t.insert("giraffe");
		t.inOrder(t.getRoot());
                t.postOrder(t.getRoot());
                t.preOrder(t.getRoot());
                System.out.println(t.count(t.getRoot()));

	}

}
