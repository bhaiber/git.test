package es.unosofta;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		System.out.println(new Test1().getValue());
		System.out.println(new Test2().getValue());
	}
}
