package pcgExercício2;

public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clientes = new String[5][4];

		clientes[0][0] = "João";
		clientes[0][1] = "Rua das Flores, 123";
		clientes[0][2] = "534.899.910-52";
		clientes[0][3] = "(11) 57961-2078";
		clientes[1][0] ="Maria";
		clientes[1][1] = "Avenida dos Anjos, 456";
		clientes[1][2] = "283.388.160-60";
		clientes[1][3] = "(11) 58297-3472";
		clientes[2][0] = "Pedro";
		clientes[2][1] = "Praça da LIBERDADE, 789";
		clientes[2][2] = "623.536.670-15";
		clientes[2][3] = "(11) 29698-5672";

		for (int i = 0; i < 3; i++) {
			System.out.println("Nome: " + clientes[i][0]);
			System.out.println("Endereço: " + clientes[i][1]);
			System.out.println("CPF: " + clientes[i][2]);
			System.out.println("Telefone: " + clientes[i][3]);
			System.out.println();
			
		}
		
	}

}
