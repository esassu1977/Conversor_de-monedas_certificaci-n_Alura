import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDato = new Scanner(System.in);
        int opcionDivsa;
        double monto;
        ConversionDivisa transaccion = new ConversionDivisa();

        System.out.println("╔════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║ Conversor de divisas ALURA, para iniciar elija alguna de las opciones: ║");
        System.out.println("║                                                                        ║");
        System.out.println("║ 1) Convertir pesos mexicanos a dolares.                                ║");
        System.out.println("║ 2) Convertir dolares a pesos mexicanos.                                ║");
        System.out.println("║ 3) Convertir pesos chilenos a dolares.                                 ║");
        System.out.println("║ 4) Convertir dolares a pesos chilenos.                                 ║");
        System.out.println("║ 5) Convertir reales brasileños a dolares.                              ║");
        System.out.println("║ 6) Convertir dolares a reales brasileños.                              ║");
        System.out.println("║ 7) Convertir pesos argentinos a dolares.                               ║");
        System.out.println("║ 8) Convertir dolares a pesos argentinos.                               ║");
        System.out.println("║ Digite la opción de la operación:                                      ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════╝");

        opcionDivsa = entradaDato.nextInt();

        switch (opcionDivsa){

            case 1:
                transaccion.setAliasDivisa("MXN");
                System.out.println(String.format("La cotización del dolar en pesos para hoy es: $1 dolar = $%.2f"
                        ,transaccion.getPrecioDivisa())+ " pesos mexicanos");
                System.out.print("Ingrese el monto de pesos mexicanos a convertir a dolares: ");
                monto = entradaDato.nextDouble();
                transaccion.setCantidadAconvertir(monto);
                System.out.println(String.format("La cantidad equivalente en dolares a entregar es de: $%.2f"
                        ,transaccion.getTotalDivisaAdolar()) + " dolares");
                break;

            case 2:
                transaccion.setAliasDivisa("MXN");
                System.out.println(String.format("La cotización del peso mexicano en dolares para hoy es: $1 peso = $%.2f"
                        ,1/transaccion.getPrecioDivisa())+ " dolares");
                System.out.print("Ingrese el monto de dolares a convertir a pesos mexicanos: ");
                monto = entradaDato.nextDouble();
                transaccion.setCantidadAconvertir(monto);
                System.out.println(String.format("La cantidad equivalente en pesos a entregar es de: $%.2f"
                        ,transaccion.getTotalDolarAdivisa()) + " pesos mexicanos");
                break;

            case 3:
                transaccion.setAliasDivisa("CLP");
                System.out.println(String.format("La cotización del dolar en pesos para hoy es: $1 dolar = $%.2f"
                        ,transaccion.getPrecioDivisa())+ " pesos chilenos");
                System.out.print("Ingrese el monto de pesos chilenos a convertir a dolares: ");
                monto = entradaDato.nextDouble();
                transaccion.setCantidadAconvertir(monto);
                System.out.println(String.format("La cantidad equivalente en dolares a entregar es de: $%.2f"
                        ,transaccion.getTotalDivisaAdolar()) + " dolares");
                break;

            case 4:
                transaccion.setAliasDivisa("CLP");
                System.out.println(String.format("La cotización del peso chileno en dolares para hoy es: $1000 pesos = $%.2f"
                        ,(1/transaccion.getPrecioDivisa())*1000)+ " dolares");
                System.out.print("Ingrese el monto de dolares a convertir a pesos chilenos: ");
                monto = entradaDato.nextDouble();
                transaccion.setCantidadAconvertir(monto);
                System.out.println(String.format("La cantidad equivalente en pesos a entregar es de: $%.2f"
                        ,transaccion.getTotalDolarAdivisa()) + " pesos chilenos");
                break;

            case 5:
                transaccion.setAliasDivisa("BRL");
                System.out.println(String.format("La cotización del dolar en reales para hoy es: $1 dolar = $%.2f"
                        ,transaccion.getPrecioDivisa())+ " reales brasileños");
                System.out.print("Ingrese el monto de reales a convertir a dolares: ");
                monto = entradaDato.nextDouble();
                transaccion.setCantidadAconvertir(monto);
                System.out.println(String.format("La cantidad equivalente en dolares a entregar es de: $%.2f"
                        ,transaccion.getTotalDivisaAdolar()) + " dolares");
                break;

            case 6:
                transaccion.setAliasDivisa("BRL");
                System.out.println(String.format("La cotización del real brasileño en dolares para hoy es: $1 real = $%.2f"
                        ,1/transaccion.getPrecioDivisa())+ " dolares");
                System.out.print("Ingrese el monto de dolares a convertir a reales brasileños: ");
                monto = entradaDato.nextDouble();
                transaccion.setCantidadAconvertir(monto);
                System.out.println(String.format("La cantidad equivalente en reales a entregar es de: $%.2f"
                        ,transaccion.getTotalDolarAdivisa()) + " reales brasileños");
                break;


            case 7:
                transaccion.setAliasDivisa("ARS");
                System.out.println(String.format("La cotización del dolar en pesos argentinos para hoy es: $1 dolar = $%.2f"
                        ,transaccion.getPrecioDivisa())+ " pesos argentinos");
                System.out.print("Ingrese el monto de pesos a convertir a dolares: ");
                monto = entradaDato.nextDouble();
                transaccion.setCantidadAconvertir(monto);
                System.out.println(String.format("La cantidad equivalente en dolares a entregar es de: $%.2f"
                        ,transaccion.getTotalDivisaAdolar()) + " dolares");
                break;

            case 8:
                transaccion.setAliasDivisa("CLP");
                System.out.println(String.format("La cotización del peso argentino en dolares para hoy es: $1000 pesos = $%.2f"
                        ,(1/transaccion.getPrecioDivisa())*1000)+ " dolares");
                System.out.print("Ingrese el monto de dolares a convertir a pesos argentinos: ");
                monto = entradaDato.nextDouble();
                transaccion.setCantidadAconvertir(monto);
                System.out.println(String.format("La cantidad equivalente en pesos a entregar es de: $%.2f"
                        ,transaccion.getTotalDolarAdivisa()) + " pesos argentinos");
                break;
        }
    }

    }