#!/usr/bin/env python
# Student: Liz K-- --------
#
# Module 8, part 2: Bubble sort
#
# (1) Sort any list of comma-separated integers that the user inputs into ascending order. 
# (2) Each time the sort reaches the end of the list your program should
# display the number of the pass and the list as it is currently sorted, 
# (3) Once the sort is complete, the original unsorted list and the sorted list 
# should be displayed along with the number of passes it required to 
# completely sort the list

def bubble_sort(items):
    changes = passes = 0
    last = len(items)
    swapped = True

    while swapped:
        swapped = False
        for j in range(1, last):
            if items[j - 1] > items[j]:
                items[j], items[j - 1] = items[j - 1], items[j]  # Swap
                changes += 1
                passes += 1
                swapped = True
                last = j
                print("Pass",passes, ": ", items)


    print("\nOriginal List: ", originalitems)
    print("Sorted List: ",items)
    print("Number of passes =",passes)


print("Enter as many non-negative numbers as you want to bubble sort.\n Use a comma between each one. Do not add any spaces: ")
numbers = input()
items = [int(num) for num in numbers.split(',') if num.isnumeric()]
originalitems = str(items)
bubble_sort(items)
