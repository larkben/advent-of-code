# Day Three Advent of Code
#
# Benjamin Larkey
#
# 12/4/24
#
# Looks like this one will require some matching script

import re # regex in python for pattern searching

# open file
ids = open("../Assets/24three.txt", "r")

output = ids.read()

# regular expression search

matches = re.findall(r"mul\((\d{1,3}),(\d{1,3})\)", output)

#print(x)

num = 0
total = 0

for match in matches:
    first = match[num].strip()
    second = match[num + 1].strip()
    
    product = int(first) * int(second)
    #print(product)
    total += product

print(total)






