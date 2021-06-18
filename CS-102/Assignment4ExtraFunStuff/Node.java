/*
   * Name:  Darek Konopka  
   * Date:  5/20/2021
   * Question Number: 1
   * Description: In this assignment we add some functions for trees
   * those functions are: 
   * heightTree: finds the number of nodes along the longest path 
   * maxElements: finds the largest number in the tree
   * sumElements: finds the sum of all the elements in the tree
   * oneChild: finds the nodes that only have one child

*/

import java.util.Vector;// We need a list for the only child function


 // keep BST and Node seperate so we can use Node.root 
 class Node { 
     int key;// unique key
     Node leftChild, rightChild;  // references to the left and right child
    
     public Node(int k){ 
         key = k; 
         leftChild = rightChild = null; 
     } 
 } 
 
 
class BSTReferenceBased { 

    Node root; // entry point to the BST (reference to root node)
    
   // Default Constructor for BST =>initial empty tree
    BSTReferenceBased(){ 
        root = null; 
    } 
    
     boolean search(int key)  { 
        root = searchRec(root, key); 
        if (root!= null)
            return true;
        else
            return false;
    } 
   
    //recursive search function
    Node searchRec(Node root, int key)  { 
      // base case: root is null or key presents at root
        if (root==null || root.key==key) 
            return root; 
       //value is less than root's key
        if (root.key > key) 
            return searchRec(root.leftChild, key); 
      // value is greater than root' key
        return searchRec(root.rightChild, key); 
    } 
    
    
    
    // insert a node in BST 
    void insert(int key)  { 
        root = insertRec(root, key);  // internal call to recursive implementation
     } 
   
    //recursive insert function
    Node insertRec(Node root, int key) { 
          // check if input BST is empty
        if (root == null) { 
         // Input BST is empty: create new node storing input key, return it as the new input BST root.
            root = new Node(key); 
            return root; 
        } 
         // Input BST is not empty: compare input item with currRoot, and proceed insertion.
        if (key < root.key)     
            root.leftChild = insertRec(root.leftChild, key);  // insert in the leftchild subtree
        else if (key > root.key)    
            root.rightChild = insertRec(root.rightChild, key); // insert in the rightchild subtree
          // return pointer
        return root; 
    }
    void deleteKey(int key) { root = deleteRec(root, key); }
    
    Node deleteRec(Node root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.leftChild = deleteRec(root.leftChild, key);
        else if (key > root.key)
            root.rightChild = deleteRec(root.rightChild, key);
 
        // if key is same as root's
        // key, then This is the
        // node to be deleted
        else {
            // node with only one child or no child
            if (root.leftChild == null)
                return root.rightChild;
            else if (root.rightChild == null)
                return root.leftChild;
 
            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.key = minValue(root.rightChild);
 
            // Delete the inorder successor
            root.rightChild = deleteRec(root.rightChild, root.key);
        }
 
        return root;
    }
 
    int minValue(Node root)
    {
        int minv = root.key;
        while (root.leftChild != null)
        {
            minv = root.leftChild.key;
            root = root.leftChild;
        }
        return minv;
    }
    
     void printPostorder(Node root) 
     {
        if (root == null)
            return;
 
        // first recur on left subtree
        printPostorder(root.leftChild);
 
        // then recur on right subtree
        printPostorder(root.rightChild);
 
        // now deal with the node
        System.out.print(root.key + " ");
    }
    
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node root)
    {
        if (root == null)
            return;
 
        /* first recur on left child */
        printInorder(root.leftChild);
 
        /* then print the data of node */
        System.out.print(root.key + " ");
 
        /* now recur on right child */
        printInorder(root.rightChild);
    }
 
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node root)
    {
        if (root == null)
            return;
 
        /* first print data of node */
        System.out.print(root.key + " ");
 
        /* then recur on left sutree */
        printPreorder(root.leftChild);
 
        /* now recur on right subtree */
        printPreorder(root.rightChild);
    }
 
    // Wrappers over above recursive functions
    void printPostorder() { printPostorder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }
    void inOrder() { inOrder(root); }
    void inOrderDesc() { inOrderDesc(root); }
    
   // Count the number of nodes in the tree
   int numOfNodes (int level) {
      return numOfNodesRec(root, level); 
   }
   
   static int numOfNodesRec(Node root, int level) 
   { 
      
      if (root == null || level < 1) {
         return 0;
      }
      if (level == 1) {
         return 1;
      } else {
      
         numOfNodesRec(root.rightChild, level); 
         numOfNodesRec(root.leftChild, level);  
         return level; 
      } 
   }
   
      // For traversing in order
     public void inOrder(Node root){
       if(root != null){
         inOrder(root.leftChild);
         System.out.print(root.key + " ");
         inOrder(root.rightChild);
       }
     }
       
     public void inOrderDesc(Node root){
       if(root != null){
         inOrderDesc(root.rightChild);
         System.out.print(root.key + " ");
         inOrderDesc(root.leftChild);
       }
     }
}


