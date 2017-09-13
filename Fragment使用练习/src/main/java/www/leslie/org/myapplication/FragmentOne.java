package www.leslie.org.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentOne.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentOne#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentOne extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("FragmentOne", "onCreateView()");
        return inflater.inflate(R.layout.fragment_fragment_one, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("FragmentOne", "onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FragmentOne", "onCreate()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("FragmentOne", "onDestroy()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("FragmentOne", "onDestroyView()");
        Log.d("FragmentOne", "getActivity()==null:" + (getActivity() == null));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("FragmentOne", "onDetach()");
    }
}
