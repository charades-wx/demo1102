interface Worker{
	
	public void work();
}
class Student {
	String name;
	public Student(String name){
		this.name = name;
	}
	public void study(){
		System.out.println(name + "ѧϰ");
	}
	
}
class StuWork extends Student implements Worker{
	
	public StuWork(String name){
		super(name);
	}
	
	public void work(){
		
		System.out.println(name + "׬Ǯ");
	}
}
class Test4{
public static void main(String[] args){
	StuWork p = new StuWork("ѧ��");
	
	p.study();
	p.work();
	
	}
}



























