/**
 * 
 */
package com.example.graph;

/**
 * @author aprasa03
 *
 */
public class Graph {
	
	private int noOfVertices;
	private int noOfEdges;
	
	//graph represented as an array of edges
	private Edge[] edge;
	
	public Graph(int vertices,int edges)
	{
		this.noOfVertices=vertices;
		this.noOfEdges=edges;
		edge=new Edge[edges];
		
	}

	public int getNoOfVertices() {
		return noOfVertices;
	}

	public void setNoOfVertices(int noOfVertices) {
		this.noOfVertices = noOfVertices;
	}

	public int getNoOfEdges() {
		return noOfEdges;
	}

	public void setNoOfEdges(int noOfEdges) {
		this.noOfEdges = noOfEdges;
	}

	public Edge[] getEdge() {
		return edge;
	}

	public void setEdge(Edge[] edge) {
		this.edge = edge;
	}
	
	
}
