package github.cesarferreira.helloworld;

public class MainActivityPresenter {

    private final MainActivityView mMainActivityView;

    public MainActivityPresenter(MainActivityView mainActivityView) {
        mMainActivityView = mainActivityView;
    }

    public void toastButtonClicked() {
        mMainActivityView.showToast();
    }
}
