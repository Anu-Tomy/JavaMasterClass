import java.util.LinkedList;
import java.util.Queue;

/*Given a binary tree, print level order traversal in a way that nodes of all levels are printed in separate lines.
                    2
                 /     \
                3       4
               / \       \
              1   2       5
*/

public class Main
{
    // A Binary Tree Node
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Iterative method to do level order traversal line by line

    static void printLevelOrder(Node root)
    {
        // Base Case
        if(root == null)
            return;

        // Create an empty queue for level order traversal
        Queue<Node> q =new LinkedList<Node>();

        // Enqueue Root
        q.add(root);

        while(true)
        {

            // nodeCount (queue size) indicates number of nodes at current level.
            int nodeCount = q.size();
            if(nodeCount == 0)
                break;

            // Dequeue all nodes of current level and Enqueue all
            // nodes of next level
            while(nodeCount > 0)
            {
                Node node = q.peek();
                System.out.print(node.data + " ");
                q.remove();
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                nodeCount--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.right.right = new Node(5);

        printLevelOrder(root);

    }

}


