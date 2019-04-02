
public class Mammal {
	public static void main(String[] args) {
		Animal<Integer> a = new Animal<Integer>();
		a.addProperties(new Integer[]{0, 1, 2, 3});
		System.out.println(a);
		Animal<String> b = new Animal<String>();
		b.addProperties(new String[]{"a", "bc", "def", "ghij"});
		System.out.println(b);
	}
}
