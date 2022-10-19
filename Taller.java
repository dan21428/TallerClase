import java.util.Scanner;
public class Taller {

	public static void main(String[] args) {
		
		Ejercicio1();
		Ejercicio2();
		Ejercicio3();
		Ejercicio4();
		Ejercicio5();
		Ejercicio6();
		Ejercicio7();
		Ejercicio8();
        Ejercicio9();
        Ejercicio10();
        Ejercicio11();
        Ejercicio12();
        Ejercicio13();

	}
	public static void Ejercicio1() 
	{
		System.out.println(" "
				+ "\nEscribe un programa en el que se declaren las\r\n"
				+ "variables enteras numeroA y numeroB. Asignales los\r\n"
				+ "valores 89 y 323. Mostrar por consola el valor de cada\r\n"
				+ "variable, la suma, la resta, la división y la\r\n"
				+ "multiplicación. \n"
				+ " "); 
		
		double numeroA = 89 , numeroB = 323;
		
		
		System.out.println("numero A: " + numeroA  +" "+ "numero B: " + numeroB +
				" " + "suma: " + (numeroA + numeroB) + " " + "resta: " + (numeroA - numeroB) + 
				" " + "division: " + (numeroA / numeroB) + " " + "multiplicacion: " + (numeroA * numeroB)  );
		
		
				
	}
	public static void Ejercicio2() 
	{
		System.out.println("\n"
				+ "Realiza un conversor de pesos a dolar. La cantidad en\r\n"
				+ "pesos que se quiere convertir deberá estar\r\n"
				+ "almacenada en una variable.\r\n"
				+ "El valor de un dolar es: $3.895 pesos. \n"
				+ "");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad pesos que quiere convertir a dolares: ");	
		double peso = sc.nextDouble();
		double dolar = peso / 3895;
		System.out.println(peso + " Pesos, son: " + dolar + " Dolares.");
		
	}
	public static void Ejercicio3() 
	
	{
		System.out.println("\n"
				+ "Escribe un programa que calcule el total de una\r\n"
				+ "factura a partir de la base de la compra (precio sin\r\n"
				+ "IVA). La base de la compra estará almacenada en una\r\n"
				+ "variable.\r\n"
				+ "Salida en consola:\r\n"
				+ "Base sin IVA: $3500\r\n"
				+ "IVA: $665\r\n"
				+ "Total: $4165. \n"
				+ " "); 
		
		Scanner sc = new Scanner(System.in);
		
		int base = 0;
		int total =0;
		double iva = 0.19;
		System.out.println("Digite el valor base: ");
		base = sc.nextInt();
		
		System.out.println(((base * iva )+ base) + total);
	
		
		
		
		
		
	}
	public static void Ejercicio4() 

