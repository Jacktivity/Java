package binaryTree;

import java.util.Arrays;

public class BinaryTree<T extends Comparable<? super T>> implements BTree<T> 
{
	TreeNode<T> root;
	@Override
	public void insert(T value) 
	{
		if(root==null)
		{
			root = new TreeNode<T>(value);
		}
		else if(value.compareTo(value())<0)
		{
			root.left().insert(value);
		}
		else
		{
			root.right().insert(value);
		}
	}

	@Override
	public T value() 
	{
		
		return root.value;
	}

	@Override
	public BTree<T> left() 
	{
		
		return root.left;
	}

	@Override
	public BTree<T> right() 
	{
		
		return root.right;
	}
	public static void main(String args[])
	{
		
		BinaryTree<Integer> tree = new BinaryTree<>(); 	
		
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(-1);
		Integer leftV = tree.left().value();
		Integer rightV = tree.right().value();
		Integer rightRightV = tree.right().right().value();
		System.out.println(tree.value());
		System.out.println(leftV);
		System.out.println(rightV);
		System.out.println(rightRightV);
	      
	}
}
