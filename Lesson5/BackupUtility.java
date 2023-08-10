import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupUtility {

    public static void createBackup(String sourceDir) {
        File sourceDirectory = new File(sourceDir);
        File backupDir = new File("./backup");

        if (!sourceDirectory.exists() || !sourceDirectory.isDirectory()) {
            System.out.println("Source directory does not exist or is not a directory.");
            return;
        }

        if (!backupDir.exists()) {
            boolean created = backupDir.mkdir();
            if (!created) {
                System.out.println("Failed to create backup directory.");
                return;
            }
        }

        File[] files = sourceDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try {
                        Path sourceFile = file.toPath();
                        Path backupFile = new File(backupDir, file.getName()).toPath();
                        Files.copy(sourceFile, backupFile, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Backup created for file: " + sourceFile);
                    } catch (IOException e) {
                        System.out.println("Failed to create backup for file: " + file.getName());
                    }
                }
            }
            System.out.println("Backup process completed successfully.");
        }
    }

    public static void main(String[] args) {
        String sourceDirectory = "path/to/source/directory"; // Замените на путь к вашей исходной директории
        createBackup(sourceDirectory);
    }
}
