import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cantidad_xiaomi = 0;
        int cantidad_iphone = 0;
        int cantidad_samsung = 0;
        for (int ciclo_para = 1; ciclo_para <= 20; ciclo_para++) {
            int opcion = 0;
            System.out.println(
                    "Seleccione el producto que desea comprar: 1) Xiaomi 18 Fold.   2) Iphone Duo.   3) Samsung Fold 8 ");
                    System.out.print("Escriba la opcion: ");
                    opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Gacias por comprar el Xiaomi");
                cantidad_xiaomi++;
            } else if (opcion == 2) {
                System.out.println("Gracias por comprar el Iphone");
                cantidad_iphone++;
            } else if (opcion == 3) {
                System.out.println("Gracias por comprar el Samsung");
                cantidad_samsung++;
            } else {
                System.out.println("No contamos con esa referencia");
            }
        }
System.out.println("Ventas del Xiaomi 18 Fold: " + cantidad_xiaomi);
System.out.println("Ventas del Iphone Duo: " + cantidad_iphone);
System.out.println("Ventas del Samsung Galaxy Fold: " + cantidad_samsung);
        sc.close();
    }
}
