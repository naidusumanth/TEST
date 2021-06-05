package Testing;

import Test.StudyMaterial;
import Test.Trainee;

class StudyMaterial {
	
	private String bookpublisher;
	private int numberofpages;
	private String  bookname;
	
	public String getBookPublisher() {
		return bookpublisher;
	}
	
	public void setBookPublisher(String bookpublisher) {
		
		this.bookpublisher = bookpublisher;
	}
	
	public int getNoOfPages() {
		
		return numberofpages;
	}
	
	public void setNoOfPages(int numberofpages) {
		
		this.numberofpages = numberofpages;
		
	}
	
	public String getBookName() {
		
		return bookname;
	}
	
	public void setBookName(String bookname) {
		
		this.bookname = bookname;
	}
	
}

class Trainee {
	
	private String traineename;
	private int bookcost;
	private String purchasedshop;
	
	public String getTraineeName() {
		
		return traineename;
	}
	
	public void setTraineeName(String traineename) {
		
		this.traineename = traineename;
		
	}
	
	public int getBookCost() {
		
		return bookcost;
	}
	
	public void setBookCost(int bookcost) {
		
		this.bookcost = bookcost;
		
	}
	
	public String getPurchasedShop() {
		
		return purchasedshop;
	}
	
	public void setPurchasedShop(String purchasedshop) {
		
		this.purchasedshop = purchasedshop;
	}
}

public class ManyToManyAssociation {
	public static void main(String[] args) {

	StudyMaterial smt = new StudyMaterial();
	
	smt.setBookPublisher("Rts Enterprises");
	smt.setNoOfPages(100);
	smt.setBookName("maths text book");
	
	StudyMaterial sm1 = new StudyMaterial();
	sm1.setBookPublisher("ca Enterprises");
	sm1.setNoOfPages(250);
	sm1.setBookName("science");
	
	StudyMaterial sm2 = new StudyMaterial();
	sm2.setBookPublisher("Rt  Enterprises");
	sm2.setNoOfPages(500);
	sm2.setBookName("c language  book");
	
	Trainee tn = new Trainee();
	tn.setTraineeName("sumanth");
	tn.setBookCost(200);
	tn.setPurchasedShop("raju  book stall");
	
	Trainee tn1 = new Trainee();
	tn1.setTraineeName("surya");
	tn1.setBookCost(300);
	tn1.setPurchasedShop("venkatesh book stall");
	
	Trainee tn2 = new Trainee();
	tn2.setTraineeName("ramesh");
	tn2.setBookCost(250);
	tn2.setPurchasedShop("venhar  book stall");
	
	System.out.println(tn.getTraineeName()+" Purchased"+sm1.getBookName()+" cost of  book"+tn.getBookCost()
	                     +"  purchased "+tn.getPurchasedShop()+"  pages in  book"+sm1.getNoOfPages()
	                        +" Published by"+sm1.getBookPublisher());
	

	}

}




