import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	static int[] arr1 = {2, 5, 7, 8, 10};
	static int[] arr2 = {77, 52, 112, 45, 63};
	static int[] arr3 = {115, 147, 203, 159, 302, 245, 401}; 
	
	@Test
	public void testing_sum_with_array1() {
		assertEquals(32, SimpleMath.sum(arr1));
	}

	@Test
	public void testing_sum_with_array2() {
		assertEquals(349, SimpleMath.sum(arr2));
	}

	@Test
	public void testing_sum_with_array3() {
		assertEquals(1572, SimpleMath.sum(arr3));
	}

	@Test
	public void testing_max_with_array1() {
		assertEquals(10, SimpleMath.max(arr1));
	}

	@Test
	public void testing_max_with_array2() {
		assertEquals(112, SimpleMath.max(arr2));
	}

	@Test
	public void testing_max_with_array3() {
		assertEquals(401, SimpleMath.max(arr3));
	}

	@Test
	public void testing_min_with_array1() {
		assertEquals(2, SimpleMath.min(arr1));
	}

	@Test
	public void testing_min_with_array2() {
		assertEquals(45, SimpleMath.min(arr2));
	}

	@Test
	public void testing_min_with_array3() {
		assertEquals(115, SimpleMath.min(arr3));
	}
}