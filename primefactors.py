def isPrime(n):
    for i in range(2,n):
        if (n%i==0):
            return False
        return True
    
input_number = 57

temp_number = input_number
while(not isPrime(temp_number)):
    for i in range(2,temp_number):
        if (temp_number%i == 0):
            print("Prime factor: ", i)
            temp_number = temp_number//i
            break
print("Prime Factor: ", temp_number)
