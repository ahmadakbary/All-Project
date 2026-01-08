package Day6;
public class StudentAppro2 {
	int sid;
	String sname;
	char grade;
	
void getdata(int id,String name,char g){
		sid=id;
		sname=name;
		grade=g;
	}
	void display() {
System.out.println(sid+" "+sname+" "+grade);
	}
}
