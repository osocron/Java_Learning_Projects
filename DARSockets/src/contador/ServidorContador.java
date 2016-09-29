package contador;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class ServidorContador {

    public static int PUERTO_DEFAULT = 6000;

    public static void main(String args[]) {
        DatagramSocket socket;
        boolean fin = false;
        int cont = 0;
        try {
            socket = new DatagramSocket(PUERTO_DEFAULT);
            byte[] mensaje_bytes = new byte[256];
            String mensaje ="";
            mensaje = new String(mensaje_bytes);
            String mensajeComp ="";
            DatagramPacket paquete = new DatagramPacket(mensaje_bytes,256);
            DatagramPacket envpaquete = new DatagramPacket(mensaje_bytes,256);
            int puerto;
            InetAddress address;
            byte[] mensaje2_bytes = new byte[256];

            do {
                socket.receive(paquete);
                mensaje = new String(mensaje_bytes).trim();
                System.out.println(mensaje);
                puerto = paquete.getPort();
                address = paquete.getAddress();
                cont += mensaje.length();
                mensajeComp = String.valueOf(cont);
                mensaje2_bytes = mensajeComp.getBytes();
                envpaquete = new DatagramPacket(mensaje2_bytes,mensajeComp.length(),address,puerto);
                socket.send(envpaquete);
            } while (1>0);
        }catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

}
