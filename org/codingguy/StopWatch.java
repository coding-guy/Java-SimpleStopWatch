package org.codingguy;

import org.slf4j.Logger;


public class StopWatch
{
    private static boolean useLogger = false;

    private static Logger logger;

    private String stopWatchName;

    private String name;

    private long startMs = -1L;

    private long endMs = -1L;


    public StopWatch()
    {
    }


    public StopWatch( String stopWatchName )
    {
        this.stopWatchName = stopWatchName;
    }


    public void setLogger( Logger logger )
    {
        this.logger = logger;
        if( this.logger != null )
        {
            this.useLogger = true;
        }
    }


    public void start( String name )
    {
        this.name = name;
        this.startMs = System.currentTimeMillis();
        this.endMs = -1;
    }


    public void stop()
    {
        endMs = System.currentTimeMillis();
        long duration = endMs - startMs;
        String message = "[" + name + "] has took " + duration + " ms";

        if( stopWatchName != null && !stopWatchName.isEmpty() )
            message = "[" + stopWatchName + "]" + message;

        if( useLogger )
            logger.info( message );
        else
            System.out.println( message );

        // if StopWatch is reused without start() method
        startMs = System.currentTimeMillis();
    }
}