	{
		System.out.println("\n"
				+ "Escribe un programa en que dado un número del 1 a\r\n"
				+ "7 escriba el correspondiente nombre del día de la\r\n"
				+ "semana y lo muestre por consola. \n"
				+ " "); 
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		System.out.println("digite un numero del 1 al 7: ");
		numero = sc.nextInt();
		
		 switch(numero)
		{
		 case 1:
		 {
			 System.out.println("lunes");
			 break;
		 }
		 case 2:
		 {
			System.out.println("martes"); 
			break;
		 }
		 case 3:
		 {
			 System.out.println("miercoles");
			 break;
		 }
		 case 4:
		 {
			 System.out.println("jueves");
			 break;
		 }
		 case 5:
		 {
			 System.out.println("viernes");
			 break;
		 }
		 case 6:
		 {
			 System.out.println("sabado");
			 break;
		 }
		 case 7:
			 {System.out.println("domingo");
			 break;
			 }
	    default:
	    	System.out.println("ese dia no existe");
	    	
		}
		
		 
		
		
		
		
	}
    public static void Ejercicio5() 
    {
    	System.out.println("\n"
    			+ "Escribe un programa que ordene tres números\r\n"
    			+ "enteros introducidos por teclado. Que los muestre sin\r\n"
    			+ "ordenar y despues ordenados por consola. \n"
    			+ " "); 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Ingrese 3 números: ");
    	int[] numero = new int[3];
    	
    	for(int i = 0; i <= 2; i++) {
    	int numeros = sc.nextInt();
    	numero[i] = numeros;		
    	}
    	System.out.println("Ordenados... \n1: " + numero[0] + "\n2: " + numero[1] + "\n3: " + numero[2] + "\nDesordenados...");
    	
    	if(numero[0] >= numero[1] && numero[1] >= numero[2])
    		System.out.println("1: " + numero[0] + "\n2: " + numero[1] + "\n3: " + numero[2]);
    	
    	else if(numero[1] >= numero[0] && numero[0] >= numero[2])
    		System.out.println("1: " + numero[1] + "\n2: " + numero[0] + "\n3: " + numero[2]);
    	
    	else if(numero[2] >= numero[1] && numero[1] >= numero[0])
    		System.out.println("1: " + numero[2] + "\n2: " + numero[1] + "\n3: " + numero[0]);
    	
    	else if(numero[0] >= numero[2] && numero[2] >= numero[1])
    		System.out.println("1: " + numero[0] + "\n2: " + numero[2] + "\n3: " + numero[1]);
    	
    	else if(numero[1] >= numero[2] && numero[2] >= numero[0])
    		System.out.println("1: " + numero[1] + "\n2: " + numero[2] + "\n3: " + numero[0]);
    	
    	else if(numero[2] >= numero[0] && numero[0] >= numero[1])
    		System.out.println("1: " + numero[2] + "\n2: " + numero[0] + "\n3: " + numero[1]);
    	
    	
    	
    	
    	
    }
    public static void Ejercicio6() 
    {
    	System.out.println("\n"
    			+ "Escribe un programa que diga cuál es el primercifra\r\n"
    			+ "de un número entero introducido por teclado. Se\r\n"
    			+ "permiten números de hasta 5 cifras. \n"
    			+ " "); 
    	
    	Scanner sc = new Scanner(System.in);    
    	int numero , primer = 0;
    	System.out.print("digite un nuemro entero hasta de 5 cifras: ");
    	numero = sc.nextInt();
    	
    	if ( numero < 10 ) {
    	      primer = numero;
    	    }
    	    
    	    if (( numero >= 10 ) && ( numero < 100 )) {
    	      primer = numero / 10;
    	    }
    	    
    	    if (( numero >= 100 ) && ( numero < 1000 )) {
    	      primer = numero / 100;
    	    }
    	    
    	    if (( numero >= 1000 ) && ( numero < 10000 )) {
    	      primer = numero / 1000;
    	    }
    	    
    	    if ( numero >= 10000 ) {
    	      primer = numero / 10000;
    	    }
    	    
    	    System.out.println("La primera cifra del número introducido es el: " + primer);
    	   	  	
    	    	
    	
    }
    public static void Ejercicio7() 
    {
    	System.out.println("\n"
    			+ "Muestra los números múltiplos de 8 de 0 a 100\r\n"
    			+ "utilizando un bucle while. \n"
    			+ " "); 
    	
    	int numeros = 0;
    	System.out.println("Múltiplos de 8 del 0 a 100: ");
    	while(numeros < 100) {
    		if(numeros % 8 == 0 ) 
    			System.out.print(numeros + "  " );
    	numeros++;	
    	}
    	
    	
    	
    	
    	
    }
    public static void Ejercicio8() 
    {
    	System.out.println("\n"
    			+ "Escribe un programa que calcule el promedio de un\r\n"
    			+ "conjunto de números positivos introducidos por\r\n"
    			+ "teclado. El programa no sabe cuántos números se\r\n"
    			+ "ingresaran. El usuario indicará que ha terminado de\r\n"
    			+ "ingresar los datos cuando ingrese un número\r\n"
    			+ "negativo. \n"
    			+ " "); 
    	
    	Scanner sc = new Scanner(System.in);
    	int contador = 0; 
    	double suma = 0, numero = 0;
    	do {
    		System.out.println("Ingrese un número: ");
    		numero = sc.nextInt();
    		if(numero > 0) {
    		suma += numero;
    		contador++;
    		}
    	}
    	while(numero > 0);
    	if(contador > 1)
    	System.out.println("El promedio de los números ingresados es: " + (suma/contador));
    	
    	else
    		System.out.println("Número ingresado: " + suma);
        
        
        
    }
    public static void Ejercicio9()
    {
    	System.out.println("\n"
    			+ "Escribe un programa que lea por consola diez\r\n"
    			+ "números e indique cuántos son positivos, y cuántos\r\n"
    			+ "son negativos.\n"
    			+ " "); 
    	
    	 Scanner sc = new Scanner(System.in);
         int[] numeros = new int[10];
         int positivos  = 0, negativos = 0, cero = 0; 
         int i;        
                                                      
         System.out.println("Digite 10 numeros: ");
         for (i = 0; i < numeros.length; i++) 
         {            
             numeros[i] = sc.nextInt();
         }   
         
         for (i = 0; i < numeros.length; i++) {
             if (numeros[i] > 0) {
                 positivos++;
             } else if (numeros[i] < 0) {
                 negativos++;
             } else {
                 cero++;
             }
         }  
         
         System.out.println("Positivos: " + positivos);                                                                  
         System.out.println("Negativos: " + negativos);
         System.out.println("Ceros: " + cero);
         
    }
    public static void Ejercicio10()
    {
    	/*Escribe un programa que recibe un número por
    	consola e imprima una pirámide de números
    	Ejemplo
    	   1
    	  121
    	 12321
    	1234321*/
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Ingrese un número: ");
        int numeroNiveles = sc.nextInt();
        int numeroPosiciones = numeroNiveles * 2 -1;
        int posInicial = numeroNiveles;
        int posFinal = numeroNiveles;
        
        for (int i = 0; i < numeroNiveles; i++) {
          int contador = 1;
          String resultado = "";
          
          for (int j=0; j <= numeroPosiciones; j++) {
            if ((j < posInicial) || (j > posFinal)) {
              resultado += " ";
            } else {
              if (j < numeroNiveles) {
                resultado += contador;
                contador++;
              } else {
                resultado += contador;
                contador--;
              }
            }    
          }
          System.out.println(resultado);
          posFinal++;
          posInicial--;
        }
    }
    public static void Ejercicio11()
    {
    	System.out.println("\n"
    			+ "Crear un arreglo de 10 caracteres con el nombre\r\n"
    			+ "caracteres y asigna valores a los elementos según la\r\n"
    			+ "siguiente tabla:\r\n"
    			+ "Posición 0 1 2 3 4 5 6 7 8 9\r\n"
    			+ "Valor ‘h' ‘z' '@' ' ' '+' ‘J'. \n"
    			+ " "); 
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Escribir 10 Caracteres: ");
    	String caracteres = sc.next().toUpperCase();
    	char[] Carac = new char[caracteres.length()]; 
    	if(caracteres.length() <= 10) {
    		System.out.println("caracteres desglosada en el arreglo: ");
    	for(int i = 0; i < caracteres.length(); i++)
    	{
    		Carac[i] = caracteres.charAt(i);	
    	}
    	for(char c : Carac) 
    	{
    		System.out.println(c);
    	}
    	}
    	else
    		System.out.println("Limite superado para el arreglo. ");
    }
    public static void Ejercicio12()
    {
    	System.out.println("\n"
    			+ "Crea un programa que reciba por consola 10 números\r\n"
    			+ "y que luego los muestre en orden inverso, es decir, el\r\n"
    			+ "primero que se ingresa es el último en mostrarse y\r\n"
    			+ "viceversa.\n"
    			+ " ");
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int[] numeros = new int [10];	    
    	    
    	      	    
    	    System.out.println("Digite 10 números enteros: ");	
    	    
    	    	for(int i = 0; i < 10; i++)
    	    	{
    	    		numeros[i] = sc.nextInt();
    	    	}
    	    	System.out.println("los Números al reves son: " );
    	    int j = 9;
    	    while(j >= 0) 
    	    {
    	    	System.out.println(numeros[j--]);    	    
    	    }
    	    
     
    	
    }
    public static void Ejercicio13()
    {
    	System.out.println("\n"
    			+ "Crea un programa que solicite por consola 8 números\r\n"
    			+ "enteros y que luego muestre esos números junto con\r\n"
    			+ "la palabra \"par\" o \"impar\". \n"
    			+ " "); 
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int[] numero = new int [8];
    	
    	System.out.println("Digite 8 numeros enteros: ");
    	
    	for(int i = 0; i<= 7; i++)
    	{
    		int nums = sc.nextInt();
    		numero[i] = nums;
    	}
    	System.out.println("Clasificación: ");
    	for(int i = 0; i<= 7; i++) {
    	if(numero[i] % 2 == 0) 
    		 System.out.println(numero[i] + " Par");
    		else 
    			System.out.println(numero[i] + " Impar");
    	}
    }
    
    
}
