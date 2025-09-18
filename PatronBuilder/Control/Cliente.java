// Cliente
import java.util.Scanner;

public class CafeteriaStarbiks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Barista barista = new Barista();
        
        while (true) {
            System.out.println("=== CAFETERIA STARBIKS ===");
            System.out.println("1. Preparar ChocoTin");
            System.out.println("2. Preparar Frezzberry");
            System.out.println("3. Preparar Bananini");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            if (opcion == 4) {
                System.out.println("Gracias por visitar Cafeteria Starbiks");
                break;
            }
            
            BebidaBuilder builder = null;
            String tipoLeche = null;
            
            switch (opcion) {
                case 1:
                    builder = new ChocoTinBuilder();
                    break;
                case 2:
                    builder = new FrezzberryBuilder();
                    break;
                case 3:
                    builder = new BananiniBuilder();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    continue;
            }
            
            if (builder.necesitaLeche()) {
                System.out.println("Tipos de leche disponibles:");
                System.out.println("1. Entera");
                System.out.println("2. Deslactosada");
                System.out.println("3. De almendras");
                System.out.print("Seleccione el tipo de leche: ");
                
                int tipoLecheOpcion = scanner.nextInt();
                scanner.nextLine();
                
                switch (tipoLecheOpcion) {
                    case 1:
                        tipoLeche = "entera";
                        break;
                    case 2:
                        tipoLeche = "deslactosada";
                        break;
                    case 3:
                        tipoLeche = "de almendras";
                        break;
                    default:
                        tipoLeche = "entera";
                        System.out.println("Opcion no valida, usando leche entera por defecto");
                }
            }
            
            barista.setBuilder(builder);
            barista.prepararBebida(tipoLeche);
            Bebida bebida = barista.getBebida();
            
            System.out.println();
            bebida.mostrarBebida();
            System.out.println();
        }
        
        scanner.close();
    }
}