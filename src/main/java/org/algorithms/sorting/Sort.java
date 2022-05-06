package org.algorithms.sorting;

public class Sort {

    public void mergeSort(int [] nums,int low,int high){
        if(low <high){
            int mid = (low+high)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }

    public void merge(int [] nums, int low, int mid , int high) {
        int []a  = new int[(mid-low)+1];
        int []b = new int[(high-mid)];
        int index = low;
        for(int i=0;i<a.length;i++) {
            a[i] = nums[index];
            index++;
        }
        for(int j=0;j<b.length;j++){
            b[j] = nums[index];
            index++;
        }
        int min = Math.min(a.length,b.length);
        int aIndex=0;
        int bIndex=0;
        int k = low;
        for(int j=0;j<min;j++){
            if(a[aIndex] < b[bIndex]){
                nums[k] = a[aIndex];
                aIndex++;
            }else{
                nums[k] = b[bIndex];
                bIndex++;
            }
            k++;
        }
        if (aIndex < a.length){
            while(aIndex <a.length){
                nums[k] = a[aIndex];
                aIndex++;
                k++;
            }
        }
        if(bIndex < b.length){
            while(bIndex < b.length){
                nums[k] = b[bIndex];
                bIndex++;
                k++;
            }
        }
    }
}
