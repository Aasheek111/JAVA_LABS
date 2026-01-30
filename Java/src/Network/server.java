
import java.net.*;
import java.io.*;

public class server {

    public static void main(String[] args) {

        InputStreamReader ir = null;
        OutputStreamWriter ow = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        Socket socket = null;
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(1234);

            socket = serverSocket.accept();
            System.out.print("client connected");

            ir = new InputStreamReader(socket.getInputStream());
            br = new BufferedReader(ir);

            ow = new OutputStreamWriter(socket.getOutputStream());
            bw = new BufferedWriter(ow);

            while (true) {

                String message = br.readLine();
                System.out.println("Client =" + message);

                bw.write("Message recieved");
                bw.newLine();
                bw.flush();

                if (message.equals("bye")) {
                    break;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
