
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THIVYA N R
 */
public class compiler {
    
    public static void main(String[] args) {
        try {
            //runProcess("echo %cd%");
            System.out.println("**********");
            runProcess("javac Main.java");
            System.out.println("**********");
            runProcess("java Main");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
    
      private static void printLines(String cmd, InputStream ins) throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(
            new InputStreamReader(ins));
        while ((line = in.readLine()) != null) {
            System.out.println(cmd + " " + line);
        }
      }

      private static void runProcess(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        printLines(command + " stdout:", pro.getInputStream());
        printLines(command + " stderr:", pro.getErrorStream());
        pro.waitFor();
        System.out.println(command + " exitValue() " + pro.exitValue());
      }

}

