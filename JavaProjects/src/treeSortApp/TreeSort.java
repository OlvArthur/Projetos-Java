package treeSortApp;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        left = null;
        right = null;        
    }
}
*/

/*class Tree{
	Node node;
    Tree(int value){
        node = new Node(value);
    }
    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        // Move to the left if passed value is 
        // less than the current node
        if(value < node.value){
            node.left = insert(node.left, value);
        }
        // Move to the right if passed value is 
        // greater than the current node
        else if(value > node.value){
            node.right = insert(node.right, value);
        }
        return node;
    }
    
    // For traversing in order
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }
    
    public void inOrderDesc(Node node){
        if(node != null){
            inOrderDesc(node.right);
            System.out.print(node.value + " ");
            inOrderDesc(node.left);
        }
    }
}
*/

public class TreeSort {

	public static void main(String[] args) {
		int numElementos = 0;
		System.out.println("100\n100000\n500000\nQuantidade de elementos desejada:");
		Scanner in = new Scanner(System.in);
		switch(in.nextLine()) {
		
		case "100":
			numElementos = 100;
			break;
		
		case "100000":
			numElementos = 100000;
			break;
			
		case "500000":
			numElementos = 500000;
			break;
		
		default:
			System.out.println("Quantidade invalida");
		
		}
		
		int[] arr = new int[numElementos];
		for(int i = 0; i<numElementos; i++) {
			int rand = new Random().nextInt(numElementos);
			arr[i] = rand;
		}
			System.out.println("Original array- "+Arrays.toString(arr));
			Tree tree = new Tree(arr[0]);
			for(int num : arr){
				tree.insert(tree.node, num);
			}
			System.out.println("Sorted Array (Ascending)- ");
			tree.inOrder(tree.node);
			System.out.println();
			System.out.println("Sorted Array (Descending)- ");
			tree.inOrderDesc(tree.node);
    }
		
}



