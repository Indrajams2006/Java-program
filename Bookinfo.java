package javaCS;
class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME="Central Library";
	Book(){
		title=("Demo");
		author=("indraja");
		bookID=bookCounter;
		bookCounter++;
	}
	Book(String title ,String author){
		this.title=title;
		this .author=author;
		bookID=bookCounter;
		bookCounter++;
	}
	public void displayinfo(){
		System.out.println("Book title:"+title);
		System.out.println("Book Author:"+author);
		System.out.println("BookID:"+bookID);
	}
	public void displayinfo(boolean showLibrary) {
		if(showLibraray) {
			displayinfo();
			System.out.println("LIBRARY_NAME:"+LIBRARY_NAME);
		}
	}
	public static void displayinfo
			
		
		
		
		
		
	}
	
		
	}
}

public class Bookinfo {

}
