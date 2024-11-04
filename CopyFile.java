import java.io.*;

public class CopyFile {
    private static void copyDemo(String src, String dst) {
        File f1 = new File(src);
        File f2 = new File(dst);

        // Check if source file exists
        if (!f1.exists()) {
            System.out.println("Source file does not exist: " + src);
            return;
        }

        // Use try-with-resources for automatic resource management
        try (InputStream in = new FileInputStream(f1);
             OutputStream out = new FileOutputStream(f2)) {
             
            byte[] buff = new byte[1024];
            int len;
            while ((len = in.read(buff)) > 0) {
                out.write(buff, 0, len);
            }
            System.out.println("File copied successfully!");

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Check if both source and destination file paths are provided
        if (args.length != 2) {
            System.out.println("Usage: java CopyFile <source> <destination>");
            return;
        }

        copyDemo(args[0], args[1]);
    }
}
