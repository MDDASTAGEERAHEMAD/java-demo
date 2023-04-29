package exception;

@SuppressWarnings("serial")
public class ThrowDemo extends Throwable {

	ArithmeticException e = new ArithmeticException();

	public static void main(String[] args) {

		try {
			System.out.println(20 / 0);
		}

		catch (ArithmeticException e) {

			System.out.println("can't Devide by zero");
		}

		finally {

			System.out.println("hshs");

		}

	}

}
