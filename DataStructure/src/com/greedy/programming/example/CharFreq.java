/**
 * 
 */
package com.greedy.programming.example;

/**
 * @author aprasa03
 *
 * Feb 15, 2015
 */
public class CharFreq implements Comparable<CharFreq> {
	
	/**
	 * Character. If it's internal node, this will be blank
	 */
	char ch;
	/**
	 * Frequency of character
	 */
	int freq;
	/**
	 * If it is internal node, then it's left node
	 */
	CharFreq left;
	/**
	 * If it is internal node, then it's right node
	 */
	CharFreq right;
	/**
	 * This will be populated while traversing the huffman tree. By default
	 * -1
	 */
	int huffMan = -1;

	/**
	 * @param ch
	 * @param freq
	 */
	public CharFreq(char ch, int freq) {
		this.ch = ch;
		this.freq = freq;
	}

	/**
	 * @param ch
	 * @param freq
	 */
	public CharFreq(int freq, CharFreq left, CharFreq right) {
		this.freq = freq;
		this.left = left;
		this.right = right;
	}

	@Override
	public int compareTo(CharFreq o) {
		return this.freq - o.freq;
	}

	/**
	 * @return
	 */
	public boolean isLeafNode() {
		return left == null && right == null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CharFreq [ch=" + ch + ", freq=" + freq + ", huffMan="
				+ huffMan + "]";
	}


}
