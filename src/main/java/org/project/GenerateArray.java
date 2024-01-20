package org.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GenerateArray {

    public  int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }
    public  int[] generateSortedArray(int size) {
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        Arrays.sort(array);

        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }

    public  int[] reverseArray(int[] array) {
        Integer[] reversedArray = Arrays.stream(array)
                .boxed()
                .toArray(Integer[]::new);
        Collections.reverse(Arrays.asList(reversedArray));

        return Arrays.stream(reversedArray).mapToInt(Integer::intValue).toArray();
    }

    public void writeArrayToFile(int[] array, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int num : array) {
                writer.write(num + "\n");
            }
            System.out.println("Dizi " + fileName + " dosyasına yazıldı.");
        } catch (IOException e) {
            System.out.println("Dosya yazma hatası: " + e.getMessage());
        }
    }

}
