import java.util.HashMap;
import java.util.LinkedHashSet;

public class AssotiationTable
{
    String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    HashMap<Character, LinkedHashSet<Character>> keyboardletters = new HashMap<>();

    public AssotiationTable()
    {
        for(int i = 0; i < keyboard.length; i++)
        {
            for(int j = 0; j < keyboard[i].length(); j++)
            {
                if(j == 0)
                {
                    LinkedHashSet<Character> set = new LinkedHashSet<>();
                    set.add(keyboard[i].charAt(j+1));
                    keyboardletters.put(keyboard[i].charAt(j), set);
                }
                else if(j == keyboard[i].length() - 1)
                {
                    LinkedHashSet<Character> set = new LinkedHashSet<>();
                    set.add(keyboard[i].charAt(j-1));
                    keyboardletters.put(keyboard[i].charAt(j), set);
                }
                else
                {
                    LinkedHashSet<Character> set = new LinkedHashSet<>();
                    set.add(keyboard[i].charAt(j+1));
                    set.add(keyboard[i].charAt(j-1));
                    keyboardletters.put(keyboard[i].charAt(j), set);
                }
            }
        }
    }
}
