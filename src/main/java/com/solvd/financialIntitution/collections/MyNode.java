package com.solvd.financialIntitution.collections;

public class MyNode {
    MyNode next;
    Object element;

    public MyNode(Object elementValue){
        next = null;
        element = elementValue;
    }

    public MyNode(Object elementValue, MyNode nextValue){
        next = nextValue;
        element = elementValue;
    }

    public Object getElement(){
        return element;
    }

    public void setElement(Object elementValue){
    element = elementValue;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode nextValue) {
        next = nextValue;
    }
}
