package github.cesarferreira.helloworld;

/**
 * Created by cda43 on 18/11/2016.
 */

public class MainActivityPresenter {

    private final MainActivityView mMainActivityView;

    public MainActivityPresenter(MainActivityView mainActivityView) {
        mMainActivityView = mainActivityView;
    }

    public void toastButtonClicked() {
        mMainActivityView.showToast();
    }
}
