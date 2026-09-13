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

        System.out.println("Numero de veces que se repite el numero " + num + " = " + contNum + "\n");

        //Ejercicio 10

        int []a = {10, 5, 3, 6, 8, 4, 3};
        int [] b = new int[(a.length + 1)/2];

        for (int i = 0; i < b.length; i++) 
        {
            if(i == (a.length -1 -i))
                b[i] = a[i];
            else
                b[i] = a[i] + a[a.length -1 -i];
        }

        System.out.print("Arreglo a = ");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " "); 
        }

        System.out.print("\nArreglo b = ");
        for (int i = 0; i < b.length; i++) 
        {
            System.out.print(b[i] + " "); 
        }

        //Ejercicio 11

        int [] h = {1, -9, 0, 7, 12, 15, 0};
        int contNeg = 0;
        int contPos = 0;
        int contCero = 0;

        for (int i = 0; i < h.length; i++) 
        {
            if (h[i] < 0)
                contNeg++;
            else if (h[i] > 0)
                contPos++;
            else if (h[i] == 0)
                contCero++;    
        }

        int [] n = new int[contNeg];
        int [] p = new int[contPos];
        int [] c = new int[contCero];

        int indNeg = 0;
        int indCero = 0;
        int indPos = 0;

        for (int i = 0; i < h.length; i++)
        {
            if (h[i] < 0)
            {
                n[indNeg] = h[i];
                indNeg++;
            }else if (h[i] == 0)
            {
                c[indCero] = h[i];
                indCero++;
            }else
            {
                p[indPos] = h[i];
                indPos++;
            }
        }

        System.out.print("\n\nArreglo h = ");
        for (int i = 0; i < h.length; i++) 
        {
            System.out.print(h[i] + " "); 
        }

        System.out.print("\nArreglo positivo = ");
        for (int i = 0; i < p.length; i++) 
        {
            System.out.print(p[i] + " "); 
        }

        System.out.print("\nArreglo negativo = ");
        for (int i = 0; i < n.length; i++) 
        {
            System.out.print(n[i] + " "); 
        }

        System.out.print("\nArreglo cero = ");
        for (int i = 0; i < c.length; i++) 
        {
            System.out.print(c[i] + " "); 
        }

        //Ejercicio 12

        int [] k = {2, 5, 96, 35, 8, 41, 3, 5, 3};
        int x = 3;

        int contador = 0;

        for (int i = 0; i < k.length; i++) 
        {
            if (k[i] == x)
                contador++;
        }

        int [] z = new int[contador];

        int indZ = 0;

        for (int i = 0; i < k.length; i++) 
        {
            if (k[i] == x )
            {
               z[indZ] = i + 1;
               indZ++;   
            }
        }

        System.out.print("\n\nArreglo k = ");
        for (int i = 0; i < k.length; i++) 
        {
            System.out.print(k[i] + " "); 
        }

        System.out.println("\nx = " + x);

        System.out.print("Arreglo z = ");
        for (int i = 0; i < z.length; i++) 
        {
            System.out.print(z[i] + " "); 
        }

        //Ejercicio 13

        int [] n = {2, 6, 9, 5, 15, 48,7,36};
        double suma = 0;

        for (int i = 0; i < n.length; i++) {
            suma += n[i];
        }

        double promedio = suma / n.length;


    }
    
}