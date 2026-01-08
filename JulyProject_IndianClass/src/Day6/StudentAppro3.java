package Day6;
public class StudentAppro3 {

	int sid;
	String sname;
	char grade;
	
StudentAppro3(int id, String name, char g){
		sid=id;
		sname=name;
		grade=g;
	}
void getdata(int id, String name, char g) {	
		sid=id;
		sname=name;
		grade=g;	
	}
void display() {
System.out.println(sid+" "+sname+" "+grade);
	}
	
	
	
}
