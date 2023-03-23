import java.io.*;
public class HTMLFileWriteSample {
    public static void writeHTMLFile(PrintWriter printer, String innerHTML) {
        printer.println("<!DOCTYPE html>");
        printer.println("<html>");
        printer.println("  <body>");
        printer.println("    <p>" + innerHTML + "</p>");
        printer.println("  </body>");
        printer.println("</html>");
    }
    public static void main(String[] args){
        try{
            String fileName = "simple.html";
            if(args.length > 0){
                fileName = args[0];
            }
            PrintWriter filePrinter = new PrintWriter(new File(fileName));
            writeHTMLFile(filePrinter, "Hello <b>HTML</b> world!");
            filePrinter.close();
            PrintWriter systemOutPrinter = new PrintWriter(System.out);
            writeHTMLFile(systemOutPrinter, "Hello <b>HTML</b> world!");
            systemOutPrinter.close();
        }catch(IOException exp){
            exp.printStackTrace();
        }
    }
}