package test;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

	public static void main(String[] args) {
		Test test = new Test("pablo");
		Test test1 = new Test("dario");
		Test test2 = new Test("armando");
		Test test3 = new Test("claudio");
		Test test4 = new Test("silvio");
		
		List<Test> lista = new ArrayList<>();
		lista.add(test);
		lista.add(test1);
		lista.add(test2);
		lista.add(test3);
		lista.add(test4);
		
		for(Test obj : lista) {
			System.out.println(obj);
		}
	}

}
