/**
 * 
 */
package com.example.graph;

/**
 * @author aprasa03
 *
 */
public class UnionAndFindPathCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * 
		 *   0
		 *   |  |
		 *   |     |
		 *   1------2
		 */
		
		//create graph 
		Graph graph=new Graph(3,3);
		//edge 0-1
		graph.getEdge()[0]=new Edge(0,1);
		
		//edge 1-2
		graph.getEdge()[1]=new Edge(1,2);
		//edge 0-2
	    graph.getEdge()[2]=new Edge(0,2);
	    
	    if(isCycle(graph))
	    {
	    System.out.println("Graph contains cycle");	
	    }else
	    {
	    	System.out.println("Graph doesn't contains cycle");	
	    }
		
	}
private static int find(Subset parent[],int i)
{
	if(parent[i].getParent()!=i)
	{
		parent[i].setParent(find(parent,parent[i].getParent()));
	}
	return parent[i].getParent();
}
private static void union(Subset parent[],int x,int y)
{
	int xroot=find(parent,x);
	int yroot=find(parent,y);
	if(parent[xroot].getRank()<parent[yroot].getRank())
	{
		parent[xroot].setParent(yroot);
	}else if(parent[xroot].getRank()>parent[yroot].getRank())
	{
		parent[yroot].setParent(xroot);
	}else
	{
		parent[yroot].setParent(xroot);
		parent[xroot].setRank(parent[xroot].getRank()+1);
	}
}
	
	
private static boolean isCycle(Graph graph)	
{
	Subset parent[]=new Subset[graph.getNoOfVertices()];
	
	for(int i=0;i<parent.length;i++)
	{
		Subset subset=new Subset();
		subset.setParent(i);
		subset.setRank(0);
		parent[i]=subset;
	}
	for(int i=0;i<graph.getNoOfVertices();i++)
	{
		int x=find(parent,graph.getEdge()[i].getSrc());
		int y=find(parent,graph.getEdge()[i].getDest());
		
		if(x==y)
			return true;
		
		union(parent,x,y);
	}
	
	
	return false;
}
	
	
}
