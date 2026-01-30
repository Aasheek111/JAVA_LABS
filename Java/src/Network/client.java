import java.net.*;
import java.util.Scanner;
import java.io.*;

public class client {

    public static void main(String[] args) {

        Socket socket = null;
        InputStreamReader isr = null;
        OutputStreamWriter osr = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        Scanner scanner = new Scanner(System.in);

        try {
            socket = new Socket("localhost", 1234);

            isr = new InputStreamReader(socket.getInputStream());
            osr = new OutputStreamWriter(socket.getOutputStream());

            br = new BufferedReader(isr);
            bw = new BufferedWriter(osr);

            while (true) {

                String message = scanner.nextLine();

                bw.write(message);
                bw.newLine();
                bw.flush();

                if (message.equals("bye")) {
                    break;
                }

                System.out.println("Server = " + br.readLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
