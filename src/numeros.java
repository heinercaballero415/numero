import javax.swing.*;
import java.util.Scanner;

public class numeros {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int nespacio;
        float [] num = new float[5];
        nespacio = Integer.parseInt(JOptionPane.showInputDialog("bienvenido porfavor ingrese el numero de espacios que quiere en el arreglo"));




        for(int i=0 ; i<nespacio; i++){
            System.out.println((i + 1) + "digite un numero: ");
            num [i] = entrada.nextFloat();}

        for (int i=0 ; i<nespacio ; i++){
            System.out.println(num [i] + " ");

        }
    }





}
