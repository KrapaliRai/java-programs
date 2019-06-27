package com.krapali_prac_may;

public class Zoo
{
    String species, name;
   // Animal animal1 = new Animal();
    public Zoo(){

}

    public Zoo(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public void callingAnimal(){
        Animal an1 = new Animal("tiger","jacky","carnivor",3,true);
        an1.eat();
    }


}
