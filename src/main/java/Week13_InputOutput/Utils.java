package Week13_InputOutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Utils {
    public static String readContentFromFile(String path) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        StringBuilder opt = new StringBuilder();
        for (String line : lines) {
            opt.append(line).append("\n");
        }
        return opt.toString();
    }

    public static void writeContentToFile(String path) throws IOException {
        String content = "Hello, I'm Leo";
        Files.write(Paths.get(path),
                content.getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING);
    }

    public static void appendContentToFile(String path) throws IOException {
        String content = "Hello, I'm Leo";
        Files.write(Paths.get(path),
                content.getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }

    public static File findFileByName(String folderPath, String fileName) throws IOException {
        File myFolder = new File(folderPath);
        File[] files = myFolder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.getName().equals(fileName)) {
                    return file;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            String opt = Utils.readContentFromFile("src/main/java/Week13_InputOutput/input.txt");
            System.out.println(opt);

            Utils.writeContentToFile("src/main/java/Week13_InputOutput/Output.txt");

            Utils.appendContentToFile("src/main/java/Week13_InputOutput/Append.txt");

            String folderPath = "src/main/java/Week13_InputOutput";
            String searchFileName = "FoundFile.txt";
            File foundFile = Utils.findFileByName(folderPath, searchFileName);
            if (foundFile != null) {
                System.out.println("Found: " + foundFile.getAbsolutePath());
            } else {
                System.out.println("Not found!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
