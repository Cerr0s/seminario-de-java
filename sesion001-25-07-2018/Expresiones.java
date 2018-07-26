/*
	@author Luis Angel Cerritos Ortiz
	Clase generada en la sesión para explicar el uso de expresiones logicas
	25/07/2018
*/


class Expresiones {
	
	public static void main (String[] args) {
		int octal = 0;
		int decimal = 53;

		System.out.println ((octal = decimal) + "-" + ((decimal = octal) + 3) - 1);

	}
}