package diccionario;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClienteDiccionario {

    public static int PUERTO_DEFAULT = 6000;
    public static String SERVIDOR_DEFAULT = "127.0.0.1";
    public static void main(String args[]) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Socket socket;
        byte[] mensaje_bytes = new byte[256];
        String mensaje="";
        try {
            socket = new Socket(SERVIDOR_DEFAULT,PUERTO_DEFAULT);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            do {
                mensaje = in.readLine();
                out.writeUTF(mensaje);
            } while (!mensaje.startsWith("fin"));
        }catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

}
