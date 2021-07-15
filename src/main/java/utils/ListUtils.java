package utils;

import java.util.List;

/**
 *
 */
public class ListUtils {
    public int sum(@org.jetbrains.annotations.NotNull List<Integer> list )
    {
        int sum = 0;
        for (int item:list) {
            sum+=item;
        }
        return sum;
    }
}
