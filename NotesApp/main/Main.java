package main;

import model.Note;
import util.NoteWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите заметку: ");
        String content = scanner.nextLine();

        Note note = new Note(content);
        NoteWriter.writeToFile(note);

        scanner.close();
    }
}