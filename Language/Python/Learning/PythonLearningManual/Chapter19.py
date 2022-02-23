#!/usr/bin/env python
# coding=utf-8

# page 565
print("example in page 565")
def knights():
	title = 'Sir'
	action = (lambda x: title + " " + x)
	return action
act = knights()
msg = act('robin')
print(msg)
print(act)


# page 566
print("example in page 566")
L = [lambda x: x ** 2,
     lambda x: x ** 3,
     lambda x: x ** 4]
for f in L:
	print(f(2))
print(L[0](3))

# page 567
print("example in page 567")
key = 'got'
res = {
	'already': (lambda: 2 + 2),
	'got':     (lambda: 2 * 4),
	'one':     (lambda: 2 ** 6)
}[key]()
print(res)
print(key)
res2 = {
	'already': 4,
	'got':     8,
	'one':     12
}[key]
# 注释：
# 在这里如果冒号(:)之后的是lambda表达式，那代表是一个函数，最后需要[key]()，加上()才能调用
# 如果用res2的写法，那么直接用4，8，12就不是函数，直接[key]就可以了
print(res2)

# page 568
lower = (lambda x, y: x if x < y else y)
lower2 = (lambda x, y: ((x < y) and x) or y)
# 注释：
# 这两种表达方式是等价的
# 因为
# b if a else c <==> ((a and b) or c)
print(lower('aa', 'bb'))
print(lower2('aa', 'bb'))