class Main{
    
   /* returns the number of nodes along the longest 
    path from the root node down to the farthest leaf node.*/
    
    static int heightTree(Node root){
      if (root == null){
         return 0;
      }else {
         // get the height of each subtree
         int lHeight = heightTree(root.leftChild);
         int rHeight = heightTree(root.rightChild);
     
         // use larger one 
         if (lHeight > rHeight)
             return (lHeight + 1);
          else
             return (rHeight + 1);
      }
    } 
    // max value in a tree
    static int maxElements(Node root)
    {
        if (root == null)
            return Integer.MIN_VALUE;
  
        int res = root.key;
        int lres = maxElements(root.leftChild);
        int rres = maxElements(root.rightChild);
  
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }  
    
    // find sum of all the elements
   static int sumElements(Node root) 
   { 
       if (root == null) 
           return 0; 
       return (root.key + sumElements(root.leftChild) + sumElements(root.rightChild)); 
   }
   
   // List of nodes with only one child
   static Vector<Integer> list = new Vector<>();
    
   // Function to find the nodes with only one child
   static void oneChild(Node root)
   {
       // Base case
       if (root == null)
           return;
    
       // check if the node only has one child
       if (root.leftChild != null && root.rightChild == null ||
           root.leftChild == null && root.rightChild != null)
       {
           list.add(root.key);
       }
        
       // Traversing the left child
       oneChild(root.leftChild);
        
       // Traversing the right child
       oneChild(root.rightChild);
   }
   
   
   
    public static void main(String[] args)  { 
       // create a BST object
        BSTReferenceBased bst = new BSTReferenceBased(); 
        int inputArray[] = {25, 12, 8, 32, 46, 17, 15, 30, 27, 10, 11, 9 ,52, 55, 50, 39};

        // Add the varibles needed for each function
        int treeHeight = 0; 
        int highestNumber = 0; 
        int sum = 0; 
        
        // Unbalenced tree
        for(int i = 0; i < inputArray.length; i++ ) {
            
            bst.insert( inputArray[i] );
         }

        
        bst.deleteKey(32); 

        // Print the transver orders of the trees
        System.out.print("\nPreorder traversal of binary tree is: ");
        bst.printPreorder();
 
        System.out.print("\nInorder traversal of binary tree is: ");
        bst.printInorder();
 
        System.out.print("\nPostorder traversal of binary tree is: ");
        bst.printPostorder();
        
        // Delete an element for fun 
        
        
        // This is a balanced tree
        /*
        bst.insert(52);
        bst.insert(33);
        bst.insert(24);
        bst.insert(42);
        bst.insert(78);
        bst.insert(64);
        bst.insert(89);
        bst.insert(65); 
        bst.insert(45);
        int num = bst.numOfNodes(3); 
        System.out.println(num); */
        /*
        When created the tree should look like this: 
                            50
                           /   \
                          30   70
                          /\   /\
                        20 40 60 80
                           \   \
                            45  65
        */
        
        // Test the functions I created:
        // This gets the height of the tree
        /*
        treeHeight = heightTree(bst.root); 
        System.out.println("The height of the tree is: " + treeHeight); 
        
        // This gets the largest number in the tree
        highestNumber = maxElements(bst.root); 
        System.out.println("The largest number in the tree is: " + highestNumber); 
        
        // This gets the sum of the elements in the tree
        sum = sumElements(bst.root);
        System.out.println("The sum of the numbers in the tree is: " + sum); 

        // this prints the nodes with only one child
        System.out.println("The nodes with only one childs are: ");
        oneChild(bst.root);
        */
         /* print the list that is created from the 
            onlyChild function; we do it this way since the
            onlyChild function is recurssive */
            /*
          if (list.size() == 0){}
             // System.out.println(-1); // We print -1 if there is no tree; or if the only child function wasnt run
          else
          {
              for(int value : list)
              {
                  //System.out.println(value);
              }
          }*/ 
     } 
}