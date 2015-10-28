package test.cahoot;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Post extends Fragment {

    Fragment fr;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_post, container, false);

        Button button1 = (Button) view.findViewById(R.id.post_trip_button);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                show_postitinerary_fragment();
            }
        });

        Button button2 = (Button) view.findViewById(R.id.post_request_button);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                show_postrequest_fragment();
            }
        });

        return view;
    }

    private void show_postitinerary_fragment(){
        fr = new Post_itinerary();

        fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.post_fragment, fr);
        fragmentTransaction.commit();

        View post = getActivity().findViewById(R.id.post_container);
        post.setVisibility(View.GONE);

    }

    private void show_postrequest_fragment(){
        fr = new Post_request();

        fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.post_fragment, fr);
        fragmentTransaction.commit();

        View post = getActivity().findViewById(R.id.post_container);
        post.setVisibility(View.GONE);

    }
}
