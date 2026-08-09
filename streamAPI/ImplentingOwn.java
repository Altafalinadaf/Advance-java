package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ImplentingOwn {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 5);


		// --------------------------------------------------
		// Predicate
		// --------------------------------------------------

		/*
		 * Predicate is a Functional Interface.
		 *
		 * It has one abstract method:
		 *
		 * boolean test(T t)
		 *
		 * It takes one value and returns boolean.
		 *
		 * Here we are checking whether a number is even.
		 */

		// Predicate using Anonymous Class
		// Predicate<Integer> p = new Predicate<>() {
		//     public boolean test(Integer n) {
		//         return n % 2 == 0;
		//     }
		// };


		// Predicate using Lambda Expression
		Predicate<Integer> p = n -> n % 2 == 0;

		System.out.println("Printing only even numbers");

		/*
		 * filter() expects a Predicate.
		 *
		 * Predicate checks each element.
		 *
		 * If test() returns true,
		 * that element is passed to the next operation.
		 */
		list.stream()
			.filter(p)
			.forEach(n -> System.out.println(n));


		// --------------------------------------------------
		// Function
		// --------------------------------------------------

		/*
		 * Function is a Functional Interface.
		 *
		 * It has one abstract method:
		 *
		 * R apply(T t)
		 *
		 * It takes one input and returns one output.
		 *
		 * Here Integer is input
		 * and Integer is output.
		 *
		 * Every number is multiplied by 2.
		 */

		// Function using Anonymous Class
		// Function<Integer, Integer> fun = new Function<>() {
		//     public Integer apply(Integer n) {
		//         return n * 2;
		//     }
		// };


		// Function using Lambda Expression
		Function<Integer, Integer> fun = n -> n * 2;

		System.out.println("Implemented using Function interface");

		/*
		 * map() expects a Function.
		 *
		 * Function transforms each element.
		 */
		list.stream()
			.map(fun)
			.forEach(n -> System.out.println(n));


		// --------------------------------------------------
		// Reduce
		// --------------------------------------------------

		/*
		 * reduce() is used to combine multiple elements
		 * into one final result.
		 *
		 * Here we are calculating the sum.
		 *
		 * 0 = initial value
		 *
		 * c = accumulated value
		 *
		 * e = current element
		 *
		 * c + e = addition
		 */


		// BinaryOperator using Anonymous Class
		// BinaryOperator<Integer> bi = new BinaryOperator<>() {
		//
		//     @Override
		//     public Integer apply(Integer c, Integer e) {
		//         return c + e;
		//     }
		//
		// };


		// BinaryOperator using Lambda Expression
		BinaryOperator<Integer> bi = (c, e) -> c + e;


		/*
		 * reduce() uses the BinaryOperator
		 * to combine the elements.
		 *
		 * 0 + 2 = 2
		 * 2 + 3 = 5
		 * 5 + 4 = 9
		 * 9 + 5 = 14
		 */
		int result = list.stream().reduce(0, bi);

		System.out.println("Sum = " + result);
	}
}