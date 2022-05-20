
// Given an array of size N-1 such that it only contains distinct integers in the 
// range of 1 to N. Find the missing element.

// N = 10
// A[] = {6,1,2,8,3,4,7,10,5}
// Output: 9

class missingNumber {
    int MissingNumber(int array[], int n) {
        int total=0;
       total = (n*(n+1))/2;
       for(int i=0;i<n-1;i++){
           total-= array[i];
       }
       return total;
    }
}