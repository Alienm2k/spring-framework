package com.demo.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("great") //@QuestType(type = QuestType.Type.Matrimony)
public class GreatMatrimonyQuest implements Quest{
    @Override
    public String goQuest() {
        return  "Knight and Princess are Performs the great matrimony!";
    }
}
