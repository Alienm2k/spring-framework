package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("yoyo") //@QuestType(type = QuestType.Type.YoYeYo)
public class SingYoYeYOQuest implements Quest{
    public String goQuest(){
        return "Knight Sing Yo Ye Yo ";
    }
}
