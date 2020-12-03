package AutoLista;

import static org.junit.Assert.*;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListTest {
	
	private List cars = new List();
	
	@Before
	public void init()
	{
		this.cars.add("Toyota");
		this.cars.add("Opel");
		this.cars.add("Dacia");
		this.cars.add("BMW");
		this.cars.add("Audi");
		this.cars.add("Trabant");
		this.cars.add("Renault");
	}

	@Test
	public void TesztelemUresE() 
	{
		//assertFalse(this.cars.isEmpty());
		assertTrue(this.cars.isEmpty());
	}
	
	@Test
	public void EgyElemHozzaadasa()
	{
		this.cars.add("Lada");
		assertEquals("Tesztelem, hogy bekerül-e az új elem a listába?",8,this.cars.size());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void EltavolitTeszt() 
	{
		this.cars.remove("Traktor");
	}

	@Test
	public void EltMindenElemet() 
	{
		this.cars.removeAll();
		assertTrue(this.cars.isEmpty());
	}
	
	@After
	public void destroy() {this.cars.removeAll();}
}
