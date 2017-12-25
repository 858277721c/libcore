package com.fanwe.demo.model;

import com.fanwe.lib.utils.FIterateUtil;
import com.fanwe.library.common.SDSelectManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/14.
 */

public class DataModel implements SDSelectManager.Selectable
{

    private String name;

    //add
    private boolean selected;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static List<DataModel> getListModel(int count)
    {
        final List<DataModel> listModel = new ArrayList<>();
        FIterateUtil.foreach(count, new FIterateUtil.SimpleIterateCallback()
        {
            @Override
            public boolean next(int i)
            {
                DataModel model = new DataModel();
                model.setName(String.valueOf(i));
                listModel.add(model);
                return false;
            }
        });

        return listModel;
    }

    @Override
    public boolean isSelected()
    {
        return selected;
    }

    @Override
    public void setSelected(boolean selected)
    {
        this.selected = selected;
    }
}
