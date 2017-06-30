/**
 * 
 */
package com.example.graph;


/**
 * @author aprasa03
 *
 */
public class UnionAndFind {

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
	
	private static int find(int parent[],int i)
	{
		if(parent[i]==-1)
			return i;
		return find(parent,parent[i]);
	}
	private static void union(int parent[],int src,int dest)
	{
		int xsrc=find(parent,src);
		int ydest=find(parent,dest);
		parent[xsrc]=ydest;
	}
	
	private static boolean isCycle(Graph graph)
	{
		int parent[]=new int[graph.getNoOfVertices()];
		for(int i=0;i<parent.length;i++)
		{
			parent[i]=-1;
		}
		for(int i=0;i<graph.getNoOfVertices();i++)
		{
			int x=find(parent,graph.getEdge()[i].getSrc());
			int y=find(parent,graph.getEdge()[i].getDest());
			if(x==y)
				return true;
			union(parent, x, y);
		}
		
     return false;		
	}

}
