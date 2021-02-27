#include "Stack.h"

Stack::Stack(){
    top = nullptr;
};

void Stack::add(char para) {
    node *new_node = new node;
    new_node->para = para;
    new_node->prev = top;
    new_node->next = nullptr;
    if (!top) {
        top = new_node;
    } else {
        top->next = new_node;
        top = new_node;
    }
}

bool Stack::isEmpty(){
    return top == nullptr;
}

char Stack::getTop(){
    return top->para;
}

void Stack::pop(){
    node *tmp = top;
    top = top->prev;
    delete tmp;
}