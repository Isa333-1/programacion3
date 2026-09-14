package EjerciciosArreglosMatrices;

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
                if (i + j == 9)
                    k[i][j] = 0;
                else
                    k[i][j] = 1;  
            }
            
        }

        //Ejercicio 21

        //Ejercicio 22

        //Ejercicio 24


        

        

    }
    
}
