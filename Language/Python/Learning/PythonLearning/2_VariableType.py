#!/usr/bin/env python
# -*- coding: UTF-8 -*-

# 变量赋值
counter = 100  # 赋值整型变量
miles = 1000.0 # 浮点型
name = "John"  # 字符串

print(counter)
print(miles)
print(name)

# 多个变量赋值
a = b = c = 1
d, e, f = 1, 2, "John"
print(a,b,c,d,e,f)

# 可以使用del来删除一些对象的引用
del a
# print(a) #这里会报错，因为a被删除了
a = 2
print(a)


# python字符串
s = "abcdef"
str = s[1:5]
print(str)
# 实例
string = "Hello World"
print(string)
print(string[0])            # 第0个字符H
print(string[2:5])
print(string[2:])
print(string * 2)           # 输出两次Hello World
print(string + "TEST")
print(string[1:8:3])        # 在第1个字符和第8个字符之间每隔3个字符输出一次

# 列表
list = ['runoob', 786, 2.23, 'John', 70.2]
tinylist = [123, 'john']
print(list)
print(list[0])
print(list[1:3])
print(list[2:])
print(tinylist * 2)
print(list + tinylist)

# 元祖 相当于只读列表
tuple = ( 'runoob', 786, 2.23, 'john', 70.2)
tinytuple = (123, 'john')
print(tuple)
print(tuple[0])
print(tuple[1:3])
print(tuple[2:])
print(tinytuple * 2)
print(tuple + tinytuple)

# 字典 字典和列表的区别在于：字典中的元素是通过键来存取的，而不是通过偏移存取的
dict = {}
dict['one'] = "This is one"
dict[2] = "This is two"
tinydict = {"name":"john", "code":6734, "dept":"sales"}
print(dict['one'])
print(dict[2])
print(tinydict)
print(tinydict.keys())
print(tinydict.values())

