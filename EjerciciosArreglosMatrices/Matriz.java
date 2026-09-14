package EjerciciosArreglosMatrices;

import java.util.Scanner;

public class Matriz 
{
    public static void main(String[] args) 
    {
        //Ejercicios del 17, 18, 19, 20, 21, 22, 24 
        //Ejercicio 17
        int [] [] m = {{ 1, 2, 3},
                      {3, 9, 8},
                      {0, 2, 6}};

        String cadena = "";             

        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[0].length; j++) 
            {
                cadena += "|" + m[i][j];
            }
            cadena += "|\n";
        }
        System.out.print(cadena);


        for (int i = 0; i < m.length; i++) 
        {
            int sumaFila = 0;
            for (int j = 0; j < m[0].length; j++) 
            {
                sumaFila += m[i][j];
            }
            System.out.println("La suma de la fila " + i + " = " + sumaFila);
        }

        for (int j = 0; j < m[0].length; j++) 
        {
            int sumaCol = 0;
            for (int i = 0; i < m.length; i++) 
            {
                sumaCol += m[i][j];
            }
            System.out.println("La suma de columna " + j + " = " + sumaCol);
        }

        //Ejercicio 18
        int [][] t = new int[10][10];

        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                t[i][j] = (i + 1) * (j + 1);    
            }
        }

        System.out.println();
        for (int i = 0; i < 10; i++) 
        {
           for (int j = 0; j < 10; j++) 
            {
                System.out.print(t[i][j] + "\t" );
           } 
           System.out.println();
        }

        //Ejercicio 19

        int [][] d = new int[4][4];

        for (int i = 0; i < d.length; i++) 
        {
            for (int j = 0; j < d.length; j++) 
            {
                if (i == j)
                    d[i][j] = 1;
                else
                    d[i][j] = 0;  
            }
            
        }

        System.out.println();
        cadena = "";
        for (int i = 0; i < d.length; i++)
        {
            for (int j = 0; j < d[0].length; j++) 
            {
                cadena += "|" + d[i][j];
            }
            cadena += "|\n";
        }
        System.out.print(cadena);

        //Ejercicio 20
        int [][] k = new int[10][10];

        for (int i = 0; i < k.length; i++) 
        {
            for (int j = 0; j < k.length; j++) 
            {
                if (j >= i)
                    k[i][j] = 0;
                else
                    k[i][j] = 1;  
            }
            
        }

        System.out.println();
        cadena = "";
        for (int i = 0; i < k.length; i++)
        {
            for (int j = 0; j < k[0].length; j++) 
            {
                cadena += "|" + k[i][j];
            }
            cadena += "|\n";
        }
        System.out.print(cadena);

        //Ejercicio 21

        int [][] r = {{4, 8, 9, 1},
                      {5, 7, 6, 4},
                      {7, 8, 3, 8},
                      {9, 7, 1, 6} };

        int [] s = new int[r.length];

        for (int i = 0; i < r.length; i++) 
        {
            int suma = 0;
            for (int j = 0; j < r.length; j++) 
            {
                if (r[i][j] % 2 == 0)
                    suma += r[i][j];   
            }   
            s[i] = suma;
        }

        System.out.println();
        cadena = "";
        for (int i = 0; i < r.length; i++)
        {
            for (int j = 0; j < r[0].length; j++) 
            {
                cadena += "|" + r[i][j];
            }
            cadena += "|\n";
        }
        System.out.print(cadena);

        System.out.print("\n\nVector B = ");
        for (int i = 0; i < s.length; i++) 
        {
            System.out.print(s[i] + " "); 
        }


        //Ejercicio 22
        Scanner numero = new Scanner(System.in);

        System.out.println("\nIngrese el numero de filas de la matriz : ");
        int fila = numero.nextInt();

        System.out.println("Ingrese el numero de columnas de la matriz : ");
        int col = numero.nextInt();

        int [][] y = new int[fila][col];


        for (int i = 0; i < y.length; i++) 
        {
            for (int j = 0; j < y.length; j++) 
            {
                System.out.println("Ingreselos valores para la matriz [" +i + "] " + "[" + j + "]");
                y[i][j] = numero.nextInt();
            }
            
        }

        System.out.println();
        cadena = "";
        for (int i = 0; i < y.length; i++)
        {
            for (int j = 0; j < y[0].length; j++) 
            {
                cadena += "|" + y[i][j];
            }
            cadena += "|\n";
        }
        System.out.print(cadena);

        //Ejercicio 24
        int [][ t = {{4, 5, 9, 5, 3, 6, 5, 7, 4, 8, 8, 4},
                     {1, 2, 8, 6, 8, 4, 7, 3, 9, 7, 1, 3},
                     {9, 2, 5, 7, 8, 6, 1, 3, 9, 2, 10, 11}};
        
        double [] proMes = new double [t[0].length];

        for (int j = 0; j < t[0].length; j++) 
        {
            double suma = 0;
            for (int i = 0; i < t.length; i++) 
            {
                suma += t[i][j];
            }
            proMes[j] = suma;
        }


        

        

    }
    
}
