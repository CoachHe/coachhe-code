#!/usr/bin/env python
# coding=utf-8

import json, sys

if len(sys.argv) < 2:
    print 'Usage: quickWeather.py location'
    sys.exit()

location = ' '.join(sys.argv[1:])

print location
