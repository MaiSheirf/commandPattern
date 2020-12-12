public class invocar {
    private Icommand on;
    private Icommand off;
    private Icommand up;
    private Icommand down;

    public invocar(Icommand on,Icommand off,Icommand up,Icommand down){
        this.on=on;
        this.off=off;
        this.up=up;
        this.down=down;

    }
    public void clickOn(){
        on.execute();
    }
    public void clickOff(){
        off.unexecute();

    }
}
