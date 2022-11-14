public class SafeOpener {
    private int digit1 = (int) (Math.random() * 10);
    private int digit2 = (int) (Math.random()*10);
    private int digit3 = (int) (Math.random()*10);
    private int digit4 = (int) (Math.random()*10);
    private boolean safeOpened;

    public SafeOpener()
    {

    }

    public String combination()
    {
        String combination = "" + digit1 + digit2 + digit3 + digit4;
        return combination;
    }



}
