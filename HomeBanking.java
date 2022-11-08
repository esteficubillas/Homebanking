import java.io.DataInput;
import java.util.*;
public class HomeBanking {
/**
Realizado por Cynthia, Analía Rossotti, Estefanía Cubillas, Daniela Homobono y Eugenia Bagur.
Versión 1.0
octubre de 2022
Desafío Codo a Codo
*/
    public static void main(String[] args) {
        Scanner miTeclado;
        miTeclado = new Scanner(System.in);

            String nombre;
            int contraseña;
            int password = 1234;
            int opcion = 0;
            double saldo = 2000000;
            String cbu;
            double transferencia;
            int salida = 0;
            String servici;
            double monto;

            System.out.println("BIENVENIDO A SU HOMEBANKING");
            System.out.println("INGRESE SU NOMBRE");
            nombre = miTeclado.nextLine();
            System.out.println("HOLA "+ nombre);

            do{
                System.out.println("INGRESE SU CONTRASEÑA");
                contraseña = miTeclado.nextInt();
                if(contraseña == password){
                    System.out.println("CONTRASEÑA CORRECTA"); 
                }else{
                        System.out.println("CONTRASEÑA INCORRECTA. INTENTE NUEVAMENTE Y CONFIRME SU CONTRASEÑA");
                    }
                }while(contraseña!= password);

            do{
                System.out.println("______________________________________________________________________        ");
                System.out.println("\nMENU DE OPCIONES \n1. CONSULTA DE SALDO \n2. TRANSFERENCIA \n3. PAGOS \n4. SALIR ");
                opcion = miTeclado.nextInt();

                switch (opcion) {
                                    case 1:
                                    System.out.println(nombre + ", su saldo actual es: $"+ saldo + "\n\n1. Para volver al menu principal\n2. Salir\n");
                                    salida = miTeclado.nextInt();
                                    break;

                                    case 2:
                                        miTeclado = new Scanner(System.in);
                                        System.out.println("\nIngrese el CBU o Alias al cual desea transferir: ");
                                        cbu = miTeclado.nextLine();
                                        System.out.println("Ingrese el monto a transferir: ");
                                        transferencia = miTeclado.nextDouble();
                                        if (transferencia < saldo) {
                                            saldo = saldo - transferencia;
                                            System.out.println("\nSu transferencia por " + transferencia +" ha sido realizada correctamente, su saldo actual es de: $" + saldo +".\n\n1. Para volver al menu principal\n2. Salir\n");
                                            salida = miTeclado.nextInt();
                                        } else {
                                            System.out.println("\nSaldo insuficiente. Su saldo actual es: $" + saldo + "\n1. Para volver al menu principal\n2. Salir\n");
                                            salida = miTeclado.nextInt();
                                        }
                                        break;

                                    case 3:
                                            do { 
                                            miTeclado = new Scanner(System.in);
                                            System.out.println("\nIngrese el nombre de la empresa que desea abonar: ");
                                            servici = miTeclado.nextLine();
                                            System.out.println("Ingrese el monto a pagar: ");
                                            monto = miTeclado.nextDouble();
                                            if (saldo >= monto) {
                                                saldo = saldo - monto;
                                        System.out.println("\nSu factura ha sido abonada. Su saldo actual es: $" + saldo + "\n\nIngrese: \n1. Para volver al menu principal\n2. Salir\n3. Hacer otro pago\n");
                                                salida = miTeclado.nextInt();
                                            } else {
                                                System.out.println("\nSaldo insuficiente. Su saldo actual es: $" + saldo + "\n\nIngrese: \n1. Para volver al menu principal\n2. Salir\n");
                                                salida = miTeclado.nextInt();
                                            }
                                            }while (salida == 3);
                                    break;
 
                                    case 4:
                                        if (opcion == 4){
                                            System.out.println("******NO OLVIDE RETIRAR SU TARJETA*****");
                                            System.exit(0);
                                            break;
                                        }
                }                
                      
            }while(opcion !=0 && salida != 2);
                System.out.println("******NO OLVIDE RETIRAR SU TARJETA*****");
                System.exit(0);
       
    }   
        
}