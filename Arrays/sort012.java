
// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

// Input: 
// N = 5
// arr[]= {0 2 1 2 0}
// Output:
// 0 0 1 2 2
// Explanation:
// 0s 1s and 2s are segregated 
// into ascending order.

class Solution{
    public static void sort012(int a[], int n){
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;

        for(int i = 0;i < n; i++){
            if(a[i] == 0) 
                c0++;
            else if(a[i] == 1)
                c1++;
            else
                c2++;
        }
        
        int k = 0;
        for(int i = 0;i < c0;i++)
        a[k++] = 0;
        for(int i = 0;i < c1;i++)
        a[k++] = 1;
        for(int i = 0;i < c2;i++)
        a[k++] = 2;
   
    }
}