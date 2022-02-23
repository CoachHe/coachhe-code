#!/usr/bin/env python
# coding=utf-8

## page 870
class Number:
    def __init__(self, start):
        self.data = start
    def __sub__(self, other): ## 重载了类的减法（-）运算符，让对象可以直接和某个数字相加减
        return Number(self.data - other) # 返回一个新的对象，初始化值为self.data - other

X = Number(5)
Y = X - 2
print(Y.data) ## 5