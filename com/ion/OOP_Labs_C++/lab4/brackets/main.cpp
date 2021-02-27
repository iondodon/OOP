#include <fstream>
#include <string>
#include "bracketsChecker.h"

int main() {
    std::ifstream infile("infile.txt");
    std::string exp;

    bracketsChecker brkChecker;

    while(getline(infile, exp)){
        printf("%d\n", brkChecker.goodBracketsExpression(exp));
    }

    infile.close();
    return 0;
}