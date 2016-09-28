
public class MatthewNode<E> {
	public String EMPTY = "EmptyMatthewNode";
	private MatthewNode<E> next;
	private E data;
	
	protected MatthewNode(){
	}
	
	public MatthewNode(E data){
		this.data = data;
		this.next = new EmptyMatthewNode<E>();
	}
	
	public MatthewNode(E data, MatthewNode<E> next){
		this.data = data;
		this.next = next;
	}
	
	public boolean setNext(MatthewNode<E> next){
		try{
			this.next = next;
		} catch (Exception e){
			return false;
		}
		return true;
	}
	
	public E getData(){
		return this.data;
	}

	public boolean hasNext() {
		return !(next.getClass().equals(EmptyMatthewNode.class));
	}

	// Expects that hasNext() has been called
	// will return an EmptyMatthewNode if
	// hasNext() has not been checked and
	// next() is called on the last element.
	public MatthewNode<E> next() {	
		return this.next;
	}
}
