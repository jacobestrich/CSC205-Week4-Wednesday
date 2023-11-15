public interface Animal
{
    //Method GetSound
    public String GetSound();
    

    default public boolean CanSwim()
    {
        return true;
    }


}
