import java.io.*;


public class Trycatch {


    public static void main(String[] args) {


        try {

            Read();
            write();

            System.out.println("File copied successfully. ");

        } catch (FileNotFoundException e) {

            System.out.println("file not found.");



        } catch (IOException e) {
            System.out.println("Error  " + e);
        }

    }
     // Read file text.txt
    private static void Read() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        System.out.println(br.readLine());

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }



    // Write to a file
    private static void write() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("copy.txt"));

        String line;
        while ((line = br.readLine()) != null) {

            writer.write(line);
            writer.newLine();

        }

        writer.close();






}}