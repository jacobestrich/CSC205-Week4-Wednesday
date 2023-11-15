public interface Animal
{
    //Method GetSound
    public static String GetSound()
    {
        return GetSound();
    }

    public static void main(String[] args) 
    {
        System.out.println(Dog.GetSound());
        System.out.println(Cat.GetSound());
        System.out.println(Cow.GetSound());
    }

    
}