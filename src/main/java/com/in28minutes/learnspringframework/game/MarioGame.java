package com.in28minutes.learnspringframework.game;

import lombok.Data;

@Data
public class MarioGame {
    public void up(){
        System.out.println("Going up");
    }
    public void left(){
        System.out.println("Going left");
    }
    public void right(){
        System.out.println("Going right");
    }
    public void down(){
        System.out.println("Going down");
    }
}
