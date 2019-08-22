package arie.cobamvp;

public class Data {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public interface View {
        void onAttachView();

        void onDetachView();
    }
}
