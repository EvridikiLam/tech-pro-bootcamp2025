#Write a program that counts up to 20
# multiple of 3 -> prints fizz
#multiple of 5 -> prints buzz
#multiple of both -> prints fizzbuzz

for i in range(0,20):
    if (i%5 == 0 & i%3 == 0):
        print ("fizzbuzz")
    elif (i%3==0):
        print ("fizz")
    elif (i%5==0):
        print ("buzz")
    else:
        print(i)
