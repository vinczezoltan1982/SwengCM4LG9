package AutoLista;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class List {
	
	private ArrayList<String> cars;
	
	public List() {this.cars = new ArrayList<String>();}

	public void add(String car) {this.cars.add(car);}
	
	public void remove(String car)
	{
		int index = this.cars.indexOf(car);
		
		if(index == -1) throw new NoSuchElementException();
		
		this.cars.remove(index);
	}
	
	public int size() {return this.cars.size();}
	
	public boolean isEmpty() {return this.cars.isEmpty();}
	
	public void removeAll() {this.cars.removeAll(cars);}
}