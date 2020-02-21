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

        // if(!fileData.exists()) {
        // System.out.println("\n\nFine does not exists.\n\n");
        // System.exit(0);
        // }

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
        /**
         * System.out.println("Does it exist? " + ); System.out.println("The file has "
         * + file.length() + " bytes"); System.out.println("Can it be read? " +
         * file.canRead()); System.out.println("Can it be written? " + file.canWrite());
         * System.out.println("Is it a directory? " + file.isDirectory());
         * System.out.println("Is it a file? " + file.isFile()); System.out.println("Is
         * it absolute? " + file.isAbsolute()); System.out.println("Is it hidden? " +
         * file.isHidden()); System.out.println("Absolute path is " +
         * file.getAbsolutePath()); System.out.println( "Last modified on " + new
         * java.util.Date(file.lastModified()) );
         */
}