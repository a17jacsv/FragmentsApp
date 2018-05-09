package org.brohede.marcus.fragmentsapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MountainDetailsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MountainDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MountainDetailsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public static final String ARG_NAME = "mountain-name";
    public static final String ARG_LOCATION = "mountain-location";
    public static final String ARG_HEIGHT = "mountain-height";
    public static final String ARG_URL = "mountain-url";

    // TODO: Rename and change types of parameters
    private String mmountainname;
    private String mmountainlocation;
    private String mmountainheight;
    private String mmountainurl;

    private MountainData mmountain;



    private OnFragmentInteractionListener mListener;

    public MountainDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MountainDetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MountainDetailsFragment newInstance(String param1, String param2, String param3, String param4) {
        MountainDetailsFragment fragment = new MountainDetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, param1);
        args.putString(ARG_LOCATION, param2);
        args.putString(ARG_HEIGHT, param3);
        args.putString(ARG_URL, param4);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //mmountainname = getArguments().getString(ARG_NAME);
            //mmountainlocation = getArguments().getString(ARG_LOCATION);
            //mmountainheight = getArguments().getInt(ARG_HEIGHT);
            //mmountainurl = getArguments().getString(ARG_URL);

            mmountain = new MountainData(getArguments().getString(ARG_NAME), getArguments().getInt(ARG_HEIGHT),getArguments().getString(ARG_LOCATION)  ,getArguments().getString(ARG_URL));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Toast.makeText(getActivity().getApplicationContext(), mmountain.utmatare(), Toast.LENGTH_SHORT).show();

        return inflater.inflate(R.layout.fragment_mountain_details, container, false);


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
