package util;

import model.Note;

import java.io.FileWriter;
import java.io.IOException;

public class NoteWriter {
    private static final String FILE_PATH = "notes.txt";

    public static void writeToFile(Note note) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(note.toString() + "\n");
            System.out.println("Заметка успешно записана в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи заметки в файл: " + e.getMessage());
        }
    }
}