package model;

public class CalculadoraImpostos {
    private CalculoImposto calculoImposto;

    public CalculadoraImpostos(CalculoImposto calculoImposto) {
        this.calculoImposto = calculoImposto;
    }

    public void setCalculoImposto(CalculoImposto calculoImposto) {
        this.calculoImposto = calculoImposto;
    }

    public double calcularImposto(double areaTotal, int idadeImovel, int numeroComodos, int numeroQuartos, double areaGaragem) {
        return calculoImposto.calcularImposto(areaTotal, idadeImovel, numeroComodos, numeroQuartos, areaGaragem);
    }
}