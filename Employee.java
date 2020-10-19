package PA6;
import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Employee {
	private String employeeID;
	private String name;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private double salary;
	public final void setEmployeeID(final String employeeID) throws Exception {
		String a = employeeID.substring(0, 3);
	    String b = employeeID.substring(3, 8);
		StringBuilder sb = new StringBuilder();
		sb.append(a + "-" + b);
		if (a.length() != 3 || b.length() != 5) {
			throw new Exception("Incorrect Employee Id Format");
		}
		else {
			this.employeeID = sb.toString();
		}
	}
	public final void setDateOfBirth(final String dateOfBirth) throws Exception {
		 Date dofb = DateFormat.getFormattedDate(dateOfBirth);
	     Date today = DateFormat.getTodaysDate();
	     boolean truth = today.after(dofb);
	     if(truth == false) {
	    	 throw new Exception("Invalid Date");
	     }
	     else {
	         this.dateOfBirth=dofb;
	     }
	}
	public final void setDateOfJoining(final String dateOfJoining) throws Exception {
		Date formatdate = DateFormat.getFormattedDate(dateOfJoining);
	    Date today = DateFormat.getTodaysDate();
	    if(today.after(formatdate)== true||formatdate.before(dateOfBirth)== true) {
	    	if(today.after(formatdate)== true) {
	    		throw new Exception("Date of joining is in future");
	    	}
	    	else {
	    		throw new Exception("Date of joining < Date of birth");
	    	}
	    }

	    else {
	            this.dateOfJoining=formatdate;
	        }
	}
	public final void setName(final String name) {
		this.name = name;
	}
	public final void setSalary(final double salary) {
		this.salary = salary;
	}
	public final String getEmployeeID() {
		return employeeID;
	}
	public final String getName() {
		return name;
	}
	public final Date getDateOfBirth() {
		return dateOfBirth;
	}
	public final Date getDateOfJoining() {
		return dateOfJoining;
	}
	public final double getSalary() {
		return salary;
	}
	public final double getEmploymentDuration() {
		long diffInMillies = 0;
		try {
			diffInMillies = DateFormat.getTodaysDate().getTime() - dateOfJoining.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		return diff / 365.00;
	}
}
