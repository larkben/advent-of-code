# Day Two Advent of Code
#
# Benjamin Larkey
#
# 12/2/24
#

'''
1. columns should be either all increasing or all decreasing
2. any two adjacent levels differ by at least ONE and at most THREE
'''

# open file
ids = open("../Assets/24two.txt", "r")

new_safe_reports = 0
safe_reports = 0 

output = ids.read()

output_lines = output.splitlines()

# part one
for i in output_lines:
    # seperate out the values
    values = list(map(int, i.split()))

    positive = False
    negative = False

    isSafe = True

    #print(values)

    deltas = []

    for x in range(len(values) - 1):
        #print(values[x])

        delta = values[x + 1] - values[x] 

        if delta > 0:
            positive = True
            if negative == True:
                isSafe = False
                break
        else:
            negative = True
            if positive == True:
                isSafe = False
                break

        # add value
        deltas.append(delta)

    # check distance
    for y in deltas:
        if abs(y) >= 1 and abs(y) <= 3:
            continue

        else:
            isSafe = False

    if isSafe:
        safe_reports += 1

# part two - checking for one replacement
# ---------------------------------------
# need to be completed

print(safe_reports)

