# Day One Advent of Code
#
# Benjamin Larkey
#
# 12/2/24
#

'''
As each location is checked, they will mark it on their list with a star. They figure the Chief Historian must be in one of the first fifty places they'll look, 
so in order to save Christmas, you need to help them get fifty stars on their list before Santa takes off on December 25th.
'''

# load both columns into two seperate lists

column_one = []
column_two = []

ids = open("../Assets/24one.txt", "r")

output = ids.read()

lines = output.strip().split("\n")

for line in lines:
    numbers = line.split()
    column_one.append(int(numbers[0]))
    column_two.append(int(numbers[1]))

column_one.sort()
column_two.sort()

total = 0

for i in range(len(column_one)):
    if column_one[i] >= column_two[i]:
        delta = column_one[i] - column_two[i]
    else:
        delta = column_two[i] - column_one[i]

    total += delta

print(total)