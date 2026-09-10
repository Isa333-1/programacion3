package EjerciciosArreglosMatrices;

public class Arreglos
{
    public static void main(String[] args) 
    {
        //Arreglos: 7, 8, 9, 10, 11, 12, 13 -> si le piden muchos números llene el arreglo con números aleatorios
        //Ejercicio 7:
        int [] A = {1,24,5,78,8,9,13,4,1,12};
        int contadorPar = 0;
        int contadorImpar = 0;
        

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] % 2 == 0)
            {
                contadorPar++;
            }else{
                contadorImpar++;
            }
        }

        int [] par = new int[contadorPar];
        int [] impar = new int[contadorImpar];

        int numeroPar = 0;
        int numeroImpar = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] % 2 == 0)
            {
                par[numeroPar] = A[i];
                numeroPar++;
            }else{
                impar[numeroImpar] = A[i];
                numeroImpar++;
            }
        }

        System.out.print("Arreglo A = ");
        for (int i = 0; i < A.length; i++) 
        {
            System.out.print(A[i] + " "); 
        }
        System.out.println();

        System.out.print("Arreglo par = ");
        for (int i = 0; i < par.length; i++) 
        {
            System.out.print(par[i] + " "); 
        }
        System.out.println();

        System.out.print("Arreglo impar = ");
        for (int i = 0; i < impar.length; i++) 
        {
            System.out.print(impar[i] + " "); 
        }
        System.out.println();
    }
    




    
}