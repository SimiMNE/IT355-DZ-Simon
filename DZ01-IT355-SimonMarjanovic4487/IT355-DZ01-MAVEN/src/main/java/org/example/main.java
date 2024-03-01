package org.example;


import org.apache.poi.ss.usermodel.*;

import java.io.InputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        readStudents("/studenti.xlsx");
    }

    public static void readStudents(String resourcePath) {
        try (InputStream is = main.class.getResourceAsStream(resourcePath);
             Workbook workbook = WorkbookFactory.create(is)) {

            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();
            int rowIndex = 0;
            for (Row row : sheet) {
                if (rowIndex++ == 0) continue;
                Cell ime = row.getCell(0);
                Cell prezime = row.getCell(1);
                Cell brojIndeksa = row.getCell(2);

                System.out.println("Ime: " + ime.getStringCellValue());
                System.out.println("Prezime: " + prezime.getStringCellValue());
                System.out.println("Broj indeksa: " + formatter.formatCellValue(brojIndeksa));
                System.out.println("------------------------");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
