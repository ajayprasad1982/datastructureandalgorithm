/**
 * 
 */
package com.hacker.rank.prog.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author aprasa03
 *
 */
public class Graph {
	private static Vertex [] adjList=null;

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your file name -> ");
		String fileName=sc.nextLine();
		createGraph(fileName);
		printGraph();

	}
private static void createGraph(String fileName)
{
	try {
		Scanner sc=new Scanner(new File(fileName));
		String graphType=sc.next();
		int numOfVrt=sc.nextInt();
		
		adjList=new Vertex[numOfVrt];
		for(int v=0;v<adjList.length;v++)
		{
			adjList[v]=new Vertex(sc.next(), null);
		}
		
		while(sc.hasNext())
		{
			int v1=getIndexForName(sc.next());
			int v2=getIndexForName(sc.next());
			
			adjList[v1].setEdge(new Edge(v2,adjList[v1].getEdge()));
			if("undirected".equalsIgnoreCase(graphType))
			{
				adjList[v2].setEdge(new Edge(v1,adjList[v2].getEdge()));
			}
			
		}
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
	
	private static int  getIndexForName(String name)
	{
		for(int v=0;v<adjList.length;v++)
		{
			if(adjList[v].getName().equalsIgnoreCase(name))
				return v;
		}
		
		return -1;
	}
	
private static void printGraph()
{
	for(int v=0;v<adjList.length;v++)
	{
		System.out.print(adjList[v].getName());
		for(Edge e=adjList[v].getEdge();e!=null;e=e.getNext())
		{
		System.out.print("---> "+adjList[e.getVertexNum()].getName());	
		}
		System.out.println();
	}
}
}
