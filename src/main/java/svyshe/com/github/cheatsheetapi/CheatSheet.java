package svyshe.com.github.cheatsheetapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CheatSheet {
    private String id;
    private byte[] data;
    private String name;
    private Set<String> tags;
}


