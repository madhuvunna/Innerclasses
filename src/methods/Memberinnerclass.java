package methods;

public class Memberinnerclass {
	private int data = 23;

	class Inner {
		void msg() {
			System.out.println("data is:" + data);
		}
	}

	public static void main(String[] args) {
		Memberinnerclass mic = new Memberinnerclass();
		Memberinnerclass.Inner in = mic.new Inner();
		in.msg();

	}

}
