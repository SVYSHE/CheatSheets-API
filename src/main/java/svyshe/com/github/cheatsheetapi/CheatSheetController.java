package svyshe.com.github.cheatsheetapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "/cheatsheets")
public class CheatSheetController {

    private final CheatSheetDAO cheatSheetDAO;

    public CheatSheetController(CheatSheetDAO cheatSheetDAO) {this.cheatSheetDAO = cheatSheetDAO;}

    @GetMapping(path = "/", produces = "application/json")
    public CheatSheets getCheatSheets() {
        return cheatSheetDAO.getAllCheatSheets();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addCheatSheet(@RequestBody CheatSheet cheatSheet) {
        cheatSheet.setId(UUID.randomUUID().toString());
        cheatSheetDAO.addCheatSheet(cheatSheet);

        return new ResponseEntity<>(cheatSheetDAO, HttpStatus.OK);
    }
}
