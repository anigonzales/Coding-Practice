// There is a hidden integer array arr that consists of n non-negative integers.
// It was encoded into another integer array encoded of length n - 1, such that 
// encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].
// You are given the encoded array. You are also given an integer first, that is the first element 
// of arr, i.e. arr[0].
// Return the original array arr. It can be proved that the answer exists and is unique.

// Input: encoded = [1,2,3], first = 1
// Output: [1,0,2,1]
// Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]

class decodeXOR {
    public int[] decode(int[] encoded, int first) {
        int size = encoded.length;
        int[] res = new int[size+1];
        res[0] = first;
        for(int i=0; i<size; i++) {
            res[i+1] = res[i] ^ encoded[i];
        }
        return res;
    }
}
