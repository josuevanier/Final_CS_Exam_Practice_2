package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
class HeapSort{

}
class MergeSort{
    //nlog(n )
    public static void merge(int[] left, int[] right,int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0,l = 0 ,r = 0;

        while (l < leftSize && r < rightSize ){
            if(left[l] < right[r]){
                array[i] = left[l];
                i++;
                l++;
            }else {
                array[i] = right[r];
                i++;
                r++;
            }
        }
        while ((l < leftSize)){
            array[i] = left[l];
            i++;
            l++;
        }
        while (r < rightSize){
            array[i]  = right[r];
            i++;
            r++;
        }
    }
    public static int[] mergeSort(int[] array){

        int length  = array.length;
        if(length <= 1) return  array;
        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];
        int i = 0;
        int j = 0;
        for(; i < length; i++){
            if(i < middle){
                left[i] = array[i];
            }else {
                right[j] = array[i];
                j++;
            }
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);
        return array;
    }
}
class QuickSort{
    //nlog(n)
    public static int[] QuickSortAlgorithm(int[] arrays, int start, int end){

        if (end <= start) return arrays;
        int pivot = partitions(arrays,start,end);
        QuickSortAlgorithm(arrays,start, pivot - 1);
        QuickSortAlgorithm(arrays, pivot + 1, end);
        return arrays;
    }
    public static int partitions(int[] arrays, int start, int end){
        int pivot = arrays[end];
        int i =  start - 1;
        for(int j  = start; j <= end - 1; j++){
            if(arrays[j] < pivot ){
                i++;
                int temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = temp;
            }
        }
        return i;
    }
}
class InsertionSort{
    //On^2
    public static int[] InsertionSortAlgorithm(int[] arrays){
        for(int i = 1; i < arrays.length; i++ ){
       int   temp = arrays[i];
            int j = i - 1;
            while(j >= 0 && arrays[j] > temp){
                arrays[j + 1] = arrays[j];
                j--;
            }
          arrays[j + 1] = temp;
        }
        return arrays;
    }
}
class selectionSortAlgorithm{
    //O(n^2)
    public static int[] SelectionSortAlgorithm(int[] arrays){
       int minValue, minIndex = 0;
       int temp;

       for(int i = 0; i < arrays.length; i++){
           minIndex = i;
           minValue = arrays[i];
           for(int j = i + 1; j < arrays.length; j++){
               if(minValue > arrays[j]){
                   minValue = arrays[j];
                   minIndex = j;
               }
           }
           if(arrays[i] > minValue){
                temp = arrays[i];
                arrays[i] = arrays[minIndex];
                arrays[minValue] = temp;
           }
       }
       return arrays;
    }
}
class BubbleSort{
    // On^2
    public static int[] BubbleSortAlgorithm(int[] arrays){
        int temp;
        for(int i = 0; i < arrays.length; i++){
            for(int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]){
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        return arrays;
    }
}
public class Sortings {

    public static void main(String[] args) {
        int[] nums = {10,9,8,7,6,5,4,3,2,1};



        int[] sortedArray =  BubbleSort.BubbleSortAlgorithm(nums);

        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(selectionSortAlgorithm.SelectionSortAlgorithm(nums)));
        System.out.println(Arrays.toString(InsertionSort.InsertionSortAlgorithm(nums)));

        System.out.println(Arrays.toString(QuickSort.QuickSortAlgorithm(nums, 0, nums.length - 1)));

        System.out.println(Arrays.toString(MergeSort.mergeSort(nums)));
    }
}
