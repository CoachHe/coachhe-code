#!/usr/bin/env python
# coding=utf-8

import re

phoneNumRegex = re.compile(r'\d\d\d-\d\d\d-\d\d\d\d')
# 创建了一个Regex对象

mo = phoneNumRegex.search('My number is 415-555-4242.')
print "Phone number found: ", mo.group()   # 在mo变量上调用group()，返回匹配的结果
print "Phone number found: ", mo    # 在这输出的是错误的结果，只是匹配结果，而不是具体的


pattern = re.compile(r'\"([^|]+)\n([^|]+)\"')
x = "{\"code\":\"SIGN_ERROR\",\"message\":\"签名信息非法\"}"
mm = pattern.search(x)
print mm.group()



