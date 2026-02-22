package httpServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class httpServerMain {

    public static void main(String[] args) throws IOException {
        Employee emp1 = new Employee("sameerkr", "Developer");
        Employee emp2 = new Employee("sameer", "Manager");



        ServerSocket server =new ServerSocket(9000);

        while (true){
            final Socket client = server.accept();
            BufferedReader reader=new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter writer=new PrintWriter(new OutputStreamWriter(client.getOutputStream()));

            while(true){
                String line=reader.readLine();
                if(line.isEmpty()){
                    break;
                }
                System.out.println(line);
                if(line.contains("GET")){
                    int indexOfGet=line.indexOf("/");
                    int indexOfHttp=line.indexOf(" HTTP");
                    String resource=line.substring(indexOfGet+1,indexOfHttp);
                    System.out.println("Resource requested: "+resource);
                }
                String crlf = "\r\n";
                writer.print("HTTP/1.1 500 OK"+crlf);
                writer.print("Content-Type: application/json"+crlf);
                writer.println("Content-Length: "+emp1.toString().length()+crlf);
                writer.print(emp1.toString());

                writer.flush();
                writer.close();
                reader.close();
                client.close();
                break;

            }


        }
    }
}
