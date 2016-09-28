/**
 * This is just a little project where I'm going 
 * to implement a Linked List and create a few 
 * methods for it.
 * */
public class MatthewLL<E> {
	private MatthewNode<E> start;
	private int size;
	
	public MatthewLL(){
		this.size = 0;
		this.start = new EmptyMatthewNode<E>();
	}
	
	public boolean add(E item){
		if(start.getClass().equals(EmptyMatthewNode.class)){
			this.start = new MatthewNode<E>(item);
			this.size++;
		}
		else{
			MatthewNode<E> temp = start;
			while(temp.hasNext()){
				temp = temp.next();
			}
			MatthewNode<E> newNode = new MatthewNode<E>(item);
			temp.setNext(newNode);
		}
		return true;
	}
	
	
	public int size(){
		return this.size;
	}
	
	public String toString(){
		if(start.getClass().equals(EmptyMatthewNode.class)){
			return "[]";
		}
		MatthewNode<E> temp = new MatthewNode<E>();
		temp.setNext(start);
		StringBuilder result = new StringBuilder();
		result.append("[");
		while(temp.hasNext()){
			temp = temp.next();
			result.append(temp.getData());
			if(temp.hasNext())
				result.append(", ");
		}
		result.append("]");
		return result.toString();
	}
	
}
