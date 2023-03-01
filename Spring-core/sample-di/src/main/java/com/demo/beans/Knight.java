package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Knight {
//    bad Code
//    private RescuingDimselQuest quest = new RescuingDimselQuest();
//    private SlyingDragonQuest quest = new SlyingDragonQuest();
//    private SingYoYeYOQuest quest = new SingYoYeYOQuest();
    @Autowired //@QuestType(type = QuestType.Type.YoYeYo)
    private Quest quest;
    private MyClass myClass;

    public Knight(Quest quest, @Autowired(required = false) MyClass myClass) {
        this.quest = quest;
        this.myClass = myClass;
    }

    public  String goQuest(){
        return quest.goQuest();

    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
    @Autowired
    public void setSpringBean(List<MyInterface> list){
        for (MyInterface obj:list){

            System.out.println(obj);
        }

    }
}
