package com.example.masterdflow2;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.masterdflow2.dummy.DummyContent;

/**
 * A fragment representing a single website detail screen.
 * This fragment is either contained in a {@link recipeListActivity}
 * in two-pane mode (on tablets) or a {@link recipeDetailActivity}
 * on handsets.
 */
public class recipeDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public recipeDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.website_detail, container, false);
        WebView webView= rootView.findViewById(R.id.website_detail);
        // Show the dummy content as text in a TextView.
          //  ((TextView) rootView.findViewById(R.id.website_detail)).setText(mItem.content);


        if (mItem.id.equals("1")){
                rootView = inflater.inflate(R.layout.photos,container,false);
            }
            if (mItem.id.equals("2")){
                rootView = inflater.inflate(R.layout.tour,container,false);
            }
            if (mItem.id.equals("3")){
                webView.loadUrl(mItem.website_URL);

            }

        return rootView;
    }
}