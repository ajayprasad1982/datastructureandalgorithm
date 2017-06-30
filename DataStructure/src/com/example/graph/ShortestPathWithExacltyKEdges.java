/**
 * 
 */
package com.example.graph;

/**
 * @author aprasa03
 *
 */
public class ShortestPathWithExacltyKEdges {

	/**
	 * @param args
	 */
	static int MAX = 9999;

	public static void main(String[] args) {

		int graph[][] = { { 0, 10, 3, 2 }, { 0, 0, 0, 7 }, { 0, 0, 0, 6 },
				                                                          { 0, 0, 0, 0 } };
				                                                          
		System.out.println(getShortestPath(graph,0,0,2,3,0));		                                                          

	}

	private static boolean isContected(int weight) {
		return 0 != weight;
	}
	
	private static int getShortestPath(int graph[][],int src,int edges,int target,int dest,int weight)
	{
		if(edges==target)
		{
			if(src==dest)
			{
				return weight;
			}
			else
			{
				return MAX;
			}
		
		}
		
	int min=MAX;
	for(int i=0;i<graph.length;i++)
	{
		if(isContected(graph[src][i]))
		{
			min=Math.min(getShortestPath(graph,i,edges+1,target,dest,weight+graph[src][i]), min);
		}
	}
		
	
		return min;
	}
	

}
