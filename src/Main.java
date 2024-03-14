import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWords {
    public static void main(String[] args) {
        // Đường dẫn của file input và output
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            // Mở file input để đọc
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            // Mở file output để ghi
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            while ((line = reader.readLine()) != null) {
                // Thay thế từ "Nha Trang" bằng từ "Vũng Tàu" và ghi vào file output
                String replacedLine = line.replaceAll("Nha Trang", "Vũng Tàu");
                writer.write(replacedLine);
                writer.newLine(); // Thêm dòng mới sau mỗi dòng đã ghi
            }

            // Đóng file input và output sau khi hoàn thành
            reader.close();
            writer.close();

            System.out.println("Đã thay thế và ghi ra file output.txt thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
