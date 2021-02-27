#ifndef BRACKETS_STACK_H
#define BRACKETS_STACK_H

class Stack{
private:
    struct node{
        char para;
        node *next;
        node *prev;
    }*top;

public:
    Stack();
    bool isEmpty();
    void add(char);
    void pop();
    char getTop();
};

#endif //BRACKETS_STACK_H
