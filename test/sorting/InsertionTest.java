package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {

	private Insertion test;

	@BeforeEach
	public void beforeEach(){
		test = new Insertion();
	}

	@Test
	public void firstSort(){
		int[] list = {1, 9, 4, 6, 5, -6};
		int[] expected = {-6, 1, 4, 5, 6, 9};
		assertArrayEquals(expected, test.insertSort(list));
	}
	@Test
	public void secondSort(){
		int[] list = {2, 9, 5, 4, 8, 1, 6};
		int[] expected = {1, 2, 4, 5, 6, 8, 9};
		assertArrayEquals(expected, test.insertSort(list));
	}
	@Test
	public void thirdSortTest(){
		int[] list = {45, 11, 50, 59, 60, 2, 4, 7, 10};
		int[] expected = test.insertSort(list);
		System.out.println(Arrays.toString(expected));
		for(int lists : expected) {
			System.out.print(lists + ", ");
		}
		assertArrayEquals(expected, test.insertSort(list));
	}



}