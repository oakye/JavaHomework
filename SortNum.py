#!/usr/bin/env python
# Student: Liz Kao X124807
# Module 7, part 2: Sort a list of numbers into ascending order
# return the mean value
# re-order these numbers: 3,9,7,4,0,2

numberlist = [3, 9, 7, 4, 0, 2]
print("Here is the original list of numbers")
print(numberlist)

# sort the list
numberlist.sort()

print("\nNow the list of numbers has been sorted in ascending order")
print(numberlist)

# perform the math to calculate the mean
listsize = len(numberlist)                  
total = sum(numberlist)
listmean = total / listsize

print("The mean of this list of numbers is:", listmean)

