package com.springinaction.chapter03.propeditor;

/**
 * Created by Vitek on 31.05.2015.
 */
public class PhoneNumber
{
    private String areaCode;
    private String prefix;
    private String number;

    public PhoneNumber()
    {
    }

    public PhoneNumber(String areaCode, String prefix,
                       String number)
    {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.number = number;
    }
}