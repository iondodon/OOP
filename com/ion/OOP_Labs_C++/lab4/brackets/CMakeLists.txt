cmake_minimum_required(VERSION 3.12)
project(brackets)

set(CMAKE_CXX_STANDARD 14)

add_executable(brackets main.cpp Stack.h Stack.cpp bracketsChecker.h bracketsChecker.cpp)