package com.university.lostfound.infrastructure.storage;

import java.io.*;
import java.util.List;

public class FileStorage {
    public void saveLines(String filename, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
