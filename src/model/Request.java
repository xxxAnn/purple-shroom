package model;

import java.util.ArrayList;

public class Request {
    private String text;
    public Request(int code, String[] values) {
        if (code == 1) {
            text = getUser(values[0]);
        } else {
            text = "";
        }
    }

    private String getUser(String userid) {
        return String.format("001\r\n%s\r\n", userid);
    }

    public String getText() {
        return text;
    }
}
