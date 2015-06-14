package com.springinaction.knights;

/**
 * Created by Vitek on 23.05.2015.
 */
public class BraveKnight implements Knight
{

    private Quest quest;

    public BraveKnight(Quest quest)
    {
        this.quest = quest;
    }


    @Override
    public void embarkOnQuest()
    {
        System.out.println("BraveKnight embarkOnQuest");
        quest.embark();
    }
}
