package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DepthFirstTraversal<T> extends AdjacencyGraph<T> implements Traversal<T>
{
	List<T> ourGraph = new ArrayList<T>();
	List<T> visited = new ArrayList<T>();

	@Override
	public List<T> traverse() throws GraphError
	{
		for(int i = 0; i<getNodes().size(); i++)
		{
			if(visited.size() <getNodes().size())
			{
				@SuppressWarnings("unchecked")
				T startNode = (T) getNodes().toArray()[i];
				if(!visited.contains(startNode))
				{
					recursiveDepthFirstTraversal(startNode);
				}
			
			}
			else break;
		}
		return ourGraph;
	}

	public void recursiveDepthFirstTraversal(T node) throws GraphError
	{
		
			visited.add(node);
			ourGraph.add(node);
			Set<T> neighboursSet = getNeighbours(node);

			@SuppressWarnings("unchecked")
			T[] neighbouringNodes = (T[]) neighboursSet.toArray();

			for (int i = 0; i < neighbouringNodes.length; i++)
			{
				T n = neighbouringNodes[i];
				if (n != null && !visited.contains(n))
				{
					recursiveDepthFirstTraversal(n);
					
				}
			}
			
			
	}

	public static void main(String[] args) throws GraphError
	{
		DepthFirstTraversal<Integer> graph = new DepthFirstTraversal<>();
		
		Integer node0 = new Integer(0);
        Integer node1 = new Integer(1);
        Integer node2 = new Integer(2);
        Integer node3 = new Integer(3);
        Integer node4 = new Integer(4);
     
        graph.add(node0);
        graph.add(node1);
        graph.add(node2);
        graph.add(node3);
        graph.add(node4);
    
        graph.add(0, 3);
        graph.add(0, 2);
        graph.add(1, 0);
        graph.add(2, 1);
        graph.add(3, 4);
        graph.add(4,0);

        graph.traverse();
        System.out.println("Recursive Depth First Traversal: "+Arrays.toString((graph.ourGraph.toArray())));
	}
}