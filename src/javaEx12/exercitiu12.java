package javaEx12;


import java.util.Scanner;

public class exercitiu12 {
    public static void main(String[] args) {
        Scanner first=new Scanner(System.in);
        punct1(first);
        punctul2(first);


    }

    public static void punct1(Scanner scan) {
        //Write a Java program to sum values of an array. Read the size and read the numbers
       // Scanner scan = new Scanner(System.in);- nu il mai punem pentru ca l-am folosit ca si parametru ,, Scanner scan "
        System.out.println("Dimensiunea array:");
        int dim = scan.nextInt();

        // int[] array = new int[dim]; am modificat cu cea de jos pentru ca am apelat metoda readArray

        int[] array = readArray(dim);


        //readArray(dim); - prima modificare apoi o stergem pt ca am scris mai sus readArray
        // am inlocuit codul cu metorda readArray
        // for (int i = 0; i < dim; i++) {
        //      System.out.println("array[" + (i + 1) + "]=");// (i+1)ca sa plece de la 1
        //     array[i] = scan.nextInt();
        //  }

        // am mutat aceasta parte in metoda sumArray
       // int sum = 0;
       // for (int i = 0; i < dim; i++) {
       //     sum += array[i];
       // }
        System.out.println("Suma elementelor:"+ sumArray(array));

    }

    public static void punctul2(Scanner scan){
        // Media aritmetica
        //Write a Java program to calculate the average value of array elements
        System.out.println("Citeste dimensiunea"+ scan.nextInt());
        int dim =scan.nextInt();
        int[] array = readArray(dim);
        int medie=sumArray(array)/dim;
        System.out.println( "Citeste media "+ medie);

    }

    public static int[] readArray(int size)
    // metoda  pentru citirea  dimensiunii array-ului,
    // size-ul este dat ca parametru- ca input,l-am primit din afara codului
    {
        Scanner scan2 = new Scanner(System.in);
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("array[" + (i + 1) + "]=");// (i+1)ca sa plece de la 1
            array[i] = scan2.nextInt();

        }
        return array;
    }

    public static int sumArray(int[] array) {
        //scriem tipul array int si apoi punem [] ca sa ii aratam ca e o matrice
//metoda sumArray calculeaza suma
        int sum = 0;
        for (int i = 0; i <array.length; i++) {
            sum=sum + array[i];
        }
        return sum;

    }
}

