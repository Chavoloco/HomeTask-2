package com.solvd.financial_intitution.collections;

import org.apache.logging.log4j.core.config.Node;

import java.util.*;

public class MyLinkedList {
    private MyNode head;
    private int counter;

    public MyLinkedList() {

    }

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        this.counter++;
    }

    public void decrementCounter() {
        this.counter--;
    }

    public void add(Object element) {

        if (head == null) {
            head = new MyNode(element);
        }

        MyNode nodeTemp = new MyNode(element);
        MyNode currentNode = head;

        if (currentNode != null) {
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
        }
        currentNode.setNext(nodeTemp);
        incrementCounter();
    }

    public void add(Object element, int index) {
        MyNode nodeTemp = new MyNode(element);
        MyNode currentNode = head;

        // Let's check for NPE before iterate over crunchifyCurrent
        if (currentNode != null) {
            // crawl to the requested index or the last element in the list, whichever comes first
            for (int i = 0; i < index && currentNode.getNext() != null; i++) {
                currentNode = currentNode.getNext();
            }
        }

        // set the new node's next-node reference to this node's next-node reference
        nodeTemp.setNext(currentNode.getNext());

        // now set this node's next-node reference to the new node
        currentNode.setNext(nodeTemp);

        // increment the number of elements variable
        incrementCounter();
    }

    public Object get(int index)
    // returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index < 0)
            return null;
        MyNode currentNode = null;
        if (head != null) {
            currentNode = head.getNext();
            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null)
                    return null;

                currentNode = currentNode.getNext();
            }
            return currentNode.getElement();
        }
        return currentNode;

    }

    // removes the element at the specified position in this list.
    public boolean remove(int index) {

        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;

        MyNode currentNode = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null)
                    return false;

                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());

            // decrement the number of elements variable
            decrementCounter();
            return true;

        }
        return false;
    }

    // returns the number of elements in this list.
    public int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";

        if (head != null) {
            MyNode currentNode = head.getNext();
            while (currentNode != null) {
                output += "[" + currentNode.getElement().toString() + "]";
                currentNode = currentNode.getNext();
            }

        }
        return output;
    }

}
