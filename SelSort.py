def minNum(arr):
    minEl = arr[0]
    minIndex = 0
    for i in range(1, len(arr)):
        if arr[i] < minEl:
            minEl = arr[i]
            minIndex = i
    return minIndex

def selectionSort(arr):
    newArr = []
    for i in range (len(arr)):
        smallest = minNum(arr)
        newArr.append(arr.pop(smallest))
    return newArr

def rightSelSort(arr):
    for i in range(len(arr)):
        min_index = i
        for j in range(i + 1,len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr


print(rightSelSort([9,8,7,6,5,4,3,2,1]))