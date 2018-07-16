str1 = "aabccccaaa"
str2 = ""
count = 0
for i in range (0, len(str1)-1):
    if str1[i] == str1[i+1]:
        count = count + 1
    if str1[i] != str1[i+1] or i == len(str1)-2:
        if count != 0:
            str2.append(str1[i-1]+ str(count + 1)) 
            count = 0
        else:
            str2 = str2 + str1[i] + "1"
    if (len(str2)>len(str1)):
        print (str1)
        break
if (len(str2)<len(str1)):
    print(str2)
