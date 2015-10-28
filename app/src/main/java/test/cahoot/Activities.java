package test.cahoot;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Activities extends Fragment {

    Fragment fr;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_activities, container, false);

        create_request();

        final Button button1 = (Button) view.findViewById(R.id.request_button);
        final Button button2 = (Button) view.findViewById(R.id.itinerary_button);

        button1.setBackgroundResource(R.drawable.requestbutton2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create_request();
                button1.setBackgroundResource(R.drawable.requestbutton2);
                button2.setBackgroundResource(R.drawable.itenerarybutton);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create_itenerary();
                button2.setBackgroundResource(R.drawable.itenerarybutton2);
                button1.setBackgroundResource(R.drawable.requestbutton);
            }
        });

        return view;
    }

    private void create_itenerary(){
        fr = new Itenerary();

        fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.activities_fragment, fr);
        fragmentTransaction.commit();

    }
    private void create_request(){
        fr = new Request();

        fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.activities_fragment, fr);
        fragmentTransaction.commit();

    }
}
