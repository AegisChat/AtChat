package com.aegis.atchat.src;

/**
 * Created by mendel on 2017-07-27.
 */

/**
 *
 * @author Avi
 */
public class ID {
    private int id_number;

    public ID(int id_number){
        this.id_number = id_number; //TEMPORARY
    }
    public boolean equals(ID id){
        if (this.id_number == id.id_number)
            return true;
        else
            return false;
    }

    public int getIDNumber(){
        return id_number;
    }

    public ID clone(){
        ID id = new ID(getIDNumber());
        return id;
    }
}

