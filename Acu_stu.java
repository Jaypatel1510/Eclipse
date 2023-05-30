package jay_pr_1;

public class Acu_stu {
	String Enroll_no,result;
	
	public String getenrollno() {
		return Enroll_no;
	}
	
	public String getresult() {
		return result;
	}
	
	public void setenrollno(String Enroll_no) {
		this.Enroll_no = Enroll_no;
	}

	public void setresult(String result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return ("Enrollment number = "+getenrollno() +"   Result is :"+ getresult());
	}
}