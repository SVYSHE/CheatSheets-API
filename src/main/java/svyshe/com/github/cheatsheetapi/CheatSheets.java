package svyshe.com.github.cheatsheetapi;

import java.util.ArrayList;
import java.util.List;

public class CheatSheets {

    private List<CheatSheet> cheatSheetList;

    public List<CheatSheet> getCheatSheetList() {
        if (cheatSheetList == null) {
            cheatSheetList = new ArrayList<>();
        }
        return cheatSheetList;
    }

    public void setCheatSheetList(List<CheatSheet> cheatSheetList) {
        this.cheatSheetList = cheatSheetList;
    }
}
