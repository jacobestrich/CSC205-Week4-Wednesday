import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(new Dog().GetSound());
        System.out.println(new Cat().GetSound());
        System.out.println(new Cow().GetSound());

        User user = new User("Jake");
        System.out.println(user);

        Instructor instructor = new Instructor("Nelson");
        System.out.println(instructor);


        ArrayList<User> userList = new ArrayList<User>();
        userList.add(user);
        PrintUsers(userList);

        B b = new B("Apple, ", "Carrot, ", "Tomato, ", "Pear, ");
        System.out.println(b.Present());

    }

    public static void PrintUsers(ArrayList<User> users)
    {
        for(var user : users)
        {
            System.out.println(user);
        }

    }




}
