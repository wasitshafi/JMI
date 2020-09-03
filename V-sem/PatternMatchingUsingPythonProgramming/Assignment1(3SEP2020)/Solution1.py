def getPartitionIndex(arr, low, high):
    i = low - 1
    for j in range(low, high):
        if arr[j] <= arr[high]:
            i = i + 1
            arr[i], arr[j] = arr[j], arr[i]
    i = i + 1
    arr[i], arr[high] = arr[high], arr[i]
    return i

def quickSort(arr, low, high):
    if low < high:
        partitionIndex = getPartitionIndex(arr, low, high)
        quickSort(arr, low, partitionIndex - 1)
        quickSort(arr, partitionIndex + 1, high)

if __name__ == "__main__":
    arr = [1, 4, 3, 67, 32, 21, 25, 54, 76]
    print('Array Before quickSort() : ', arr)
    quickSort(arr, 0, len(arr) - 1)
    print('Array After quickSort()  : ', arr)