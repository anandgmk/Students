package abc.college;
import jkl.college.SecurityGuards;
import xyz.college.PermenentStaff;
public class CollegeStaff {
	public void staffName(){
		System.out.println("Ana");
	}
	public void staffName1() {
		System.out.println("GMK");
	}
	public static void main(String[] args) {
		CollegeStaff c = new CollegeStaff();
		c.staffName();
		c.staffName1();
		PermenentStaff p = new PermenentStaff();
		p.pStaff();
		p.pStaff1();
		DeoStaff d = new DeoStaff();
		d.outSourcing();
		d.outSourcing1();
		SecurityGuards s = new SecurityGuards();
		s.secGuards1();
		s.secGuards2();
	}
	}


