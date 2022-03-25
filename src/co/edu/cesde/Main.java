package co.edu.cesde;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        double promedad=0;
        double prompeso=0;
        int cantperso=0;
        int may30men40=0;
        int ent40y60=0;
        int may60=0;
        int edad;
        int peso;
        int sumedad=0;
        int sumpeso=0;
        int i=1;
        while (i==1){
            System.out.println("ingrese la edad :");
            edad=inputData.nextInt();

            System.out.println("ingrese el peso :");
            peso=inputData.nextInt();
            cantperso++;
            sumedad=sumedad+edad;
            sumpeso=sumpeso+peso;
            if (edad>30 && edad<40){
                may30men40=may30men40+1;
            }
            else if (edad>=40 && edad<=60){
                ent40y60++;
            }
            else if (edad>60){
                may60++;
            }
            if (cantperso % 5==0){
                System.out.println("hasta el momento van encuestadas "+cantperso+ " personas");

            }
            System.out.println("Desea encuestar otra persona? (1 para si)    (2 para no) ");
            i=inputData.nextInt();
        }
        System.out.println("La cantidad de personas entre 30 y 39 años es: "+may30men40);
        System.out.println("La cantidad de personas entre 40 y 60 años es: "+ent40y60);
        System.out.println("La cantidad de personas mayores de 60 años es: "+may60);
        System.out.println("promedio de edad es: "+(sumedad/cantperso));
        System.out.println("El promedio de peso es: "+(sumpeso/cantperso));
    }
}
