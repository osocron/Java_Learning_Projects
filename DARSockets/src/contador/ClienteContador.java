package contador;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteContador {

    public static int PUERTO_DEFAULT = 6000;
    public static String SERVIDOR_DEFAULT = "localhost";

    public static void main(String args[]) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket socket;
        InetAddress address;
        byte[] mensaje_bytes = new byte[256];
        String mensaje = "";
        mensaje_bytes = mensaje.getBytes();
        DatagramPacket paquete;
        String cadenaMensaje = "";
        DatagramPacket servPaquete;
        byte[] RecogerServidor_bytes = new byte[256];
        try {
            socket = new DatagramSocket();
            address = InetAddress.getByName(SERVIDOR_DEFAULT);
            do {
                mensaje = in.readLine();
                mensaje_bytes = mensaje.getBytes();
                paquete = new DatagramPacket(mensaje_bytes, mensaje.length(), address, PUERTO_DEFAULT);
                socket.send(paquete);
                RecogerServidor_bytes = new byte[256];
                servPaquete = new DatagramPacket(RecogerServidor_bytes, 256);
                socket.receive(servPaquete);
                cadenaMensaje = new String(RecogerServidor_bytes).trim();
                System.out.println("El total de caracteres enviados son: " + cadenaMensaje);
            } while (!mensaje.startsWith("fin"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

}
