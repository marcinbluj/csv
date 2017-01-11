package com.company;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-10.
 */
public class CSV {
    public static void saveArrayToCSV(Integer[][] data, String filePath) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            Integer[] tempArray = data[i];
            String text = Joiner.on(';').skipNulls().join(tempArray);
            list.add(text);
        }

        File file = new File(filePath);

        try {
            for (String line:list) {
                Files.append(line + System.lineSeparator(), file, Charsets.UTF_8);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }
}
