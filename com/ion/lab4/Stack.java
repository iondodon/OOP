package com.ion.lab4;

class Stack{
    private char[] list;
    private int last;

    Stack(int maxSize){
        last = -1;
        list = new char[maxSize];
    }

    public char getTopElement(){
        return list[last];
    }

    public void addElement(char ch){
        last++;
        list[last] = ch;
    }

    public boolean isEmpty(){
        return last == -1;
    }

    public void popTop(){
        list[last] = 0;
        last--;
    }
}
