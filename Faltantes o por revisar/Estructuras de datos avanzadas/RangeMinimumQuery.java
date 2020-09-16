// Java Program to implement iterative segment  
// tree.  



public class RangeMinimumQuery {

    static void construct_segment_tree(int[] segtree,
            int[] a, int n) {

        // assign values to leaves of the segment tree 
        for (int i = 0; i < n; i++) {
            segtree[n + i] = a[i];
        }

        /* 
        * assign values to internal nodes 
        * to compute minimum in a given range 
         */
        for (int i = n - 1; i >= 1; i--) {
            segtree[i] = Math.min(segtree[2 * i], segtree[2 * i + 1]);
        }
    }

    static void update(int[] segtree, int pos, int value, int n) {

        // change the index to leaf node first 
        pos += n;

        // update the value at the leaf node 
        // at the exact index 
        segtree[pos] = value;

        while (pos > 1) {

            // move up one level at a time in the tree 
            pos >>= 1;

            // update the values in the nodes in 
            // the next higher level 
            segtree[pos] = Math.min(segtree[2 * pos],
                    segtree[2 * pos + 1]);
        }
    }

    static int range_query(int[] segtree, int left,
            int right, int n) {

        /* 
        * Basically the left and right indices will move 
        * towards right and left respectively and with 
        * every each next higher level and compute the 
        * minimum at each height. */
        // change the index to leaf node first 
        left += n;
        right += n;

        // initialize minimum to a very high value 
        int mi = (int) 1e9;

        while (left < right) {

            // if left index in odd 
            if ((left & 1) == 1) {
                mi = Math.min(mi, segtree[left]);

                // make left index even 
                left++;
            }

            // if right index in odd 
            if ((right & 1) == 1) {

                // make right index even 
                right--;

                mi = Math.min(mi, segtree[right]);
            }

            // move to the next higher level 
            left /= 2;
            right /= 2;
        }
        return mi;
    }

    // Driver Code 
    public static void main(String[] args) {
        int[] a = {2, 6, 10, 4, 7, 28, 9, 11, 6, 33};
        int n = a.length;

        /*  
        * Construct the segment tree by assigning 
        * the values to the internal nodes 
         */
        int[] segtree = new int[2 * n];
        construct_segment_tree(segtree, a, n);

        // compute minimum in the range left to right  
        int left = 0, right = 5;
        System.out.printf("Minimum in range %d to %d is %d\n",
                left, right, range_query(segtree,
                        left, right + 1, n));

        // update the value of index 3 to 1  
        int index = 3, value = 1;

        // a[3] = 1;  
        // Contents of array : {2, 6, 10, 1, 7, 28, 9, 11, 6, 33} 
        update(segtree, index, value, n); // point update 

        // compute minimum in the range left to right 
        left = 2;
        right = 6;
        System.out.printf("Minimum in range %d to %d is %d\n",
                left, right, range_query(segtree,
                        left, right + 1, n));
    }
}
