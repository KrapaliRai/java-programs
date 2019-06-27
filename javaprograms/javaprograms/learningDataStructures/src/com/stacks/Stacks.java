package com.stacks;

public class Stacks {
    private int maxsize;
    private char stackArray[];
    private int top;

    public Stacks(int size) {
        this.maxsize = size;
        this.stackArray = new char[maxsize];
        this.top = '0';
    }

//    public Stacks(char[] stackArray) {
//        this.stackArray = stackArray;
//    }

    public void push(char j) {
        if(isFull()){
            System.out.println("Not empty do some pop first");
        }
        else{
            top++;
            stackArray[top] = j;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            int old_top = top;
            top--;
            return stackArray[old_top];
        } else {
            System.out.println("Empty stack");
        }

        return '0';
    }

    public char peak() {
        if (!isEmpty())
            return stackArray[top];
        else {
            System.out.println("Stack is empty peak is null");
        }
        return '0';
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return maxsize - 1 == top;
    }
}
