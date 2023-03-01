package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String getInputFromUser() throws IOException {
        return reader.readLine();
    }
}
