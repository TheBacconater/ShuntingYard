package com.company;

    public class MyLinkedList <Generic> {


        Node head = null;


        public boolean add(Generic paramNode) {

            Node nodeNext = new Node(paramNode);

            if (head == null) {
                head = nodeNext;
            }

            else {
                Node traversalNode = head;

                //iterating through the Linked List
                while (traversalNode.next != null) {
                    traversalNode = traversalNode.next;
                }
                traversalNode.next = nodeNext;
            }
            return true;
        }


        public void addFirst(Generic paramNode)
        {
            Node nodeNext = new Node(paramNode);

            if (head == null) {
                head = nodeNext;
            }

            else {
               nodeNext.next = head;
               head = nodeNext;

            }
        }

        public void addLast(Generic paramNode)
        {
            Node nodeNext = new Node(paramNode);

            if (head == null) {

                head = nodeNext;
            }
            else
            {
                Node traversalNode = head;

                while (traversalNode.next != null) {
                    traversalNode = traversalNode.next;
                }
                traversalNode.next = nodeNext;
            }





        }

        public void clear() {

            head = null;

        }

        public Generic getFirst()
        {
            Generic response = (Generic) "No Data Found";
            if (head == null)
            {

                return response;
            }
            else
            {

                return head.getData();

            }
        }

        public Generic getLast()
        {
            Generic response = (Generic) "No Data Found";

            Node traversalNode = head;
            if(head == null)
            {
                return null;
            }
            else
            {
                while(traversalNode.getNext()!=null)
                {
                    traversalNode = traversalNode.next;
                }
                return traversalNode.data;
            }
        }

        public void displayList()
        {
            if (head == null)
            {
                System.out.println(head);
            }
            else
            {
                Node traversalNode = head;

                if(traversalNode.next == null)
                {
                    System.out.println(traversalNode.getData());
                }
                else {

                    while (traversalNode.next != null) {
                        System.out.println(traversalNode.getData());
                        traversalNode = traversalNode.next;
                    }

                    System.out.println(traversalNode.getData());
                }
            }
        }

        public boolean remove(Generic paramData)
        {
            if(head == null)
            {
                return false;
            }

            else
            {
                Node current = head;
                Node previous = head;
                int count = 0;
                while (current.next != null)
                {


                    if(current.data == paramData)
                    {
                        System.out.println("Last Else");
                        System.out.println("You made it to the if statement");

                        if(head.next.data == paramData)
                        {
                            head.next = current.next;
                        }
                        else if (current.next.next == null) //Second-to-last
                        {
                            previous.next = current.next;
                        }
                        else {

                            current.data = current.next.data;
                            current.next = current.next.next;
                        }


                    }

                    previous = current;
                    current = current.next;

                    count = count +1;
                }

                //if the node being removed is the last node.

                if(current.next == null && count == size() -1) {
                    previous.next = null;
                }

            }
            return true;
        }

        public Generic set(int index, Generic paramData)
        {
            Node current = head;

            Node prev = head;

            int listCount = 1;

            if(index> size())
            {

                return (Generic) "Not possible Try again";
            }
            else if (head == null)
            {
                return (Generic) "Not possible Try again";
            }
            else
            {
                if(index == size())
                {
                    while (index != listCount && current.next != null)
                    {
                        prev = current;

                        current = current.next;

                        listCount = listCount + 1;
                    }

                    prev = current;
                    prev.data = paramData;
                }
                else {

                    while(listCount != index)
                    {

                        current = current.next;

                        listCount = listCount + 1;
                    }

                    current.data = paramData;
                }


                return paramData;
            }

        }



        public int size()
        {
            Node current = head;

            if(head == null)
            {
                return 0;
            }
            int size = 0;

            while(current.next != null)
            {

                size++;

                current = current.next;
            }

            size++;

            return size;
        }

        //boolean add(E e) - It is used to append the specified element to the end of a list.      :) Done
        //void addFirst(E e) - It is used to insert the given element at the beginning of a list. :/ I think maybe done
        //void addLast(E e) - It is used to append the given element to the end of a list.
        //void clear() - It is used to remove all the elements from a list.
        //E getFirst() - It is used to return the first element in a list.
        //E getLast()- It is used to return the last element in a list.
        //void displayList() - Print each node item on a new line
        //boolean remove(Object o)- It is used to remove the first occurrence of the specified element in a list.
        //E removeFirst()-It removes and returns the first element from a list.
        //E set(int index, E element)-It replaces the element at the specified position in a list with the specified element.
        //int size()-It is used to return the number of elements in a list. <- Next to do


        class Node{

            Generic data;
            Node next;

            //Constructor for node with a parameter of data.
            public Node(Generic paramData){

                data = paramData;
                next = null;

            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }

            public Generic getData() {
                return data;
            }

            public void setData(Generic paramData) {
                data = paramData;
            }


        }
    }
