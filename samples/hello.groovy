#! /bin/sh
'''':
exec groovy "$0" 2>/dev/null
'''
import static libs.Lib.hello

println hello("from Groovy")

