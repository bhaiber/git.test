package es.unosofta;

import es.unosofta.feature.Feature6;
import es.unosofta.feature.Feature7;

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
		System.out.println(new Test3().getValue());
		System.err.println("bugfix during v8");
		System.out.println(Feature6.getOutput());
		System.out.println(Feature7.getOutput());
		System.err.println("bugfix (v9)");
	}
}
