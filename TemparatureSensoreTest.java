import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class TemparatureSensoreTest {
	
	HashMap input = null;
	TemparatureSensor tempratue;
	
	@Before
	public void createInput() {
		input = new HashMap();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(40);
		temp.add(42);
		temp.add(42);
		temp.add(40);
		input.put("12000-12999", temp);
		tempratue = new TemparatureSensor();
	}
	@Test
	public void averageTemparatureTest() {
		ArrayList mock = new ArrayList<>();
		mock.add("12000-12999: 41.0");
		assertEquals(mock, tempratue.calculateAvgTemparature(input));//"[12000-12999: 41.0]");
	}

}
