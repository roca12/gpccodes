// A C++ program to demonstrate delete in K D tree 
#include<bits/stdc++.h> 
using namespace std; 
  
const int k = 2; 
  
// A structure to represent node of kd tree 
struct Node 
{ 
    int point[k]; // To store k dimensional point 
    Node *left, *right; 
}; 
  
// A method to create a node of K D tree 
struct Node* newNode(int arr[]) 
{ 
    struct Node* temp = new Node; 
  
    for (int i=0; i<k; i++) 
        temp->point[i] = arr[i]; 
  
    temp->left = temp->right = NULL; 
    return temp; 
} 
  
// Inserts a new node and returns root of modified tree 
// The parameter depth is used to decide axis of comparison 
Node *insertRec(Node *root, int point[], unsigned depth) 
{ 
    // Tree is empty? 
    if (root == NULL) 
        return newNode(point); 
  
    // Calculate current dimension (cd) of comparison 
    unsigned cd = depth % k; 
  
    // Compare the new point with root on current dimension 'cd' 
    // and decide the left or right subtree 
    if (point[cd] < (root->point[cd])) 
        root->left = insertRec(root->left, point, depth + 1); 
    else
        root->right = insertRec(root->right, point, depth + 1); 
  
    return root; 
} 
  
// Function to insert a new point with given point in 
// KD Tree and return new root. It mainly uses above recursive 
// function "insertRec()" 
Node* insert(Node *root, int point[]) 
{ 
    return insertRec(root, point, 0); 
} 
  
// A utility function to find minimum of three integers 
Node *minNode(Node *x, Node *y, Node *z, int d) 
{ 
    Node *res = x; 
    if (y != NULL && y->point[d] < res->point[d]) 
       res = y; 
    if (z != NULL && z->point[d] < res->point[d]) 
       res = z; 
    return res; 
} 
  
// Recursively finds minimum of d'th dimension in KD tree 
// The parameter depth is used to determine current axis. 
Node *findMinRec(Node* root, int d, unsigned depth) 
{ 
    // Base cases 
    if (root == NULL) 
        return NULL; 
  
    // Current dimension is computed using current depth and total 
    // dimensions (k) 
    unsigned cd = depth % k; 
  
    // Compare point with root with respect to cd (Current dimension) 
    if (cd == d) 
    { 
        if (root->left == NULL) 
            return root; 
        return findMinRec(root->left, d, depth+1); 
    } 
  
    // If current dimension is different then minimum can be anywhere 
    // in this subtree 
    return minNode(root, 
               findMinRec(root->left, d, depth+1), 
               findMinRec(root->right, d, depth+1), d); 
} 
  
// A wrapper over findMinRec(). Returns minimum of d'th dimension 
Node *findMin(Node* root, int d) 
{ 
    // Pass current level or depth as 0 
    return findMinRec(root, d, 0); 
} 
  
// A utility method to determine if two Points are same 
// in K Dimensional space 
bool arePointsSame(int point1[], int point2[]) 
{ 
    // Compare individual pointinate values 
    for (int i = 0; i < k; ++i) 
        if (point1[i] != point2[i]) 
            return false; 
  
    return true; 
} 
  
// Copies point p2 to p1 
void copyPoint(int p1[], int p2[]) 
{ 
   for (int i=0; i<k; i++) 
       p1[i] = p2[i]; 
} 
  
// Function to delete a given point 'point[]' from tree with root 
// as 'root'.  depth is current depth and passed as 0 initially. 
// Returns root of the modified tree. 
Node *deleteNodeRec(Node *root, int point[], int depth) 
{ 
    // Given point is not present 
    if (root == NULL) 
        return NULL; 
  
    // Find dimension of current node 
    int cd = depth % k; 
  
    // If the point to be deleted is present at root 
    if (arePointsSame(root->point, point)) 
    { 
        // 2.b) If right child is not NULL 
        if (root->right != NULL) 
        { 
            // Find minimum of root's dimension in right subtree 
            Node *min = findMin(root->right, cd); 
  
            // Copy the minimum to root 
            copyPoint(root->point, min->point); 
  
            // Recursively delete the minimum 
            root->right = deleteNodeRec(root->right, min->point, depth+1); 
        } 
        else if (root->left != NULL) // same as above 
        { 
            Node *min = findMin(root->left, cd); 
            copyPoint(root->point, min->point); 
            root->right = deleteNodeRec(root->left, min->point, depth+1); 
        } 
        else // If node to be deleted is leaf node 
        { 
            delete root; 
            return NULL; 
        } 
        return root; 
    } 
  
    // 2) If current node doesn't contain point, search downward 
    if (point[cd] < root->point[cd]) 
        root->left = deleteNodeRec(root->left, point, depth+1); 
    else
        root->right = deleteNodeRec(root->right, point, depth+1); 
    return root; 
} 
  
// Function to delete a given point from K D Tree with 'root' 
 Node* deleteNode(Node *root, int point[]) 
{ 
   // Pass depth as 0 
   return deleteNodeRec(root, point, 0); 
} 
  
// Driver program to test above functions 
int main() 
{ 
    struct Node *root = NULL; 
    int points[][k] = {{30, 40}, {5, 25}, {70, 70}, 
                      {10, 12}, {50, 30}, {35, 45}}; 
  
    int n = sizeof(points)/sizeof(points[0]); 
  
    for (int i=0; i<n; i++) 
        root = insert(root, points[i]); 
  
    // Delet (30, 40); 
    root = deleteNode(root, points[0]); 
  
    cout << "Root after deletion of (30, 40)\n"; 
    cout << root->point[0] << ", " << root->point[1] << endl; 
  
    return 0; 
} 