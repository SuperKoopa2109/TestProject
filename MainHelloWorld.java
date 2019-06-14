/**
 * 
 */

/**
 * @author niklas
 *
 */
public class MainHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Output(1));
	}
	
	public static String Output(int varNumber){
		if(varNumber == 0) {
			return "Hello World";
		} else {
			return "Andere Eingabe";
		}
	}

}
