abstract class Graph{
	double a;
	double b;
	public Graph(double a,double b){
		this.a = a;
		this.b = b;
	}
	public abstract void area();
	public abstract void cir();
}
class Circle extends Graph{
	public Circle(double a,double b){
		super(a,b);
	}
	public  void area(){
		System.out.println("Բ������ǣ�"+(2*a*a));
	}
	public  void cir(){
	System.out.println("Բ���ܳ��ǣ�"+(2*a*b));
	}
}
class Rectangle extends Graph{
	public Rectangle(double a,double b){
		super(a,b);
	}
	public  void area(){
		System.out.println("���ε�����ǣ�"+(a*b));
	}
	public  void cir(){
	System.out.println("���ε��ܳ��ǣ�"+(2*a+2*b));
	}
}
class Test3{
	public static void main(String[] args){
		Circle c = new Circle(3.14,2);
		c.area();
		c.cir();
		Rectangle r = new Rectangle(3,2);
		r.area();
		r.cir();
	}
}














