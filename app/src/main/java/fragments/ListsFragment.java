/*
 * Copyright (c) 2017. Truiton (http://www.truiton.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * Mohit Gupt (https://github.com/mohitgupt)
 *
 */

package fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ines.seemovies.R;

public class ListsFragment extends Fragment {

    private TabLayout tab_lists;
    private ViewPager viewPager;

    public static ListsFragment newInstance() {
        ListsFragment fragment = new ListsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_lists, container, false);

        tab_lists = (TabLayout) view.findViewById(R.id.tab_lists);

        tab_lists.addTab(tab_lists.newTab().setText(R.string.title_generos));
        tab_lists.addTab(tab_lists.newTab().setText(R.string.title_topics));

        final ViewPager view_pager = (ViewPager) view.findViewById(R.id.viewpager);
        /*final ViewPagerAdapter adapter = new ViewPagerAdapter(getFragmentManager(), tab_lists.getTabCount());
                view_pager.setAdapter(adapter);

    /*tab_lists.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
/*@Override
            public void onTabSelected(TabLayout.Tab tab) {
                    view_pager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
          }
           @Override
            public void onTabReselected(TabLayout.Tab tab) {
          }


    });*/
        return view;
    }}
