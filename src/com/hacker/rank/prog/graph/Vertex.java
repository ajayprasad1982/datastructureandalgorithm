/**
 * 
 */
package com.hacker.rank.prog.graph;

/**
 * @author aprasa03
 *
 */
public class Vertex {
	private String name;
	private Edge edge;
	
	public Vertex(String name,Edge edge)
	{
		this.name=name;
		this.edge=edge;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the edge
	 */
	public Edge getEdge() {
		return edge;
	}

	/**
	 * @param edge the edge to set
	 */
	public void setEdge(Edge edge) {
		this.edge = edge;
	}
	
	
	

}
