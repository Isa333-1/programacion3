package Semana2;
public class EjecutarSemanaDos {
    public static void main(String[] args) {
        
        //Declaración Arreglos forma 1
        int [] a = {3,10,5,9,11,22,1,14,25,7,8,19};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]); 
        }

        //Declaración Arreglos forma 2
        int [] b = new int[12] ;

        int max = 100;
        int min = 1;

        for (int i = 0; i < b.length; i++) {
            b[i]= (int)(Math.random() * (max - min + 1)) + min; 
        }

        //Recorrer y mostrar arreglo
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]=" + b[i]); 
        }


        //Ejercicios del diagnostico
        int []v = {3,10,5,9,11,22,1,14,25,7,8,19};
        int par = 0;
        int impar = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] %2  == 0)
                par++;
            else
                impar++;
        }
        System.out.println("El numero de impares es: " + impar + " El numero de pares es: " + par);

        

    }
}
