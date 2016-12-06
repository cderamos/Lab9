
public interface OrderedStructures {
	public abstract int size();
	public abstract boolean add(Comparable obj) throws IllegalArgumentException;
	public abstract Object get(int pos) throws IndexOutOfBoundsException;
	public abstract void remove(int pos) throws IndexOutOfBoundsException;

}

/**
*Description:
*public abstract int size() = Returns the # of elements currently stored in this OrderedStructure
*
*public abstract boolean add(Comparable obj) = Adds an element in increasing order according to the class'
*returns true if the element can be succesfully added to/ false otherwise
*if null, throws exception message
*
*public abstract Object get(int pos) = Returns the element at the specificed position ; first element has
*index 0. Throws exception if pos is out of range
*
*public abstract void remove(int pos) = Removes the element at the specified position; the first element
*has an index 0. Throws exception if pos is out of range
*/
