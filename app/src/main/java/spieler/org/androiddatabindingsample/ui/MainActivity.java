package spieler.org.androiddatabindingsample.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import spieler.org.androiddatabindingsample.R;
import spieler.org.androiddatabindingsample.databinding.UserProfileBinding;
import spieler.org.androiddatabindingsample.pojo.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UserProfileBinding userProfileBinding = DataBindingUtil.setContentView(this, R.layout.user_profile);
        User user = new User("Rupesh", "Mahajan", "Pune", "+9190000000");
        userProfileBinding.setUser(user);
    }
}
