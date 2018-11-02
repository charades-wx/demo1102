class Animal{
	String name;
	int tui;
	String color = "ÂÌ";
	public Animal(String name,int tui){
		this.name = name ;
		this.tui  = tui  ;
		
	}
	public void eat(){
		System.out.println("³Ôµ¾¹È");
	}
	public void run(){
		System.out.println(this.name+"ÓÃ"+this.tui+"ÌõÍÈÅÜ");
	}
}
class Dog extends Animal{
	String color = "ºÚ°×";
	public Dog(String name,int tui){
		super(name,tui);
	}
	public void eat(){
		
		System.out.println("³ÔÈâ");
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
		Dog d = new Dog("¶ş¹ş",4);
		d.eat();
		d.run();
		Bird b = new Bird("ÂéÈ¸",2);
		b.eat();
		b.run();
	} 
	
}












