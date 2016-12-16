package demo.mode.adapter;

public class Target {
	public void targetMethod() {
		System.out.println("this is target method");
	}

	public static void main(String[] args) {
		Target target = new Adapter();
		target.targetMethod();
	}
}
