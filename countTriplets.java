// Given an array of distinct integers. The task is to count all the triplets such 
// that sum of two elements equals the third element.

// Input:
// N = 4
// arr[] = {1, 5, 3, 2}
// Output: 2
// Explanation: There are 2 triplets: 
// 1 + 2 = 3 and 3 +2 = 5 

class countTriplets{
    int countTriplet(int arr[], int n) {
       int count=0;
     
     for(int i=0;i<n-1;i++){
         for(int j=i+1;j<n;j++){
             int sum = arr[i]+arr[j];
             
             if(contain(sum,arr)){
                 count++;
             }
         }
     }
     return count;
   }
  static boolean contain(int sum,int arr[]){
       for(int i=0;i<arr.length;i++){
           if(sum==arr[i]){
              return true;
           }
           
       }
       return false;
   }
}