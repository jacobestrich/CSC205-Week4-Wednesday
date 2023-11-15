public class A implements Presentable
{
    private String AString;
    private String BString; 

    public A(String AString, String BString)
    {
        super();
        this.AString = AString;
        this.BString = BString;
    }

    @Override
    public String Present() 
    {
        return AString + BString;
    }

}
