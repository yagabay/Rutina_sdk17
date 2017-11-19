package com.example.rutina_sdk17;

public class Routine {

    String _title;
    String _prevEventTime;
    String _nextEventTime;

    Routine(String title, String prevEventTime, String nextEventTime){
        _title = title;
        _prevEventTime = prevEventTime;
        _nextEventTime = nextEventTime;
    }

    String getTitle(){
        return _title;
    }

    String getPrevEventTime(){
        return _prevEventTime;
    }

    String getNextEventTime(){
        return _nextEventTime;
    }

}
