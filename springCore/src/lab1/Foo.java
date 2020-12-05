package lab1;

public class Foo {
	private Bar bar;
	private Baz baz;
	
	public Foo(){}
	
	public Foo(Bar bar){
		System.out.println("bar: "+bar);
	}
	
	public Foo(Bar bar, Baz baz){
		System.out.println("bar: "+bar);
		System.out.println("baz: "+baz);
	}
	
	
	
	public void process(){
		Bar bar = new Bar();
		Baz baz = new Baz();
		
		System.out.println("bar: "+bar);
		System.out.println("baz: "+baz);
	}
	
	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public Baz getBaz() {
		return baz;
	}

	public void setBaz(Baz baz) {
		this.baz = baz;
	}
	

	@Override
	public String toString() {
		return "Foo [bar=" + bar + ", baz=" + baz + "]";
	}

	public static void main(String[] args) {
		Foo foo = new Foo();
		foo.process();
	}
}
