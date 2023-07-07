import berry.User;
import model.Request;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.Socket;

public class PurpleShroom {
    private Socket client;
    private BufferedReader in;
    private PrintWriter out;

    public void startConnection(String ip, int port) throws IOException {
        client = new Socket(ip, port);
        out = new PrintWriter(client.getOutputStream());
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
    }

    private String[] requestInternal(String message) throws IOException {
        out.println(message);
        out.flush();
        return in.lines().toArray(String[]::new);
    }

    public String[] request(Request request) throws IOException {
        return requestInternal(request.getText());
    }

    public User getUser(Long userid) throws IOException {
        Request req = new Request(1, new String[]{userid.toString()});

        return new User(request(req));
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        client.close();
    }
}