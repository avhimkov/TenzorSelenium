package org.adlsoft;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFiles {
    public static List<String[]> readFile(String fileName) throws IOException
    {
        List<String[]> values = new ArrayList<String[]>();
        Scanner s = new Scanner(new File(fileName));
        while (s.hasNextLine()) {
            String line = s.nextLine();
            values.add(line.split(";"));
        }
        return values;
    }
}
