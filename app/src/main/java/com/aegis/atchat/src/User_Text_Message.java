package com.aegis.atchat.src;

/**
 * Created by mendel on 2017-07-27.
 */


/**
 *
 * @author Avi
 */
public class User_Text_Message extends Message{
    private boolean viewed;
    private boolean delivered;

    public User_Text_Message(){
        super();
        viewed = false;
        delivered = false;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

}
