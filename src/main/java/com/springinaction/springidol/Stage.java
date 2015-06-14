package com.springinaction.springidol;

/**
 * Created by Vitek on 25.05.2015.
 */
public class Stage
{
    private Stage()
    {
    }

    private static class StageSingletonHolder
    {
        static Stage instance = new Stage(); // Создание экземпляра
    }

    public static Stage getInstance()
    {
        return StageSingletonHolder.instance; // Возвращает экземпляр
    }
}