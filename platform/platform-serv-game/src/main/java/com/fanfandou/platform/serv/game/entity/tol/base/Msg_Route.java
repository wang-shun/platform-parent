// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from proto

package com.fanfandou.platform.serv.game.entity.tol.base;

import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Schema;

import javax.annotation.Generated;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


@Generated("java_bean")
public final class Msg_Route implements Externalizable, Message<Msg_Route>, Schema<Msg_Route>
{

    public static Schema<Msg_Route> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static Msg_Route getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final Msg_Route DEFAULT_INSTANCE = new Msg_Route();

    

    public Msg_Route()
    {

    }

    // getters and setters

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        final Msg_Route that = (Msg_Route) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Msg_Route{" +
                '}';
    }
    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<Msg_Route> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public Msg_Route newMessage()
    {
        return new Msg_Route();
    }

    public Class<Msg_Route> typeClass()
    {
        return Msg_Route.class;
    }

    public String messageName()
    {
        return Msg_Route.class.getSimpleName();
    }

    public String messageFullName()
    {
        return Msg_Route.class.getName();
    }

    public boolean isInitialized(Msg_Route message)
    {
        return true;
    }

    public void mergeFrom(Input input, Msg_Route message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, Msg_Route message) throws IOException
    {
    }

    public String getFieldName(int number)
    {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name)
    {
        return Integer.parseInt(name);
    }
    

}