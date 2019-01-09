import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		System.out.println("Lion always ROAR");
//		foo();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int sum = Arrays.stream(arr).sum();
		System.out.println("Sum : " + sum);

		System.out.println(Arrays.stream(arr).max().getAsInt());

		Arrays.stream(arr).filter(e -> e % 5 == 0).forEach(System.out::print);
		Arrays.stream(arr).forEach(System.out::println);
	}

	private static void foo() {

		System.out.println("Hey.....Good practice buddy....");
		System.out.println("Hey.....Keep it up.......");

	}
}
