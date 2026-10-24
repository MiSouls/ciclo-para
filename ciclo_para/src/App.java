import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for(int ciclo_para = 1; ciclo_para <= 10; ciclo_para++){
            System.out.println("repeticion del ciclo en la vuelta " + ciclo_para);
        }
    
        sc.close();
    }
}
