package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {
    private String content;
    private LocalDateTime timestamp;

    public Note(String content) {
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedTimestamp = timestamp.format(formatter);
        return formattedTimestamp + " -> " + content;
    }
}