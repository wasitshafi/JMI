import time
import random

def getPartitionIndex(arr, low, high):
    i = low - 1
    for j in range(low, high):
        if (arr[j] <= arr[high]):
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    i += 1
    arr[i], arr[high] = arr[high], arr[i]
    return i

def quickSort(arr, low, high):
    if (low < high):
        partitionIndex = getPartitionIndex(arr, low, high)
        quickSort(arr, low, partitionIndex - 1)
        quickSort(arr, partitionIndex + 1, high)

def merge(arr, low, mid, high):
        i = 0
        j = 0
        k = low
        n1 = mid - low + 1
        n2 = high - mid
        left = arr[low : mid + 1]
        right = arr[mid + 1 : high + 1]
         
        while(i < n1 and j < n2):
            if(left[i] <= right[j]):
                arr[k] = left[i]
                i += 1
            else:
                arr[k] = right[j]
                j += 1
            k += 1

        while(i < n1):
             arr[k] = left[i]
             k +=  1
             i += 1
        while(j < n2):
             arr[k] = right[j]
             k += 1
             j += 1

def mergeSort(arr, low, high):
    if (low < high):
        mid = low + (high - low) // 2
        mergeSort(arr, low, mid)
        mergeSort(arr, mid + 1, high)
        merge(arr, low, mid, high)

if __name__ == "__main__":
    arr = []
    brr = []
    N = 1000000
    MAX = 9000
    for i in range(N):
        randomNumber = random.randint(1, MAX)
        arr.append(randomNumber)
        brr.append(randomNumber)    
    # print('Array[] : ', arr)

    # Quick Sort
    # Quick sort is more efficient and works faster than merge sort in case of smaller array size.
    start = time.time()
    quickSort(arr, 0, len(arr) - 1)
    end = time.time()
    print('Time taken to sort array using quick sort is :', float("{:.4f}".format(end - start)), 'sec')

    # Merge Sort
    # Merge sort is more efficient and works faster than quick sort in case of larger array size.
    start = time.time()
    mergeSort(brr, 0, len(brr) - 1)
    end = time.time()
    print('Time taken to sort array using merge sort is :', float("{:.4f}".format(end - start)), 'sec')