package linkedList;

public class SinglyLinkedLists<T> implements List<T>
{
	private Node<T> head = null;
	private Node<T> tail = null;
	private int noOfNodes = 0;

	@Override
	public boolean isEmpty()
	{
		return (head == null);
	}

	@Override
	public void add(int index, T value) throws ListAccessError
	{
		Node<T> newNode = new Node<T>(value);
		
		if(isEmpty())
		{
			head = newNode;
			tail = head;
		}
		else
		{
			Node<T> temp = head;
			int i = 0;
			while(i < index-1)
			{
				temp = temp.getNext();
				i++;
			}
			temp.setNext(newNode);
			temp = newNode;
		}
		noOfNodes ++;
	}
	
	@Override
	public T remove(int index) throws ListAccessError
	{

		return null;
	}

	@Override
	public T get(int index) throws ListAccessError
	{

		return getNode(index).getValue();
	}

	private Node<T> getNode(int index) throws ListAccessError
	{
		
		if (index < 0 || index >= noOfNodes)
		{ // invalid index
			throw new ListAccessError("Index out of bounds");
		}
		Node<T> node = head; // start at head of list
		for (int i = 0; i < index; i++)
		{ // walk through list to desired index
			node = node.getNext(); // by following next references
		}
		return node; // return the node at the required index
	}
}
