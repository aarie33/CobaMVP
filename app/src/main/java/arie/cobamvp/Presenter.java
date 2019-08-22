package arie.cobamvp;

public interface Presenter<T extends Data.View> {
    void onAttach(T view);

    void onDetach();
}
