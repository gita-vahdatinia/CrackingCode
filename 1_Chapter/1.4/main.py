str = "tact coa"
D = {}
x = 0;
for letter in str:
    if letter not in D:
        if letter != " ":
            D[letter] = 1
    else:
        D[letter] += 1
palin = 1
for key, value in D.items():
    if value % 2 == 1:
        palin = palin - 1

print (palin)
print (D)
