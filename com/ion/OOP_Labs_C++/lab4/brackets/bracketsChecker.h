#include <string>
#include "Stack.h"

#ifndef BRACKETS_BRACKETSCHECKER_H
#define BRACKETS_BRACKETSCHECKER_H

class bracketsChecker{
private:
    Stack stk;

public:
    bool goodBracketsExpression(std::string);
};

#endif //BRACKETS_BRACKETSCHECKER_H
