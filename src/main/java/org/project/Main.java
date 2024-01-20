package org.project;

import SortingAlgorithms.*;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // arrayleri oluşturdum ve dosyaya yazdım.
//
//        GenerateArray array = new GenerateArray();
//       int[] newArray =  array.generateSortedArray(10000);
//      // int [] revArray = array.reverseArray(newArray);
//        for (int num : newArray) {
//            System.out.print(num + " ");
//        }
//
//        array.writeArrayToFile(newArray, "sorted_10K.txt");


        Reader r = new Reader();

        int[] random10K = r.readIntFile("src/main/java/datas/random_10K.txt");
        int[] reversed10K = r.readIntFile("src/main/java/datas/reversed_10K.txt");
        int[] sorted10K = r.readIntFile("src/main/java/datas/sorted_10K.txt");

        ThreeWayMerge s = new ThreeWayMerge();
        long started = System.currentTimeMillis();
       s.mergeSort3Way(reversed10K);
        long ended = System.currentTimeMillis();
  //   s.printArray(s.sort(random1K));
        System.out.println("Time: " + (ended-started)/1000.0);

    }



}



