package lab5;

public class ExampleBean {
	private AnotherBean beanOne;
	private YetAnotherBean beanTwo;
	private int i;
	
	public AnotherBean getBeanOne() {
		return beanOne;
	}
	public void setBeanOne(AnotherBean beanOne) {
		this.beanOne = beanOne;
	}
	public YetAnotherBean getBeanTwo() {
		return beanTwo;
	}
	public void setBeanTwo(YetAnotherBean beanTwo) {
		this.beanTwo = beanTwo;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	@Override
	public String toString() {
		return "ExampleBean [beanOne=" + beanOne + ", beanTwo=" + beanTwo
				+ ", i=" + i + "]";
	}
	
	
}
