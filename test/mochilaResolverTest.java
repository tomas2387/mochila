import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class mochilaResolverTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testResolver() {
		mochilaResolver mr = new mochilaResolver();
		
		ArrayList<item> totalTasks = new ArrayList<item>();
		totalTasks.add(new item(1, 2));
		totalTasks.add(new item(10, 3));
				
		ArrayList<item> expected = new ArrayList<item>();
		expected.add(new item(1, 2));
	
		assertArrayEquals("Los arrays no son iguales",expected.toArray(), mr.resolver(totalTasks, totalTasks.size(), 9).toArray());
				
	}

}
