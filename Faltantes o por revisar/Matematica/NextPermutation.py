
def swap(data, left, right):
    temp = data[left]
    data[left] = data[right]
    data[right] = temp
    return data

def reverse(data, left, right):
    while (left < right):
        temp = data[left]
        left+=1
        data[left] = data[right]
        right-=1
        data[right] = temp
    return data;

def findNextPermutation(data):
    if (len(data) <= 1):
        return False;
    last = len(data) - 2
    while (last >= 0):
        if (data[last] < data[last + 1]):
            break
        last-=1
    if (last < 0):
        return False
    nextGreater = len(data) - 1
    for i in range (len(data)-1,last,-1):
        if (data[i] > data[last]):
            nextGreater = i
            break
    data = swap(data, nextGreater, last);
    data = reverse(data, last + 1, len(data) - 1);
    return True


data= [1, 2, 3]
if (findNextPermutation(data)==False):
    print("There is no higher"
            + " order permutation "
            + "for the given data.")
else:
    print(data)
