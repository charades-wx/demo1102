class Animal{
	String name;
	int tui;
	String color = "��";
	public Animal(String name,int tui){
		this.name = name ;
		this.tui  = tui  ;
		
	}
	public void eat(){
		System.out.println("�Ե���");
	}
	public void run(){
		System.out.println(this.name+"��"+this.tui+"������");
	}
}
class Dog extends Animal{
	String color = "�ڰ�";
	public Dog(String name,int tui){
		super(name,tui);
	}
	public void eat(){
		
		System.out.println("����");
		System.out.println(super.color);
	}
	
	
}
class Bird extends Animal{
	public Bird(String name,int tui){
		super(name,tui);
	}
	
}
class Test2{
	public static void main(String[] args){
		Dog d = new Dog("����",4);
		d.eat();
		d.run();
		Bird b = new Bird("��ȸ",2);
		b.eat();
		b.run();
	} 
	
}












