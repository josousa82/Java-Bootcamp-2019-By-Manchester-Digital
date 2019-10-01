import com.ctc.wstx.exc.WstxOutputException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        EnumExample test[] = EnumExample.values();
        EnumExample test2 = EnumExample.va;

        Arrays.stream(test).
                forEach(element -> System.out.println(element));

        System.out.println("\n" + "test2 :" + test2);
    }
}
