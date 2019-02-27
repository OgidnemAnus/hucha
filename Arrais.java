/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrais;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Arrais {

    /*
    ----------crear array con bucle
    int [] num = new int [4];
    
    for (int i = 0; i < num.length; i++) {
        num [i] = sc.nextInt();
    }
    
    ----------------para imprimir un array sin bucle
    System.out.print(Arrays.toString(num));
    */
    
    
    //metodo menu ejercicio 12-------------------------------------------
    public static void menu() {
        System.out.println("\n\nMENU");
        System.out.println("------------------");
        System.out.println("");
        System.out.println("1. Mostrar el vector.");
        System.out.println("2. Mostrar el vector al inverso.");
        System.out.println("3. Buscar el numero menor.");
        System.out.println("4. Buscar el numero mayor.");
        System.out.println("5. Comprobar si existe un numero en el vector.");
        System.out.println("6. Cambiar el valor almacenado en una posicion.");
        System.out.println("7. Sustituir todas las apariciones de un numero por otro.");
        System.out.println("8. Intercambiar los valores de dos posiciones.");
        System.out.println("9. Ordenar el vector de menor a mayor (Sin mostrarlo).");
        System.out.println("0 Salir.");
        System.out.println("");
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //------------------------------ejercicio1-----------------------
        
        /*
        
        int [] num = {4, 5, 6, 7};
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        
        */
        
        //---------------------------ejercicio2--------------------
        
        /*
        
        System.out.println("cuantos numeros quieres guardar?");
        int [] num = new int [sc.nextInt()];
        
        
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("numero " + (i+1));
            num [i] = sc.nextInt();
        }
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }

        */
        
        
        //---------------------------ejercicio3---------------------

        /*
        
        int [] num = new int [10];
        
        for (int i = 0; i < num.length; i++) {
            num [i] = i+1;
        }
        
        for (int i = 0; i < 20; i++){
        
            // int aux = 
            int aleatroio1=  (int)(Math.random() * 10);
            int aleatroio2=  (int)(Math.random() * 10);                
            int aux = num[aleatroio1];
            num[aleatroio1]=num[aleatroio2];
            num[aleatroio2]=aux;
        }
         
        System.out.println("Los 10 numeros:");
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num [i] + ", ");
        }        
         
        
        System.out.println("\n numeros positivos: ");
        for (int i = 0; i < num.length; i++) {
            if (num [i] %2==0)
            System.out.print(num [i] + ", " );
        }
        
        System.out.println("\n numeros negativos: ");
        for (int i = 0; i < num.length; i++) {
            if (num [i] %2!=0)
            System.out.print(num [i] + ", ");
        }
        
        */
        
        //-----------------------ejercicio4------------------
        
        /*
        
        int [] num = new int [10];
        
        for (int i = 0; i < num.length; i++) {
            
            System.out.println("introduce un numero..");
            
            int aux;
            
            do {
                System.out.println("tiene que ser negativo..");
                aux = sc.nextInt();
                
            } while (aux >= 0);
            
            num [i] = aux;

        }
        
        System.out.println("Los 10 numeros:");
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num [i] + ", ");
        }
        
        */
        
        //----------------------ejercicio5-------------------
        
        /*
        
        int suma = 0;
        int producto = 1;
        
        int [] num = new int [10];
        
        for (int i = 0; i < num.length; i++) {
            
            num [i] = (int)(Math.random()*10 +1);
            suma += num[i];
            producto *= num[i];

        }
        
        System.out.println("Los 10 numeros:");
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num [i] + ", ");
            
        }
        
        System.out.println("\nsuma de los numeros =  " + suma);
        System.out.println("producto de los numeros =  " + producto);
        
        */
        
        //----------------------ejercicio6-------------------
        
        /*
        //forma 1 de hacer el ejercicio...............
        
        int max = 0;
        int min = 11;
        int [] num = new int [5];
                
        for (int i = 0; i < num.length; i++) {
            
            num [i] = (int)(Math.random()*10 +1);
            
            if (num [i] > max) {
                max = num [i];
            }
            
            if (num [i] < min) {
                min = num [i];
            }  
            
        }
        
        System.out.println("Los 5 numeros:");
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num [i] + ", ");
            
        }
        
        System.out.println("\nel numero mayor es:  " + max);
        System.out.println("el numero menor es:  " + min);
        
        *//*
        
        //forma 2 de hacer el ejercicio.............
        //esta forma es mejor..........
        
        int [] num = new int [5];
        
        for (int i = 0; i < num.length; i++) {
            
            num [i] = (int)(Math.random()*10 +1);

        }
        
        int max = num [0];
        int min = num [0];
        
        System.out.println("Los 5 numeros:");
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num [i] + ", ");
            
        }
        
        for (int i = 0; i < num.length; i++) {
            
            if (num [i] > max) {
                max = num [i];
            }
            
            if (num [i] < min) {
                min = num [i];
            }  
            
        }
        
        System.out.println("\nel numero mayor es:  " + max);
        System.out.println("el numero menor es:  " + min);
        
        */
        
        //-----------------------------ejercicio7--------------------
        
        /*
        
        char [] letras = new char[20];
        int cont1 = 0;
        
        System.out.println("Introduce 20 letras: ");
        
        for (int i = 0; i < 20; i++) {
            
            letras[i]=sc.next().charAt(0);
            
            if(letras[i]=='a'){
                cont1++;
            }
            
        }
        
        System.out.println("\nNúmero de veces que aparece 'a' en letras: "+ cont1);
        
        for (int i = 0; i < 20; i++) {
            
            if(letras[i]=='a'){
                System.out.println("La a ocupa la posición: "+ (i+1));
                
            }
            
        }
        
        */
        
        //-----------------------------ejercicio8--------------------
        
        /*
        
        char [] letras = new char[10];
        int cont = 0;
        for (int i = 10; i>0; i--) {
            
            letras[cont]=sc.next().charAt(0);
            cont++;
        }
        
        System.out.println("");
              
        while (cont!=0) {
            cont--;
            
            System.out.print(letras[cont]);
                
        }
    
        */
        
        //-----------------------------ejercicio9--------------------
        
        /*
        
        int [] num1 = new int[10];
        int [] num2 = new int[10];
        int cont1 = 0;
        
        
        System.out.println("Suma de arrays :");
        
        for (int i = 0; i < 10; i++) {
          
            num1[i]= (int) (Math.random() * 101);
            num2[i]= (int) (Math.random() * 101);
            
            cont1 = num1[i] + num2[i];
            
            System.out.println(" posicion " + i + " = " +  cont1);
        }
        
        */
        
        
        //-------------------------------ejercicio10------------------
        
        /*
        
        System.out.println("cuantos alumnos tiene tu clase?");
        
        double suma = 0;
        
        double [] num = new double[sc.nextInt()];
        
        for (int i = 0; i < num.length; i++) {
            
            System.out.println("nota del alumno " + (i+1));
            num [i] = sc.nextDouble();
            
            suma += num [i];

        }
        
        double max = num [0];
        double min = num [0];
        
        for (int i = 0; i < num.length; i++) {
            
            if (num [i] > max) {
                max = num [i];
            }
            
            if (num [i] < min) {
                min = num [i];
            }  
            
        }
        
        System.out.println(" la media d las notas es : " + suma/num.length );
        System.out.println(" la mayor nota es : " + max );
        System.out.println(" la menor nota es : " + min);
        
        */
        
        //---------------------------ejercicio11----------------------
        
        /*
        
        int [] arr = new int[10];
        
        int num;
        int pos;
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(" numero a introducir : " );
            num = sc.nextInt();
            
            while (num < 1){
            
                System.out.println(" error numero tiene que ser mayor que 0 : " );
                 num = sc.nextInt();
            }
            
            
            
            System.out.println(" posicion  de guardado : " );
            pos = sc.nextInt();
            
            while ( pos<0 || pos>9 || arr [pos] != 0){
            
                System.out.println(" error esa posicion ya esta ocupada : " );
                pos = sc.nextInt();
            }
            
            arr [pos] = num;
            
        }
        
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr [i] + ", ");
            
        }
        
        */
        
        //---------------------------ejercicio12----------------------
        
        array12 a1 = new array12(4);
        
        
        
        int opcionMenu;
        
        do {
            
        
            menu();
        
        opcionMenu = sc.nextInt();
        
        switch (opcionMenu){
        
            case 1:
                a1.mostrar();
                break;
                
            case 2:
                a1.mostrarInverso();
                break;
            
            case 3:
                System.out.println("El numero menor es: " + a1.menor());
                break;
            
            case 4:
                a1.mayor();
                break;
            
            case 5:
                a1.comprobar();
                break;
            
            case 6:
                a1.cambiar();
                break;
            
            case 7:
                a1.sustituir();
                break;
            
            case 8:
                a1.intercambiar();
                break;
            
            case 9:
                a1.ordenar();
                break;
                
        }
        
        
        } while (opcionMenu != 0);
        

    }


}
