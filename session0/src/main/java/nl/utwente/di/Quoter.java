package nl.utwente.di;


public class Quoter {
	public double getBookPrice(String isbn){
		double result = 0.0;
		if(isbn.equals("1")){
			result = 10.0;
		} else if(isbn.equals("2")){
			result = 45.0;
		} else if(isbn.equals("3")){
			result = 20.0;
		} else if(isbn.equals("4")){
			result = 35.0;
		} else if(isbn.equals("5")){
			result = 50.0;
		}
		return result;
	}
}