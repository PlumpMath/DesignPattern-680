package demo.mode.adapter;

public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();

	@Override
	public void targetMethod() {
		adaptee.specialMethod();
	}
}
