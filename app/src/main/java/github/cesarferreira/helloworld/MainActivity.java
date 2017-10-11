package github.cesarferreira.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity implements MainActivityView {

    MainActivityPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);

        setupViews();
    }

    private void setupViews() {
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "Hi, I'm a toast!", Toast.LENGTH_SHORT).show();
    }
}
