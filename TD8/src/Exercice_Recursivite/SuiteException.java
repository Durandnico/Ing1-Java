package Exercice_Recursivite;

public class SuiteException extends Exception{
    private String trace;
    private Exception exception;

    public SuiteException(String s, Exception e){
        trace = s;
        exception = e;
    }

    public void setTrace(String trace)
    {
        this.trace = trace;
    }

    public void setException(Exception e)
    {
        this.exception = e;
    }

    public String getTrace()
    {
        return this.trace;
    }

    public Exception getException()
    {
        return this.exception;
    }

    public void ajouterTrace(String add)
    {
        this.trace += add;
    }

    public String toString(){
        return  getException() + "\n" +
                getTrace() + "\n";
    }
}
