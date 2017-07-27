package com.aegis.atchat.src;

/**
 * Created by mendel on 2017-07-27.
 */

import java.time.Instant;
/**
 *
 * @author Avi
 */
public abstract class Message {
    private Instant message_created;
    private String content;

    public Message(){
        message_created = Instant.now();
    }

    public void displayTime(){
        System.out.println(message_created.toString());
    }

    public Instant getMessage_created() {
        return message_created;
    }

    public void setMessage_created(Instant message_created) {
        this.message_created = message_created;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
