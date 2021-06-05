package Testing;



class company {
	
	private String companyname;
	
  public String getCompanyname() {
		
		return companyname;
	}
  
  public void setCompanyname(String companyname) {
	  
	  this.companyname = companyname;
	  
	}
  
  }

class Employee {
	
	private String empname;
	private int empid;
	private int rating;
	private int syear;
	
	public String getEmpname() {
		
		return empname;
	}
	
	public void setEmpname(String empname) {
		
		this.empname = empname;
		
	}
	
	public int getEmpid() {
		
		return empid;
	}
	
	public void setEmpid(int empid) {
		
	    this.empid = empid;
		
	}
	
	public int getRating() {
		
		return rating;
	}
	
	public void setRating(int rating) {
		
		this.rating = rating;
	}
	
	public int getsyear() {
		
		return syear;
	}
	
	public void setSyear(int syear) {
		
		this.syear = syear;
	}
	
}

public class OneToManyAssociation {

	public static void main(String[] args) {

		company cm = new company();
		cm.setCompanyname("Techouts");
		
		Employee ep = new Employee();
		ep.setEmpname("Bharath");
		ep.setEmpid(1551);
		ep.setRating(4);
		ep.setSyear(2021);
		
		Employee ep1 = new Employee();
		ep1.setEmpname("Kareem");
		ep1.setEmpid(1549);
		ep1.setRating(5);
		ep1.setSyear(2021);
		
		Employee ep2 = new Employee();
		ep2.setEmpname("Sumanth");
		ep2.setEmpid(1550);
		ep2.setRating(4);
		ep2.setSyear(2021);
		
	System.out.println(ep.getEmpname()+" is an employee of"+cm.getCompanyname()+" withemployeeid:"+ep.getEmpid()+" got rating"+ep.getRating()+" he joined in the year"+ep.getsyear());
	
	System.out.println(ep1.getEmpname()+" is an employee of"+cm.getCompanyname()+" withemployeeid:"+ep.getEmpid()+" got rating"+ep1.getRating()+" he joined in the year"+ep1.getsyear());
	
	System.out.println(ep2.getEmpname()+" is an employee of"+cm.getCompanyname()+" withemployeeid:"+ep2.getEmpid()+" got rating"+ep2.getRating()+" he joined in the year"+ep2.getsyear());
	
	
	}

}



