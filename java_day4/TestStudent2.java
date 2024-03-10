class student{
	int id;
	String name;
}
class TestStudent2{
	public static void main(String args[]){
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();
		student s4 = new student();
		
		s1.id=101;
		s2.id=102;
		s3.id=103;
		s4.id=104;

		s1.name="pratham";
		s2.name="sharma";
		s3.name="prashant";
		s4.name="raj";

		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		System.out.println(s3.id+" "+s3.name);
		System.out.println(s4.id+" "+s4.name);
	}
}
		