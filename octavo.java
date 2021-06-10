import java.util.Scanner;

public class octavo{

    public static void main(String[] args) {
        char opcion='n';
        int num;
        Scanner ent = new Scanner (System.in);
        while(opcion!='s' || opcion=='S'){
            num=(int)(Math.random()*10000);
            if(num%5==0){
                System.out.println("El numero es: "+num);
            }
            
            System.out.println("Desea seguir?  S= salir");
            opcion=ent.next().charAt(0);
        }
    }
}