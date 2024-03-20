import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();

        double number1;
        double number2;

        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("Ingrese el primer numero: ");
        number1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        number2 = sc.nextDouble();

        do{
           System.out.println("Bienvenidos a la calculadora:");
            System.out.println("1. Sumar:");
            System.out.println("2. Restar:");
            System.out.println("3. Multiplicar:");
            System.out.println("4. Dividir:");
            System.out.println("5. Salir:");
            System.out.println("Ingrese una opcion:");
            option = sc.nextInt();

            switch (option){

                case 1:
                    System.out.println("La suma es: " + miCalculadora.add(number1, number2));
                    break;

                case 2:
                    System.out.println("La resta es: " + miCalculadora.subtract(number1, number2));
                    break;

                case 3:
                    System.out.println("La multiplicacion es: " + miCalculadora.times(number1, number2));
                    break;

                case 4:
                    if(number2 == 0){
                        System.out.println("Inrese un numero dferente de cero");
                    }
                    System.out.println("La division  es: " + miCalculadora.divide(number1, number2));
                    break;

                case 5:
                    System.out.println("Saliendo del programa........ ");
                    break;

                default:
                    break;



            }

        }while(option != 5);
        sc.close();
    }
}