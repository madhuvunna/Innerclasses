package methods;

interface Showable {
	void show();

	interface Message {
		void msg();
	}
}

//wirh in the class
//class S{
//	interface Message
//{
//		void msg();
//	}
//}

public class NestedInterfaceExampleinterface implements Showable.Message {

	public void msg() {
		System.out.println("Welocme to My Darling Chandu");
	}

	public static void main(String args[]) {
		Showable.Message message = new NestedInterfaceExampleinterface();
		message.msg();
	}
}
