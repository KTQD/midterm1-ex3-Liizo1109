import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class ReplaceWords {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            File outputFile = new File(outputFilePath);
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }

            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String replacedLine = line.replaceAll("Nha Trang", "Vũng Tàu");
                writer.write(replacedLine);
                writer.newLine(); // Thêm dòng mới sau mỗi dòng đã ghi
            }

            reader.close();
            writer.close();

            System.out.println("Đã thay thế và ghi ra file output.txt thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
