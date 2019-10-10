package com.company;

import java.util.ArrayList;

public class StackArray <Generic> {


    ArrayList<Generic> list = new ArrayList<Generic>();



    public Generic push(Generic data) {

        list.add(0,data);

        return data;

    }

    public Generic pop() {
    Generic returnStatement = list.get(0);
        list.remove(list.get(0));

        return returnStatement;


    }


    public Generic peek()
    {
        return list.get(0);
    }

    public void display()
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println( "I:" + i + " " +list.get(i));
        }
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