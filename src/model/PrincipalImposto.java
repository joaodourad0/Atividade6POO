package model;

public class PrincipalImposto {
	
	    public static void main(String[] args) {
	        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos(new CalculoImpostoCuritiba());
	        double imposto = calculadoraImpostos.calcularImposto(100, 60, 4, 2, 0);
	        System.out.println("Imposto calculado: " + imposto);
	    }

}
