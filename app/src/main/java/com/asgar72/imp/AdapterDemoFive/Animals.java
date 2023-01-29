package com.asgar72.imp.AdapterDemoFive;
//This is constructor
public class Animals
{
    String animal_name ;
    int animal_image;

    public  Animals(int animal_image,String animal_name)
    {
        this.animal_image = animal_image;
        this.animal_name = animal_name;
    }


    // this is getter methods //encapsulation
    public  int getAnimal_image()
    {
        return  animal_image;
    }
    public String getAnimal_name()
    {
        return  animal_name;
    }

}
