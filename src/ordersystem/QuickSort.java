/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

/**
 *
 * @author ThinkPad
 */
public class QuickSort {

    int[] quickSort(int[] arr, int start, int end) {
        if (start > end) {
            return arr;
        }
        int low = start;
        int high = end;
        int pivot = arr[low];
        int temp;
        while (low < high) {
            while (low < high && arr[high] <= pivot) {
                high--;
            }
            while (low < high && arr[low] >= pivot) {
                low++;
            }
            if (low < high) {
                temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
            }
        }
        arr[start] = arr[low];
        arr[low] = pivot;
        quickSort(arr, start, high - 1);
        quickSort(arr, high + 1, end);
        return arr;
    }
}
