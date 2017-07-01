/**
 * 
 */
package com.hacker.rank.prog.graph;

/**
 * @author aprasa03
 *
 */
public class Edge {
	
	private int vertexNum;
	private Edge next;
	
	public Edge(int vertexNum,Edge next)
	{
		this.vertexNum=vertexNum;
		this.next=next;
	}

	/**
	 * @return the vertexNum
	 */
	public int getVertexNum() {
		return vertexNum;
	}

	/**
	 * @param vertexNum the vertexNum to set
	 */
	public void setVertexNum(int vertexNum) {
		this.vertexNum = vertexNum;
	}

	/**
	 * @return the next
	 */
	public Edge getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Edge next) {
		this.next = next;
	}

}
