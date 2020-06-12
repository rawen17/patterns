package widgets;

public abstract class ContentControl extends UIComponent {
    private String text;

    public ContentControl(String text) {
        this.text = text;
    }
    public ContentControl() {
        this("");
    }


    public void setText() {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    @Override
    public int getWidth() {
        return getText().length() + 2;
    }

    @Override
    public int getHeight() {
        return 1;
    }

}
