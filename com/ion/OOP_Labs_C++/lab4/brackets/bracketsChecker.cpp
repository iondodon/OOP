#include "bracketsChecker.h"
#include "Stack.h"
#include <string>

bool bracketsChecker::goodBracketsExpression(std::string exp) {
    for(int i = 0; i < exp.length(); i++) {
        switch(exp[i]){
            case '(':
                stk.add('(');
                break;

            case ')':
                if(stk.getTop() == '('){
                    stk.pop();
                }
                break;

            case '[':
                stk.add('[');
                break;

            case ']':
                if(stk.getTop() == '['){
                    stk.pop();
                }
                break;

            case '{':
                stk.add('{');
                break;

            case '}':
                if(stk.getTop() == '}'){
                    stk.pop();
                }
                break;
        }
    }

    return stk.isEmpty();
}