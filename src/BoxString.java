public class BoxString extends MagicBox{
    private String text;
    public BoxString(String text){
        this.text = text;
    }
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
