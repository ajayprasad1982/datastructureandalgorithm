/**
 * 
 */
package com.behavioral.Iterator;

/**
 * @author aprasa03
 *
 */
public class NameRepository<E>{
	 public String names[] = {"Ajay" , "Imran" ,"Dibya" , "Bijay"};

	public Iterator<E> getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	
private class NameIterator implements Iterator<E>{

	int index;
	@Override
	public boolean hasNext() {
		if(index<names.length)
			return true;
		return false;
	}

	@Override
	public E next() {
		if(this.hasNext())
		{
			E next=(E)names[index++];
			return next ;
		}
		return null;
	}
	
}

}
	