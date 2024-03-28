abstract class Animal {
protected String species;
protected int age;

public Animal (String species, int age){
    this.species = species;
    this.age = age;
}
public abstract void sound();

public String toString(){
   return "Species: " + species +", " +"Age: " +age;
}
public boolean equals(Object obj){
   if(this == obj) return true;
   if(obj == null || getClass()!= obj.getClass()) return false;

   Animal otherAnimal = (Animal)obj;
   return species.equals(otherAnimal.species) && age==otherAnimal.age;
}
}

 class Mammal extends Animal {
    private String habit;
 
    public Mammal(String species, int age, String habit){
       super(species,age);
       this.habit = habit;
 }
 public void sound(){

 }
}

 class Bird extends Animal {
     private String featherColor;

     public Bird(String species, int age, String featherColor){
        super(species,age);
        this.featherColor = featherColor;
     }
public void sound(){

}
}

 class Parrot extends Bird {
private boolean canSpeak;

 public Parrot(String species, int age, String habit, String featherColor, boolean canSpeak){
    super(species,age,featherColor);
    this.canSpeak = canSpeak;
 }
 public void sound(){
   if(canSpeak){
    System.out.println("Parrot speaking");
   }
   else{
    System.out.println("Parrot sound");
   }
 }
}

public class Practical8 {
public static void main(String[] args) {
  Mammal lion = new Mammal("Lion", 5, "Grasslands");
  Bird eagle = new Bird("Eagle", 3, "Brown");
  Parrot talkingParrot = new Parrot ("Talking Parrot", 2, "Speech", "Green", true);

  System.out.println(lion);
  System.out.println(eagle);
  System.out.println(talkingParrot);

  System.out.println("Are lion and eagle equal? " +lion.equals(eagle));
  System.out.println("Are lion and lion equal? " +lion.equals(new Mammal("Lion", 5, "Grasslands")));
}
}
