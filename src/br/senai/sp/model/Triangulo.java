package br.senai.sp.model;

public class Triangulo {
	
 public double base;
 public double altura;
 public double ladob;
 public double ladoc;
 public String nome;
 //metodos da classe
 public void mostrardimensoes() {
    System.out.println("---------------------------");
    System.out.println(nome);
    System.out.println("---------------------------");
 	System.out.println("base: " +base);
 	System.out.println( "altura:" +altura);
 	System.out.println("lado b:" +ladob);
 	System.out.println("lado c:" +ladoc);
 	calculararea();
	 }
   public void calculararea() {
   double area = (base * altura) / 2;
   System.out.println("Área = " + area);
	
   }
 }

 

