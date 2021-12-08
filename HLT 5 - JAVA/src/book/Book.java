package book;

public class Book {
// variable -> attribute
	String btitle;
	String bautor;
	String bnumber_of_pages;
	String bgenre;
	String bpublisher;
	
// methods
	public String getBtitle() {
	return btitle;
	}
	public void setBtitle(String btitle) {
	this.btitle = btitle;
	}
//************
	public String getBautor() {
	return bautor;
	}
	public void setBautor(String bautor) {
	this.bautor = bautor;
	}
//********
	public String getBnumber_of_pages() {
	return bnumber_of_pages;
	}
	public void setBnumber_of_pages(String bnumber_of_pages) {
	this.bnumber_of_pages = bnumber_of_pages;
	}
//********
	public String getBgenre() {
	return bgenre;
	}
	public void setBgenre(String bgenre) {
	this.bgenre = bgenre;
	}
	
//**********
	public String getBpublisher() {
	return bpublisher;
	}
	public void setBpublisher(String bpublisher) {
	this.bpublisher = bpublisher;
	}
	
// Main method- to run program	
	public static void main(String[] args) {
// create object of class book
	Book b1 = new Book();// creating object using constructor
	Book b2 = new Book();
	Book b3 = new Book();

//using set method setting Book's attribute
	b1.setBtitle("Harry Potter and the Philosopher's Stone");
	b1.setBautor("J.K.Rowling");
	b1.setBnumber_of_pages("223");
	b1.setBgenre("Fantasy");
	b1.setBpublisher("Bloomsbury");
	
	b2.setBtitle("The Da Vinci Code");
	b2.setBautor("Dan Brown");
	b2.setBnumber_of_pages("689");
	b2.setBgenre("Mystery, Detective, Conspiracy, Thiller");
	b2.setBpublisher("Doubleday");
	
	b3.setBtitle("The Power of Now: A Guide to Spiritual Enlightenment");
	b3.setBautor("Eckhart Tolle");
	b3.setBnumber_of_pages("236");
	b3.setBgenre("Spirituality, Psychology");
	b3.setBpublisher("New World Library");
	
//using get method display Book data -> b1, b2 and b3
	System.out.println(b1.getBtitle());
	System.out.println(b1.getBautor());
	System.out.println(b1.getBnumber_of_pages());
	System.out.println(b1.getBgenre());
	System.out.println(b1.getBpublisher());
	System.out.println("=======================");	
	
	System.out.println(b2.getBtitle());
	System.out.println(b2.getBautor());
	System.out.println(b2.getBnumber_of_pages());
	System.out.println(b2.getBgenre());
	System.out.println(b2.getBpublisher());
	System.out.println("=======================");	
	
	System.out.println(b3.getBtitle());
	System.out.println(b3.getBautor());
	System.out.println(b3.getBnumber_of_pages());
	System.out.println(b3.getBgenre());
	System.out.println(b3.getBpublisher());
	System.out.println("=======================");	
	
// Display Book information using String -> b1, b2 and b3
	System.out.println("Book Title : "+b1.getBtitle());
	System.out.println("Book Autor : "+b1.getBautor());
	System.out.println("Book Number of Pages : "+b1.getBnumber_of_pages());	
	System.out.println("Book Genre : "+b1.getBgenre());
	System.out.println("Book Publisher : "+b1.getBpublisher());
	System.out.println("=======================");	
	
	System.out.println("Book Title : "+b2.getBtitle());
	System.out.println("Book Autor : "+b2.getBautor());
	System.out.println("Book Number of Pages : "+b2.getBnumber_of_pages());	
	System.out.println("Book Genre : "+b2.getBgenre());
	System.out.println("Book Publisher : "+b2.getBpublisher());
	System.out.println("=======================");	
	
	System.out.println("Book Title : "+b3.getBtitle());
	System.out.println("Book Autor : "+b3.getBautor());
	System.out.println("Book Number of Pages : "+b3.getBnumber_of_pages());	
	System.out.println("Book Genre : "+b3.getBgenre());
	System.out.println("Book Publisher : "+b3.getBpublisher());
	System.out.println("=======================");	
	
	
	
	
	
	}
}
//============================================================


	