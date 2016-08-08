/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Scott
 */
public class Main {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("list is empty: "+ list.isEmpty());
        System.out.println("list is: " + list);

        list.insert(new Integer(1));
        list.insert(new Integer(2));
        list.insert(new Integer(3));

        System.out.println("list is: " + list);


        System.out.println("found 4 in list: " + (list.find(new Integer(4))!= null));
        System.out.println("found 2 in list: " + (list.find(new Integer(2)) != null));


        list.remove(new Integer(2));
        System.out.println("list is empty: "+ list.isEmpty());
        System.out.println("list is: " + list);


        list.remove(new Integer(1));
        System.out.println("list is empty: "+ list.isEmpty());
        System.out.println("list is: " + list);

        list.remove(new Integer(3));
        System.out.println("list is empty: "+ list.isEmpty());
        System.out.println("list is: " + list);








    }
}
