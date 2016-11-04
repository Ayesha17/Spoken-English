package com.example.mimsoft.appspokenenglish;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ParentLevelAdapter extends BaseExpandableListAdapter {
int flag=-1;
    private final Context mContext;
    private final List<String> mListDataHeader;
    private final Map<String, List<String>> mListData_SecondLevel_Map;
    private final Map<String, List<String>> mListData_ThirdLevel_Map;

    public ParentLevelAdapter(Context mContext, List<String> mListDataHeader) {
        this.mContext = mContext;
        this.mListDataHeader = new ArrayList<>();
        this.mListDataHeader.addAll(mListDataHeader);
        // SECOND LEVEL
        String[] mItemHeaders;
        mListData_SecondLevel_Map = new HashMap<>();
        int parentCount = mListDataHeader.size();
        for (int i = 0; i < parentCount; i++) {
            String content = mListDataHeader.get(i);
            switch (content) {
                case "A":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_one_child);
                    break;
                case "B":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child1);
                    break;
                case "C":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child2);
                    break;
                case "D":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child3);
                    break;
                case "E":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child4);
                    break;
                case "F":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child5);
                    break;
                case "G":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child6);
                    break;
                case "H":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child7);
                    break;
                case "I":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child8);
                    break;
                case "J":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child9);
                    break;
                case "K":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child10);
                    break;
                case "L":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child11);
                    break;
                case "M":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child12);
                    break;
                case "N":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child13);
                    break;
                case "O":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child14);
                    break;
                case "P":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child15);
                    break;
                case "Q":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child16);
                    break;
                case "S":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child17);
                    break;
                case "T":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child18);
                    break;
                case "U":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child19);
                    break;
                case "V":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child20);
                    break;
                case "W":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child21);
                    break;
                case "X":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child22);
                    break;
                case "Y":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child23);
                    break;
                case "Z":
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one_two_child24);
                    break;
                default:
                    mItemHeaders = mContext.getResources().getStringArray(R.array.items_array_expandable_level_two);
            }
            mListData_SecondLevel_Map.put(mListDataHeader.get(i), Arrays.asList(mItemHeaders));
        }


        // THIRD LEVEL
        String[] mItemChildOfChild;
        List<String> listChild;
        mListData_ThirdLevel_Map = new HashMap<>();
        for (Object o : mListData_SecondLevel_Map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            Object object = entry.getValue();
            if (object instanceof List) {
                List<String> stringList = new ArrayList<>();
                Collections.addAll(stringList, (String[]) ((List) object).toArray());
                for (int i = 0; i < stringList.size(); i++) {
                    if (i == 0) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one2);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }
                    if (i == 1) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one3);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }
                    if (i == 2) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one4);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }
                    if (i == 3) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one5);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }
                    if (i == 4) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one6);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }
                    if (i == 5) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one7);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }
                    if (i == 6) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one12);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }
                    if (i == 7) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one8);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }
                    if (i == 8) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one9);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }
                    if (i == 9) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one10);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }
                    if (i == 10) {
                        mItemChildOfChild = mContext.getResources().getStringArray(R.array.items_array_expandable_level_one11);
                        listChild = Arrays.asList(mItemChildOfChild);
                        mListData_ThirdLevel_Map.put(stringList.get(i), listChild);
                    }

                }
            }
        }
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        final CustomExpListView secondLevelExpListView = new CustomExpListView(this.mContext);
        String parentNode = (String) getGroup(groupPosition);
        secondLevelExpListView.setAdapter(new SecondLevelAdapter(this.mContext, mListData_SecondLevel_Map.get(parentNode), mListData_ThirdLevel_Map));
        secondLevelExpListView.setGroupIndicator(null);
//        secondLevelExpListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
//            int previousGroup = -1;
//            @Override
//            public void onGroupExpand(int groupPosition) {
//                if (groupPosition != previousGroup)
//                    secondLevelExpListView.collapseGroup(previousGroup);
//                previousGroup = groupPosition;
//            }
//        });
        secondLevelExpListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                if (flag != -1
                        && groupPosition != flag) {
                    secondLevelExpListView.collapseGroup(flag);
                }
                flag = groupPosition;

            }
        });
        return secondLevelExpListView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.mListDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this.mListDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.drawer_list_group, parent, false);
        }
        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        //lblListHeader.setTextColor(Color.BLUE);
       lblListHeader.setTextSize(26);
        lblListHeader.setText(headerTitle);
        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
