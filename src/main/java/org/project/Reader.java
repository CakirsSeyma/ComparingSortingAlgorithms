package org.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public  int[] readIntFile(String fileName) throws FileNotFoundException {
        ArrayList<Integer> dataList = new ArrayList<>();

        Scanner sc = new Scanner(new File(fileName));

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] values = line.split(" ");

            for (String value : values) {
                if (!value.isEmpty()) {
                    try {
                        int intValue = Integer.parseInt(value);
                        dataList.add(intValue);
                    } catch (NumberFormatException e) {
                        System.out.println("Geçersiz bir sayı bulundu: " + value);

                    }
                }
            }
        }

        int[] data = new int[dataList.size()];
        for (int i = 0; i < dataList.size(); i++) {
            data[i] = dataList.get(i);
        }

        return data;
    }
}
