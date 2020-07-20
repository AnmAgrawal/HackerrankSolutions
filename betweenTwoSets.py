# You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:

#     The elements of the first array are all factors of the integer being considered
#     The integer being considered is a factor of all elements of the second array

# These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.

def getTotalX(a, b):
    # Write your code here
    a.sort()
    b.sort()
    
    nums = set()
    for i in range(a[len(a)-1],b[0]+1):
        count = 0
        for j in range(len(a)):
            if(i%a[j] == 0):
                count+=1
        if count == len(a):
            f = 0
            for k in b:
                if k%i == 0:
                    f += 1
            if f == len(b):
                nums.add(i)
    
    return len(nums)