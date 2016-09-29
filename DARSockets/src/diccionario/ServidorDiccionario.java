package diccionario;


import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Map;

public class ServidorDiccionario {

    public static int PUERTO_DEFAULT = 6000;

    public static void main(String argv[]) {
        ServerSocket socket;
        boolean fin = false;
        Hashtable<String, Integer> dic = new Hashtable<>();
        try {
            socket = new ServerSocket(PUERTO_DEFAULT);
            Socket socket_cli = socket.accept();
            DataInputStream in = new DataInputStream(socket_cli.getInputStream());
            do {
                String mensaje ="";
                mensaje = in.readUTF();
                String[] parts = mensaje.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    //System.out.println(dic.)
                    if (dic.containsKey(parts[i])) {
                      dic.put(parts[i], dic.get(parts[i]) + 1);
                    }
                    else {
                        dic.put(parts[i], 1);
                    }
                }
                System.out.println("----------------------------------------");
                for (Map.Entry<String, Integer> entry : dic.entrySet()) {
                    System.out.println("Palabra : " + entry.getKey() + " Contador : " + entry.getValue());
                }
            } while (1>0);
        }catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

}
