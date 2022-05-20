class Solution{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) {
        // code here 
       long a[] = new long[arr1.length + arr2.length];
       int b = 0;
       int c = 0;
       for(int i = 0;i < n + m;i ++){
           if(i < n){
           a[i] = arr1[b];
           b++;
           } else {
           a[i] = arr2[c];
           c++;
           }
       }

       Arrays. sort(a);
       for(int i = 0;i < a.length; i++){
           if(i < arr1.length){
               arr1[i] = a[i];
           }else{
               arr2 [i - arr1.length] = a[i];
           }
       }
    }
}
