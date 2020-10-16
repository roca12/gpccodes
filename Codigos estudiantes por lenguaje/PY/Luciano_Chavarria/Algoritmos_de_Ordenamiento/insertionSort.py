def BinarySearch(a, item,low , high):
    if high <= low:
        return (low + 1) if item > a[low] else low
    mid = (low+high)//2
    if item == a[mid]:
        return mid+1
    if item > a[mid]:
        return BinarySearch(a, item, mid+1, high)
    return BinarySearch(a, item, low, mid-1)

def sort(arr=[]):
    for i in range(1, len(arr)):
        j = i - 1
        selected = arr[i]
        pos = BinarySearch(arr, selected, 0, j)
        while j >= pos:
            arr[j+1] = arr[j]
            j-=1
        arr[j+1] = selected

mapa = list(map(int, input().split()))
sort(mapa)
print(mapa)
