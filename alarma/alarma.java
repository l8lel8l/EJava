import java.util.Scanner;
class alarma{
    public static void main(String[] args){
        System.out.println("Indique la hora");
        Scanner reader = new Scanner(System.in);
        int hora = reader.nextInt();
        System.out.println("Indique el minuto");
        int minuto= reader.nextInt();
        if( hora >= 11 && minuto > 50 ){
            System.out.println("DUERMA AHORA!!!");
        }else{
            System.out.println("Trabaje!");
        }
    }
}