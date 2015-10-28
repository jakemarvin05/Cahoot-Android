package test.cahoot;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Explore extends Fragment {

    Fragment fr;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;

    boolean clicked = false;
    boolean poof = false;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_explore, container, false);

        final Button button2 = (Button) view.findViewById(R.id.back_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                destroy_explore_fragment();
                button2.setVisibility(View.GONE);
            }
        });
        button2.setVisibility(View.GONE);

        Button button1 = (Button) view.findViewById(R.id.america_product_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create_explore_fragment();
                button2.setVisibility(View.VISIBLE);
            }
        });

        return view;
    }


    //COMPOUND FUNCTIONS//
    private void create_explore_fragment(){

        create_explore_product();

        hide_explore_container();

        show_explore_fragment();

        clicked = true;

    }
    private void destroy_explore_fragment(){

        show_explore_container();

        hide_explore_fragment();

    }
    //COMPOUND FUNCTIONS END//

    //FUNCTIONS//
    private void create_explore_product(){
        fr = new Explore_product();

        fm = getFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.explore_fragment, fr);
        fragmentTransaction.commit();
    }

    private void hide_explore_container() {

        View explore = getActivity().findViewById(R.id.explore_container);
        explore.setVisibility(View.GONE);
    }
    private void show_explore_container() {

        View explore = getActivity().findViewById(R.id.explore_container);
        explore.setVisibility(View.VISIBLE);
    }

    private void show_explore_fragment() {

        View explore_product = getActivity().findViewById(R.id.explore_fragment);
        explore_product.setVisibility(View.VISIBLE);
    }
    private void hide_explore_fragment() {

        View explore_product = getActivity().findViewById(R.id.explore_fragment);
        explore_product.setVisibility(View.GONE);
    }
    private void hide_back_button() {

        View back_button = getActivity().findViewById(R.id.back_button_container);
        back_button.setVisibility(View.GONE);
    }
    private void show_back_button() {

        View back_button = getActivity().findViewById(R.id.back_button_container);
        back_button.setVisibility(View.VISIBLE);
    }
    //FUNCTIONS END//
}
