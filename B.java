public class B extends A // implements Presentable (already implemented in A)
{
    private String CString;
    private String DString;

    public B(String AString, String BString, String CString, String DString)
    {

        super(AString, BString);
        this.CString = CString;
        this.DString = DString;

    }

    @Override
    public String Present() 
    {
        return super.Present() + CString + DString;
    }
}
