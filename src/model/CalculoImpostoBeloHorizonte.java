package model;

public class CalculoImpostoBeloHorizonte implements CalculoImposto {
    
    public double calcularImposto(double areaTotal, int idadeImovel, int numeroComodos, int numeroQuartos, double areaGaragem) {
        return areaTotal * 7 + numeroQuartos * 4;
    }
}