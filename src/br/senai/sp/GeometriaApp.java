package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
	
		//criando um triangulo
		System.out.println("criando Criando T1...");
		Triangulo t1 = new Triangulo();
		System.out.println("criando  Criando T2...");
		Triangulo t2 = new Triangulo();
		System.out.println("criando  Criando T3...");
		Triangulo t3 = new Triangulo();
	 	//definindo as dimensões dos triângulos
		t1.base = 10;
		t2.base = 10;
	    t1.altura = 12;
        t1.altura = 12;
        t2.altura = 8;
        t1.ladob = 20;
        t2.ladob = 20;
        t1.ladoc = 15;
        t2.ladoc = 15;
        t3.base = 18;
	    t3.altura = 14;
        t3.ladob = 20;
        t3.ladoc = 21;
        t1.nome = "Triangulo 001";
        t2.nome = "Triangulo 002";
        t3.nome = "Triangulo 003";
        //mostrar dimensoes
        t1.mostrardimensoes();
        t1.calculararea();
        t2.mostrardimensoes();
        t2.calculararea();
        t3.mostrardimensoes();
        t3.calculararea();
        
        
	}
}
