package github.cesarferreira.helloworld;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class MainActivityPresenterTest {

    @Mock MainActivityView mainActivityView;
    MainActivityPresenter mCut;

    @Before
    public void setUp() {
        mock(MainActivityView.class);
        mCut = new MainActivityPresenter(mainActivityView);
    }

    @Test
    public void toastButtonClicked() {

        // when
        mainActivityView.showToast();

        // then
        verify(mCut, times(1)).toastButtonClicked();

    }

}
