package com.StarJ.LostArkDiscordBot.DataStore;

import net.dv8tion.jda.api.JDA;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStore {
    public String getToken() {
        File file = new File("./TOKEN.config");
        try {
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String str;
                while ((str = reader.readLine()) != null) {
                    reader.close();
                    return str;
                }
                reader.close();
            }
        } catch (IOException ex) {

        }
        return "";
    }

    public void Load() {
        try {
            File file = new File("./data.xlsx");
            if (!file.exists()) {
                try (InputStream inputStream = getClass().getResourceAsStream("/data.xlsx");
                     FileOutputStream fileOutputStream = new FileOutputStream("./data.xlsx")) {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while (true) {
                        assert inputStream != null;
                        if ((bytesRead = inputStream.read(buffer)) == -1) break;
                        fileOutputStream.write(buffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    return;
                }
            }
            InputStream fileInputStream = new FileInputStream(file);
            //Workbook workbook = WorkbookFactory.create(Objects.requireNonNull(fileInputStream));
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            // SETTING
            Sheet settingSheet = workbook.getSheet("SETTING");
            JDA jda = MemoryStore.createJda(getToken());
            MemoryStore.setMainTextChannelName(settingSheet.getRow(0).getCell(1).getStringCellValue());
            // REACTION
            Sheet reactionSheet = workbook.getSheet("REACTION");
            for (Row row : reactionSheet) {
                List<String> list = new ArrayList<>();
                for (Cell cell : row)
                    if (cell.getCellType().equals(CellType.STRING))
                        list.add(cell.getStringCellValue());
                if (list.size() > 1)
                    MemoryStore.addReaction(list.get(0).replace(" ", ""), list.subList(1, list.size()).toArray(String[]::new));
            }

            // RANDOM_REACTION
            Sheet randomReactionSheet = workbook.getSheet("RANDOM_REACTION");
            for (Row row : randomReactionSheet) {
                Cell cell = row.getCell(0);
                if (cell.getCellType().equals(CellType.STRING))
                    MemoryStore.addRandomReaction(cell.getStringCellValue());
            }
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
