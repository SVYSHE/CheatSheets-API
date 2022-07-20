package svyshe.com.github.cheatsheetapi;

import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.UUID;

@Repository
public class CheatSheetDAO {
    private static final String cheatSheetBasePath = "src/main/resources/cheatsheets/";
    private static final CheatSheets list = new CheatSheets();

    static {
        try {
            list.getCheatSheetList()
                    .add(
                            new CheatSheet(UUID.randomUUID().toString(),
                                           Files.readAllBytes(Path.of(cheatSheetBasePath, "git.pdf")),
                                           "Git",
                                           Set.of("git")
                            ));
            list.getCheatSheetList().add(
                    new CheatSheet(UUID.randomUUID().toString(),
                                   Files.readAllBytes(Path.of(cheatSheetBasePath, "rust.pdf")),
                                   "Rust",
                                   Set.of("rustlang", "rust")
                    ));
            list.getCheatSheetList().add(
                    new CheatSheet(UUID.randomUUID().toString(),
                                   Files.readAllBytes(Path.of(cheatSheetBasePath, "sqlite.pdf")),
                                   "SQLite",
                                   Set.of("sqlite")
                    ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public CheatSheets getAllCheatSheets() {
        return list;
    }

    public void addCheatSheet(CheatSheet cheatSheet) {
        list.getCheatSheetList().add(cheatSheet);
    }
}
