first = "pale"
second = "bale"
count = 1
for index in range (0 , len(first)):
    test = first[:index] + first[index + 1:]
    if test == second:
        print ("+correct")
    if (len(first) == len(second)):
        if first[index] != second[index]:
            count = count - 1
if (count < 0):
    print ("incorrect")
else:
    print ("correct")
