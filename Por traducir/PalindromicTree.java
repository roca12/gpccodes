


import java.util.Arrays;

// C++ program to demonstrate working of 
// palindromic tree 

public class PalindromicTree {

    static final int MAXN = 1000;

    static class Node {
        // store start and end indexes of current 
        // Node inclusively 

        int start, end;

        // stores length of substring 
        int length;

        // stores insertion Node for all characters a-z 
        int insertEdg[] = new int[26];

        // stores the Maximum Palindromic Suffix Node for 
        // the current Node 
        int suffixEdg;

        public Node(int start, int end, int length, int suffixEdg) {
            this.start = start;
            this.end = end;
            this.length = length;
            this.suffixEdg = suffixEdg;
        }

        public Node() {
        }
        
    };

// two special dummy Nodes as explained above 
    static Node root1=new Node(), root2=new Node();

// stores Node information for constant time access 
    static Node tree[] = new Node[MAXN];

// Keeps track the current Node while insertion 
    static int currNode;
    static String s;
    static int ptr;

    static void insert(int idx) {
        //STEP 1// 

        /* search for Node X such that s[idx] X S[idx] 
    is maximum palindrome ending at position idx 
    iterate down the suffix link of currNode to 
    find X */
        int tmp = currNode;
        while (true) {
            int curLength = tree[tmp].length;
            if (idx - curLength >= 1 && s.charAt(idx) == s.charAt(idx - curLength - 1)) {
                break;
            }
            tmp = tree[tmp].suffixEdg;
        }

        /* Now we have found X .... 
     * X = string at Node tmp 
     * Check : if s[idx] X s[idx] already exists or not*/
        if (tree[tmp].insertEdg[s.charAt(idx) - 'a'] != 0) {
            // s[idx] X s[idx] already exists in the tree 
            currNode = tree[tmp].insertEdg[s.charAt(idx) - 'a'];
            return;
        }

        // creating new Node 
        ptr++;

        // making new Node as child of X with 
        // weight as s[idx] 
        tree[tmp].insertEdg[s.charAt(idx) - 'a'] = ptr;

        // calculating length of new Node 
        tree[ptr].length = tree[tmp].length + 2;

        // updating end point for new Node 
        tree[ptr].end = idx;

        // updating the start for new Node 
        tree[ptr].start = idx - tree[ptr].length + 1;

        //STEP 2// 

        /* Setting the suffix edge for the newly created 
    Node tree[ptr]. Finding some String Y such that 
    s[idx] + Y + s[idx] is longest possible 
    palindromic suffix for newly created Node.*/
        tmp = tree[tmp].suffixEdg;

        // making new Node as current Node 
        currNode = ptr;
        if (tree[currNode].length == 1) {
            // if new palindrome's length is 1 
            // making its suffix link to be null string 
            tree[currNode].suffixEdg = 2;
            return;
        }
        while (true) {
            int curLength = tree[tmp].length;
            if (idx - curLength >= 1 && s.charAt(idx) == s.charAt(idx - curLength - 1)) {
                break;
            }
            tmp = tree[tmp].suffixEdg;
        }

        // Now we have found string Y 
        // linking current Nodes suffix link with s[idx]+Y+s[idx] 
        tree[currNode].suffixEdg = tree[tmp].insertEdg[s.charAt(idx) - 'a'];
    }

    public static void main(String[] args) {
        // initializing the tree 
        root1.length = -1;
        root1.suffixEdg = 1;
        root2.length = 0;
        root2.suffixEdg = 1;
        Arrays.fill(tree, new Node());
        tree[1] = root1;
        tree[2] = root2;
        ptr = 2;
        currNode = 1;

        // given string 
        s = "abcbab";
        int l = s.length();

        for (int i = 0; i < l; i++) {
            insert(i);
        }
        // printing all of its distinct palindromic 
        // substring 
        System.out.println("All distinct palindromic substring for "+ s + " :");
        for (int i = 3; i <= ptr; i++) {
            System.out.print( i - 2 + ") ");
            for (int j = tree[i].start; j <= tree[i].end; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println("");
        }
    }
}
