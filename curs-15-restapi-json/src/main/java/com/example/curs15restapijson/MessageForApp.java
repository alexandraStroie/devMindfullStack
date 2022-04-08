package com.example.curs15restapijson;

import lombok.Data;

import java.util.Date;

@Data
public class MessageForApp {
    public String sender;
    public String receiver;
    public String text;
    public boolean seen;
    public Date sentDate;
}
