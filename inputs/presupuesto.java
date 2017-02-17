import java.util.Scanner; 
class presupuesto{
    public static void main(String[] args){
        System.out.println("Ingrese el numero de ventas posibles:");
        Scanner reader = new Scanner(System.in);
        int numVentas= reader.nextInt();
        System.out.println("Ingrese el costo unitario:");     
        int precioUnitario=reader.nextInt();
        System.out.println("La posible ganancia es de : \n $ "+(numVentas*precioUnitario));
    }
}