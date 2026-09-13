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
        System.out.println("\n");


        //Ejercicio 8

        int [] v = new int [30];

        int max = 100;
        int min = 1;

        for (int i = 0; i < v.length; i++)
        {
            v[i]= (int)(Math.random() * (max - min + 1)) + min;  
        }

        System.out.print("Arreglo v = ");
        for (int i = 0; i < v.length; i++) 
        {
            System.out.print(v[i] + " "); 
        }
        System.out.println();

        int numMayor = v[0];
        int numMenor = v[0];

        for (int i = 0; i < v.length; i++) 
        {
            if (v[i] > numMayor)
                numMayor = v[i];
            if (v[i] < numMenor)
                numMenor = v[i];
        }


        int contMayor = 0;
        int contMenor = 0;

        for (int i = 0; i < v.length; i++) 
        {
            if (v[i] == numMayor)
                contMayor++;
            if (v[i] == numMenor)
                contMenor++;
        }

        System.out.println("El mayor es: " + numMayor + "\n" 
                        + "El menor es: " + numMenor + "\n"
                        + "Numero de veces que el numero mayor se repite: " + contMayor + "\n" 
                        + "Numero de veces que el numero menor se repite: " + contMenor + "\n");

        
       //Ejercicio 9
       
        max = 20;
        int []g = new int[33];
        int num = (int)(Math.random() * (max - min + 1)) + min;

        for (int i = 0; i < g.length; i++) 
        {
            g[i] = (int)(Math.random() * (max - min + 1)) + min;
        }
            
        System.out.print("Arreglo g = ");
        for (int i = 0; i < g.length; i++) 
        {
            System.out.print(g[i] + " "); 
        }

        System.out.println("\nNumero = " + num);
        
        int contNum = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[i] == num)
                contNum++;
        }

        System.out.println("Numero de veces que se repite el numero " + num + " = " + contNum);

        //Ejercicio 10

        int []a = {10, 5, 3, 6, 8, 4, 5};
        int [] b = new int[(a.length + 1)/2];

        for (int i = 0; i < b.length/2; i++) 
        {
            b[i] = a[i] + a[a.length -1 -i];
        }

        

        








    }
    
}