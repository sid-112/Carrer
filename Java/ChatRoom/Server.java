package com.ChatRoom;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(9999);
            Socket client = server.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    class ConnectionHandler implements Runnable{

        private Socket client;

        public ConnectionHandler(Socket client){

        }

        @Override
        public void run(){

        }

    }
}


