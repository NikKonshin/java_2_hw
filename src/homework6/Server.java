package homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket server;
        Socket socket;
        Scanner sc;
        DataInputStream in;
        DataOutputStream out;

        final int PORT = 8189;

        try {
            server = new ServerSocket(PORT);
            System.out.println("Сервер запущен! ");

            socket = server.accept();
            System.out.println("Клиент подключился");

            sc = new Scanner(System.in);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            out.writeUTF("Вы подключились!");
            new Thread(()-> {
                try {
                    while (true) {

                        String str = in.readUTF();
                        System.out.println(str);


                        if (str.equals("/end")) {
                            break;

                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        in.close();
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            new Thread(()-> {
                try {
                    while (true) {

                        String msg = sc.nextLine();
                        out.writeUTF("Сервер: " + msg);

                    if (msg.equals("/end")) {
                        break;
                    }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        in.close();
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
