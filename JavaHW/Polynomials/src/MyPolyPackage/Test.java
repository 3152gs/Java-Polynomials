package MyPolyPackage;
import java.io.*;
public class Test {

	public static void main(String[] args) {
		
		Polynomial Polynomial1 = new Polynomial();
		String line = null;
		
		
	
        /*
         * Read contents of a file
         * Handling the exceptions 
         * 
         */ 
        File inputFile = new File ("Polynomial_Inputs.txt");
      
        
        try{
        	FileReader readMyFile= new FileReader(inputFile);
        	BufferedReader bufferedReader = new BufferedReader(readMyFile);
        	
        	while((line=bufferedReader.readLine())!=null){
        	String[] separator = line.split(";");
        	int coefficient=0 , exponent=1;
        	
        	for(int i=1;i<separator.length;i++){
				if(i%2!=0){
					coefficient=Integer.parseInt(separator[i]);
				}
			      else{
			              exponent=Integer.parseInt(separator[i]);
			              Polynomial1.insert(coefficient,exponent);
					}
				
				}
        	/*
        	 * Making call to the appropriate methods
        	 * Insertion followed by deletion, product and the reverse format of the polynomial
        	 */
        	Polynomial1.insert(coefficient,exponent);
        	
        	System.out.println("After insertion: ");
        	System.out.println(Polynomial1.product());
        	
        	Polynomial1.delete(5,3);
        	
        	System.out.println("After deleting: ");
        	System.out.println(Polynomial1.product());
        	
        	System.out.println("Polynomial in reverse order is ");
        	System.out.println(Polynomial1.reverse());
        	}
        
        	bufferedReader.close();
        }
			catch(FileNotFoundException ex){
				System.out.println("Cannot open the file");
        }
        catch(IOException ex){
			System.out.println("ERROR : "+ex);
		}
	}
}
        


        