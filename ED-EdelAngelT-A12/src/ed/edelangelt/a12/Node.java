/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.edelangelt.a12;

/**
 *
 * @author LuisGuillermo
 */
public class Node<T> {
    T data;
    Node next;
    
    Node(T d){
        this.data = d;
        this.next = null;//Apunta a nulo
    }
    public void printS(){
        System.out.println(data);
        System.out.println("↓");
    }
    public void print(){
        System.out.print(data + "->");
}
}
