package com.company;


import com.sun.jdi.IntegerType;

import java.awt.desktop.SystemSleepEvent;
import java.lang.reflect.GenericArrayType;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        postfixToEval("54*3*+1-");
        //   (5*4+3*)-1
        // 1+(2+5)x2

        // postfix 54*3*+1-
/*
        String input = "(5*4+3*)-1";

        QueueArray queue = new QueueArray();

        StackArray stack = new StackArray();



        for (int i = 0; i < input.length() ; i++)
        {
            char inputChar = input.charAt(i);

            if(inputChar =='(')
            {
                stack.push(inputChar);
                System.out.println("push Left Bracket");
                System.out.println("Stack with I at" + i);
                stack.display();
                System.out.println("---------------");
                System.out.println("Queue with I at" + i);
                queue.display();
                System.out.println("---------------");


            }
            else if (inputChar==')')
            {
               System.out.println(stack.size());

                while(!stack.peek().equals('('))
                {
                    queue.enqueue(stack.pop());
                    System.out.println("Popping stuff onto queue");
                }
                stack.pop();
                System.out.println("pop right bracket");
                System.out.println("Stack with I at" + i);
                stack.display();
                System.out.println("---------------");
                System.out.println("Queue with I at" + i);
                queue.display();
                System.out.println("---------------");

            }
            else if(Character.isDigit(inputChar))
            {
                queue.enqueue(inputChar);
                System.out.println("Stack with I at" + i);
                stack.display();
                System.out.println("---------------");
                System.out.println("Queue with I at" + i);
                queue.display();
                System.out.println("---------------");

            }
            else
            {
                char compare;

                if(stack.size() < 1)
                {
                    compare = inputChar;
                }
                else
                {
                    compare = (char) stack.peek();
                }


                char tempChar = inputChar;
                System.out.println("PrecedenceCalc(inputchar) vs PrecedneceCalc precendenceCalc((char) stack.peek())");
                System.out.println(precendenceCalc(inputChar));
            //    System.out.println(stack.peek());
                System.out.println(inputChar);
                System.out.println(precendenceCalc(compare));
                while(precendenceCalc(inputChar) <= precendenceCalc(compare) && stack.size() > 1)
                {
                    System.out.println("Stack incoming");
                    stack.display();
                  queue.enqueue(stack.pop());
                    System.out.println("enqueue stuff until precedence");
                    System.out.println("Queue incomng");
                   queue.display();
                   stack.display();

                }
               stack.push(tempChar);
                System.out.println("precedence");
                System.out.println("Stack with I at" + i);
                stack.display();
                System.out.println("---------------");
                System.out.println("Queue with I at" + i);
                queue.display();
                System.out.println("---------------");


            }


            
        }

        while(!stack.isEmpty())
        {
            queue.enqueue(stack.pop());
            System.out.println("enqueing operators");
        }

       stack.display();
        queue.display();

        // Add stack.display and queue display to see where it goes wrong



 */



/*
        QueueArray arr = new QueueArray();

        arr.enqueue(5);
        arr.enqueue(6);
        arr.enqueue(7);
        arr.enqueue(8);
        arr.display();
        arr.dequeue();
        System.out.println("_____________");
        arr.display();
        System.out.println("_____________");
       System.out.println( arr.peek());
        System.out.println("_____________");
        System.out.println(arr.size());
        System.out.println("_____________");
        System.out.println(arr.isEmpty());

 */












/*
        StackArray arr2 = new StackArray();

        arr2.push(5);
        arr2.push(6);
        arr2.push(7);
        arr2.push(8);
        arr2.display();
        arr2.pop();
        System.out.println("___________");
        arr2.display();
        System.out.println("___________");
        System.out.println(arr2.peek());

 */









/*

       QueueLL arr3 = new QueueLL();

        arr3.enqueue(5);
        arr3.enqueue(6);
        arr3.enqueue(7);
        arr3.enqueue(8);
        arr3.display();
        arr3.dequeue();
        System.out.println("-------------------");
        arr3.display();

 */



      /*  arr3.enqueue(5);
        arr3.enqueue(6);
        arr3.enqueue(7);
        arr3.enqueue(8);
        arr3.display();

       */

/*
        StackLL arr4 = new StackLL();

       arr4.push(5);
       arr4.push(6);
       arr4.push(7);
       arr4.push(8);
       arr4.display();
       arr4.pop();
       System.out.println("--------------------");
       arr4.display();
   // System.out.println(arr4.peek());


 */

/*
        arr4.push(5);
        arr4.push(6);
        arr4.push(7);
        arr4.push(8);
        arr4.display();
        arr4.pop();
        arr4.display();
      System.out.println(arr4.size());

 */









     }

     public static int precendenceCalc(char c)
     {
         switch(c)
         {
             case '+':

             case '-':
             return 1;

             case '/':
             case '*':
                 return 2;
         }
         return -1;
     }

     //  "5 4 * 3 * + 1 - "

     public static StackArray postfixToEval(String postfix)
     {
         StackArray stack = new StackArray();
         QueueArray queue = new QueueArray();

         for(int i = 0; i < postfix.length(); i++)
         {
             String inputString = postfix.substring(i,i+1);
             char inputChar = postfix.charAt(i);

             if(Character.isDigit(inputChar))
             {
                 stack.push(inputChar);
             }
             else
             {
                if(inputChar == '*')
                { //Something wonky here
                    int first = Character.getNumericValue((char)stack.pop());
                    System.out.println("Type: " + stack.pop().getClass());
                    Character temp = (Character) stack.pop();
                    System.out.println("char is: " + temp.getClass());
                   // System.out.println("Peek: " + stack.peek());
                    int second = Character.getDirectionality(temp);
                    int calculation = first * second;
                    stack.push(calculation);
                }
                else if (inputChar == '/')
                {
                    int second = (int) stack.pop();
                    int first = (int) stack.pop();
                    int calculation = first / second;
                    stack.push(calculation);
                }
                else if (inputChar == '+')
                {
                    int second = (int) stack.pop();
                    int first = (int) stack.pop();
                    int calculation = first + second;
                    stack.push(calculation);
                }
                else
                {
                    int second = (int) stack.pop();
                    int first = (int) stack.pop();
                    int calculation = first - second;
                    stack.push(calculation);
                }
             }

         }
         return stack;
     }
}

