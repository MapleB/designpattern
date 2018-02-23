package decorate.useinjavaio;

import decorate.useinjavaio.model.LowerCaseInputStream;

import java.io.*;

/**
 * @author bifenglin
 * @date 2018/2/5 15:49
 */
public class InputTest {
    public static void main(String[] args) {
        String file = "test.txt";
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(file)));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
