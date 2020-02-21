import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.nio.*;
import java.util.concurrent.TimeUnit;

public class EditFileClass {

        String file;
        String textInput;
        String tempFile;

        public EditFileClass() {
        }

        public EditFileClass(String textInput, String file) {
                this.file = file;
                this.textInput = textInput;
                this.tempFile = file + "_temp";
        } 

        public void deleteAllmatch() throws IOException, FileNotFoundException {

                BufferedReader reader = new BufferedReader(new FileReader(this.file));
                FileWriter writer = new FileWriter(this.tempFile);

                String line;

                while ((line = reader.readLine()) != null) {

                        String[] sentence = line.split(" ");
                        for (String word : sentence) {
                                if (!word.equals(textInput)) {
                                        writer.write(word + " ");
                                }
                        }
                        writer.write("\n");
                }

                reader.close();
                writer.close();
        }

        public void delTempFile() {

                try {
                        TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                }

                File delete = new File(this.file);
                delete.delete();

                File renameFile = new File(this.tempFile);
                renameFile.renameTo(new File(this.file));
        } 
}