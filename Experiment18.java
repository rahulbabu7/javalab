package lab21;

import java.util.Scanner;

public class Experiment18 {

    // Function to return position of pivot element //
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    // Function to swap elements at 2 positions of the array //
    static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print //
    static void print(int arr[], int n)
    {
        System.out.print("\nSorted Array: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    // QuickSort Function //
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);
        print(arr,n);
    }
}
