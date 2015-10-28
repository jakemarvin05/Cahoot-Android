package test.cahoot;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    Fragment fr;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.explore_button);
        final Button button2 = (Button) findViewById(R.id.activities_button);
        final Button button3 = (Button) findViewById(R.id.post_button);
        final Button button4 = (Button) findViewById(R.id.inbox_button);
        final Button button5 = (Button) findViewById(R.id.profile_button);

        button1.setBackgroundResource(R.drawable.exploreicon2);
        explore_change_text_color();

        create_explore();
        create_activities();
        create_post();
        create_inbox();
        create_profile();

        show_explore();

        hide_activities();
        hide_post();
        hide_inbox();
        hide_profile();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_explore();

                hide_activities();
                hide_post();
                hide_inbox();
                hide_profile();

                button1.setBackgroundResource(R.drawable.exploreicon2);

                button2.setBackgroundResource(R.drawable.activitiesicon);
                button3.setBackgroundResource(R.drawable.posticon);
                button4.setBackgroundResource(R.drawable.inboxicon);
                button5.setBackgroundResource(R.drawable.profileicon);

                explore_change_text_color();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_activities();

                hide_explore();
                hide_post();
                hide_inbox();
                hide_profile();

                button2.setBackgroundResource(R.drawable.activitiesicon2);

                button1.setBackgroundResource(R.drawable.exploreicon);
                button3.setBackgroundResource(R.drawable.posticon);
                button4.setBackgroundResource(R.drawable.inboxicon);
                button5.setBackgroundResource(R.drawable.profileicon);

                activities_change_text_color();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_post();

                hide_explore();
                hide_activities();
                hide_inbox();
                hide_profile();

                button3.setBackgroundResource(R.drawable.posticon2);

                button1.setBackgroundResource(R.drawable.exploreicon);
                button2.setBackgroundResource(R.drawable.activitiesicon);
                button4.setBackgroundResource(R.drawable.inboxicon);
                button5.setBackgroundResource(R.drawable.profileicon);

                post_change_text_color();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_inbox();

                hide_explore();
                hide_activities();
                hide_post();
                hide_profile();

                button4.setBackgroundResource(R.drawable.inboxicon2);

                button1.setBackgroundResource(R.drawable.exploreicon);
                button2.setBackgroundResource(R.drawable.activitiesicon);
                button3.setBackgroundResource(R.drawable.posticon);
                button5.setBackgroundResource(R.drawable.profileicon);

                inbox_change_text_color();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_profile();

                hide_explore();
                hide_activities();
                hide_post();
                hide_inbox();

                button5.setBackgroundResource(R.drawable.profileicon2);

                button1.setBackgroundResource(R.drawable.exploreicon);
                button2.setBackgroundResource(R.drawable.activitiesicon);
                button3.setBackgroundResource(R.drawable.posticon);
                button4.setBackgroundResource(R.drawable.inboxicon);

                profile_change_text_color();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }


    private void create_explore(){
        fr = new Explore();

        fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.explore_fragment_main, fr);
        fragmentTransaction.commit();
    }

    private void create_activities(){
        fr = new Activities();

        fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.activities_fragment_main, fr);
        fragmentTransaction.commit();
    }

    private void create_post(){
        fr = new Post();

        fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.post_fragment_main, fr);
        fragmentTransaction.commit();
    }

    private void create_inbox(){
        fr = new Inbox();

        fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.inbox_fragment_main, fr);
        fragmentTransaction.commit();
    }

    private void create_profile(){
        fr = new Profile();
        fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.profile_fragment_main, fr);
        fragmentTransaction.commit();
    }

    private void show_explore(){
        View explore = findViewById(R.id.explore_fragment_main);
        explore.setVisibility(View.VISIBLE);
    }

    private void show_activities(){
        View activities = findViewById(R.id.activities_fragment_main);
        activities.setVisibility(View.VISIBLE);
    }

    private void show_post(){
        View post = findViewById(R.id.post_fragment_main);
        post.setVisibility(View.VISIBLE);
    }

    private void show_inbox(){
        View inbox = findViewById(R.id.inbox_fragment_main);
        inbox.setVisibility(View.VISIBLE);
    }

    private void show_profile(){
        View profile = findViewById(R.id.profile_fragment_main);
        profile.setVisibility(View.VISIBLE);
    }

    private void hide_explore(){
        View explore = findViewById(R.id.explore_fragment_main);
        explore.setVisibility(View.GONE);
    }

    private void hide_activities(){
        View activities = findViewById(R.id.activities_fragment_main);
        activities.setVisibility(View.GONE);
    }

    private void hide_post(){
        View post = findViewById(R.id.post_fragment_main);
        post.setVisibility(View.GONE);
    }

    private void hide_inbox(){
        View inbox = findViewById(R.id.inbox_fragment_main);
        inbox.setVisibility(View.GONE);
    }

    private void hide_profile(){
        View profile = findViewById(R.id.profile_fragment_main);
        profile.setVisibility(View.GONE);
    }

    private void explore_change_text_color(){
        TextView textView1 = (TextView) findViewById(R.id.explore_button_text);
        TextView textView2 = (TextView) findViewById(R.id.activities_button_text);
        TextView textView3 = (TextView) findViewById(R.id.post_button_text);
        TextView textView4 = (TextView) findViewById(R.id.inbox_button_text);
        TextView textView5 = (TextView) findViewById(R.id.profile_button_text);

        textView1.setTextColor(getResources().getColor(R.color.textColorPrimary));
        textView2.setTextColor(getResources().getColor(R.color.textGray));
        textView3.setTextColor(getResources().getColor(R.color.textGray));
        textView4.setTextColor(getResources().getColor(R.color.textGray));
        textView5.setTextColor(getResources().getColor(R.color.textGray));
    }

    private void activities_change_text_color(){
        TextView textView1 = (TextView) findViewById(R.id.explore_button_text);
        TextView textView2 = (TextView) findViewById(R.id.activities_button_text);
        TextView textView3 = (TextView) findViewById(R.id.post_button_text);
        TextView textView4 = (TextView) findViewById(R.id.inbox_button_text);
        TextView textView5 = (TextView) findViewById(R.id.profile_button_text);

        textView2.setTextColor(getResources().getColor(R.color.textColorPrimary));

        textView1.setTextColor(getResources().getColor(R.color.textGray));
        textView3.setTextColor(getResources().getColor(R.color.textGray));
        textView4.setTextColor(getResources().getColor(R.color.textGray));
        textView5.setTextColor(getResources().getColor(R.color.textGray));
    }

    private void post_change_text_color(){
        TextView textView1 = (TextView) findViewById(R.id.explore_button_text);
        TextView textView2 = (TextView) findViewById(R.id.activities_button_text);
        TextView textView3 = (TextView) findViewById(R.id.post_button_text);
        TextView textView4 = (TextView) findViewById(R.id.inbox_button_text);
        TextView textView5 = (TextView) findViewById(R.id.profile_button_text);

        textView3.setTextColor(getResources().getColor(R.color.textColorPrimary));

        textView1.setTextColor(getResources().getColor(R.color.textGray));
        textView2.setTextColor(getResources().getColor(R.color.textGray));
        textView4.setTextColor(getResources().getColor(R.color.textGray));
        textView5.setTextColor(getResources().getColor(R.color.textGray));
    }

    private void inbox_change_text_color(){
        TextView textView1 = (TextView) findViewById(R.id.explore_button_text);
        TextView textView2 = (TextView) findViewById(R.id.activities_button_text);
        TextView textView3 = (TextView) findViewById(R.id.post_button_text);
        TextView textView4 = (TextView) findViewById(R.id.inbox_button_text);
        TextView textView5 = (TextView) findViewById(R.id.profile_button_text);

        textView4.setTextColor(getResources().getColor(R.color.textColorPrimary));

        textView1.setTextColor(getResources().getColor(R.color.textGray));
        textView2.setTextColor(getResources().getColor(R.color.textGray));
        textView3.setTextColor(getResources().getColor(R.color.textGray));
        textView5.setTextColor(getResources().getColor(R.color.textGray));
    }

    private void profile_change_text_color(){
        TextView textView1 = (TextView) findViewById(R.id.explore_button_text);
        TextView textView2 = (TextView) findViewById(R.id.activities_button_text);
        TextView textView3 = (TextView) findViewById(R.id.post_button_text);
        TextView textView4 = (TextView) findViewById(R.id.inbox_button_text);
        TextView textView5 = (TextView) findViewById(R.id.profile_button_text);

        textView5.setTextColor(getResources().getColor(R.color.textColorPrimary));

        textView1.setTextColor(getResources().getColor(R.color.textGray));
        textView2.setTextColor(getResources().getColor(R.color.textGray));
        textView3.setTextColor(getResources().getColor(R.color.textGray));
        textView4.setTextColor(getResources().getColor(R.color.textGray));
    }
}