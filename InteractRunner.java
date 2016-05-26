import java.util.scanner;


public class InteructRunner{
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			calculator calc = new calculator();
			String exit = "no";
			while(!exit.equals("yes")) {
				System.out.println("Enter first arg: ";);
				 String first = reader.next();
				 System.out.println("Enter second arg:");
				 String second = reader.next();
				 System.out.println("Result: "+ calc.getResult());
				 Calc.clenresult();
				 System.out.println("Exit: yes/no");
				 exit = reader.next;
			}
		}
		finally{
			read.close();
		}
	}
}