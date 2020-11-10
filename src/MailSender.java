import java.io.*;

public class MailSender {
    public static void main(String[] args) throws IOException, InterruptedException {
        String file = "CorreosList.txt";
        Reader(file);
    }

    private static void Reader(String nombreFichero) throws IOException, InterruptedException {
        FileReader reader = new FileReader(nombreFichero);
        BufferedReader bReader = new BufferedReader(reader);
        String line;
        while ((line = bReader.readLine()) != null) {
            System.out.println("hola quetal, "+line+"!");
            Thread.sleep(5000);
        }
    }
}