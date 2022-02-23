#!/usr/bin/env python
# coding=utf-8
import json
import string

stringOfJsonData = '{"name": "Zophie", "isCat": true, "miceCaught": 0, "felineIQ" : null}'
print stringOfJsonData
jasonDataAsPythonValue = json.loads(stringOfJsonData)

print jasonDataAsPythonValue
print "Hello Python"


print jasonDataAsPythonValue[0]
