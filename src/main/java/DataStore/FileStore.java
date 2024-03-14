package DataStore;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStore {
    public static void Read() {
        try {
            FileInputStream file = new FileInputStream(new File("./data.xlsx"));
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row rows : sheet) {
                for (Cell cells : rows) {
                    System.out.print(cells.toString() + "\t");
                }
                System.out.println();
            }
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
