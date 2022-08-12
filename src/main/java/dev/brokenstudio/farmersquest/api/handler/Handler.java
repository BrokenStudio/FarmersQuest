package dev.brokenstudio.farmersquest.api.handler;

/*
    Project: FarmersQuest
    File: Handler
    Created by: Jan Z.
    Created at: 09.08.2022
     
    © 2022 BrokenStudio x Jan
*/
public interface Handler<A> {

    public A get(String key);
    public void set(String key, A value);
    public boolean init();
}
