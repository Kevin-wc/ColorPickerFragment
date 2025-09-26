package com.example.colorpicker;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;

public class colorsViewModel extends ViewModel {
    private MutableLiveData<LinkedList<String>> colorsLL;

    public colorsViewModel() {
        colorsLL = new MutableLiveData<>();
    }

    public void setColors(LinkedList<String> l){
        colorsLL.setValue(l);
    }

    public LinkedList<String> getColors(){
        return colorsLL.getValue();
    }

    public void addColor(String s){
        LinkedList<String> l = getColors();
        l.add(s);
        colorsLL.setValue(l);


    }




}
