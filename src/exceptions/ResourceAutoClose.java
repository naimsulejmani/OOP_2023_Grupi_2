package exceptions;

import java.io.*;
import java.time.LocalDate;

public class ResourceAutoClose {
    public static void main(String[] args) {
            String fileName = "files/rezultati.txt";
            String newFileName = "files/rezultati-new.txt";

            //Mundemi me deklaru vetem variabla qe jane femij te AutoCloseable interface
            // keto munden me u mbyll vet
            try(
                    BufferedReader in = new BufferedReader(new FileReader(fileName));
                    PrintWriter out = new PrintWriter(new FileWriter(newFileName))
            ) {

                String text = in.readLine();
                out.println(text);
                out.println("TEST");
                out.println(100);
                out.println(LocalDate.now());

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}











