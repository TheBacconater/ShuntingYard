package com.company;


import java.util.LinkedList;

public class StackLL<Generic> {

    MyLinkedList list = new MyLinkedList();


    public Generic push(Generic data) {

        list.addFirst(data);

        return data;

    }

    public Generic pop() {
        Generic returnStatement = (Generic) list.getFirst();
        list.add(list.getLast());
        list.remove(list.getFirst());
        return returnStatement;


    }


    public Generic peek()
    {

        if(list.size() < 1)
        {
            return (Generic) "No List";
        }
        return (Generic) list.getLast();
    }

    public void display()
    {
       list.displayList();
    }

    public int size() {

        return list.size();

    }

    public boolean isEmpty() {

        if(list.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }


}


/*
E push​(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */