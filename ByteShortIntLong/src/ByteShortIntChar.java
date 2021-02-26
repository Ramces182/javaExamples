import javax.sound.midi.spi.SoundbankReader;
import java.sql.SQLOutput;

import static java.lang.Byte.MAX_VALUE;

public class ByteShortIntChar {

    public static void main(String[] args) {

        String [] name = {"Daniel"};
        String tempLetter;
        boolean reversed = false;
            for (int i=0; i<name.length -1; i++){
                System.out.println("initialized");
                tempLetter = name [name.length -i];
                name [i] = name [name.length -i];
                System.out.println(name[i]);

                for (int x=0; x<name.length; x++){
                    System.out.println(name [x]);
                }

            }



    }
}
