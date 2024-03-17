package com.StarJ.LostArkDiscordBot.DataStore;

import net.dv8tion.jda.api.JDA;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileStore {
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
            Workbook workbook = WorkbookFactory.create(Objects.requireNonNull(fileInputStream));
            // SETTING
            Sheet settingSheet = workbook.getSheet("SETTING");
            JDA jda = MemoryStore.createJda(settingSheet.getRow(0).getCell(1).getStringCellValue());
            MemoryStore.setMainTextChannelName(settingSheet.getRow(1).getCell(1).getStringCellValue());
            // REACTION
            Sheet reactionSheet = workbook.getSheet("REACTION");
            for (Row row : reactionSheet) {
                List<String> list = new ArrayList<>();
                for (Cell cell : row)
                    if (cell.getCellType().equals(CellType.STRING))
                        list.add(cell.getStringCellValue());
                if (list.size() > 1)
                    MemoryStore.addReaction(list.get(0), list.subList(1, list.size()).toArray(String[]::new));
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