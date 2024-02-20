package br.com.ajdev;

import br.com.ajdev.server.TcpServer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TcpServer server = new TcpServer();
        server.start(7878);
    }

}