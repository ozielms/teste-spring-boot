package br.digitalinnovation;

public class Main {

	public static void main(String[] args) {
		
		
		ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();
		
		minhaListaEncadeada.add("c1"); //0
		minhaListaEncadeada.add("c2"); //1
		minhaListaEncadeada.add("c3"); //2
		minhaListaEncadeada.add("c4"); //3
		minhaListaEncadeada.add("c5"); //4
		minhaListaEncadeada.add("c6"); //5
		minhaListaEncadeada.add("c7"); //6
		
		System.out.println(minhaListaEncadeada);
		
		minhaListaEncadeada.remove(3);
		minhaListaEncadeada.add(3, "99");
		System.out.println(minhaListaEncadeada);
		
		System.out.println(minhaListaEncadeada.get(2));
	}

}
