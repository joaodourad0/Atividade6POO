package model;

public class Teste {
	
	    public static void main(String[] args) {
	    	 Motor motor1 = new Motor(4, 150);
	         Motor motor2 = new Motor(8, 478);
	         Motor motor3 = new Motor(4, 130);
	         Motor motor4 = new Motor(4, 130);
	        
	         Passeio passeio1 = new Passeio("ABC1234", "Renault", "Captur", "Vermelho", 160, 4, motor1, 5);
	         Passeio passeio2 = new Passeio("XYZ1234", "Ferrari", "F40", "Vermelho", 324, 4, motor2, 2);
	         Carga carga1 = new Carga("ABC5678", "Hyundai", "HR", "Branco", 140, 4, motor3, 1800, 1600);
	         Carga carga2 = new Carga("ABC2468", "FIAT", "DUCATO", "Cinza", 160, 4, motor4, 1330, 2170);

	
	     

	       
	        

	        exibirInformacoes(passeio1);
	        exibirInformacoes(passeio2);
	        exibirInformacoes(carga1);
	        exibirInformacoes(carga2);
	    }

	    public static void exibirInformacoes(Veiculo veiculo) {
	        System.out.println("Placa: " + veiculo.getPlaca());
	        System.out.println("Marca: " + veiculo.getMarca());
	        System.out.println("Modelo: " + veiculo.getModelo());
	        System.out.println("Cor: " + veiculo.getCor());
	        System.out.println("Velocidade Máxima: " + veiculo.getVelocMax());
	        System.out.println("Quantidade de Rodas: " + veiculo.getQtdRodas());
	        System.out.println("Motor: " + veiculo.getMotor().getQtdPist() + " pistões, " + veiculo.getMotor().getPotencia() + "HP");
	        System.out.println("=======================================");
	    }
	}
