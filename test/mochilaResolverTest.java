import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class mochilaResolverTest {
	mochilaResolver mr;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 mr = new mochilaResolver();
	}

	@After
	public void tearDown() throws Exception {}

	@Test
	public void testResolver() {
		ArrayList<item> totalTasks = new ArrayList<item>();
		totalTasks.add(new item(10, 3));
		totalTasks.add(new item(9, 1));		
		totalTasks.add(new item(1, 2));

				
		ArrayList<item> expected = new ArrayList<item>();
		expected.add(new item(1, 2));
	
		assertArrayEquals("Los arrays no son iguales",expected.toArray(), mr.resolver(totalTasks, totalTasks.size(), 9).toArray());
				
	}
	
	@Test
	public void testOrdena() {
		ArrayList<item> totalTasks = new ArrayList<item>();
		//Item ( PESO , PRIORIDAD )
		totalTasks.add(new item(1, 2));
		totalTasks.add(new item(10, 3));
		totalTasks.add(new item(9, 1));
		totalTasks.add(new item(5, 5));
		totalTasks.add(new item(3, 1));
		totalTasks.add(new item(1, 10));
		
		ArrayList<item> expected = new ArrayList<item>();
		// PRIMERO LOS DE MENOR PESO Y MAYOR PRIORIDAD
		expected.add(new item(1, 10));
		expected.add(new item(1, 2));
		expected.add(new item(5, 5));
		expected.add(new item(3, 1));
		expected.add(new item(9, 1));
		expected.add(new item(10, 3));
				
		assertArrayEquals("El array ordenado no es correcto",expected.toArray(), mr.ordena(totalTasks).toArray());
	}

}
