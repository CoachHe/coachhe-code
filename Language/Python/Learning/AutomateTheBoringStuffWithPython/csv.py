#!/usr/bin/env python
# coding=utf-8

import csv
exampleFile = open('example.csv')
exampleReader = csv.reader(exampleFile)
print(exampleReader)
