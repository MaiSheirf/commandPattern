public class command implements Icommand{
    light light;
    public command(light l){
        this.light = l;
    }
    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void unexecute() {
        this.light.off();
    }
}
