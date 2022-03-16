package com.github.wuxudong.rncharts.charts;

import com.github.ElfenLiedGH.charting.components.AxisBase;
import com.github.ElfenLiedGH.charting.data.Entry;
import com.github.ElfenLiedGH.charting.formatter.IAxisValueFormatter;
import com.github.ElfenLiedGH.charting.formatter.IValueFormatter;
import com.github.ElfenLiedGH.charting.formatter.ValueFormatter;
import com.github.ElfenLiedGH.charting.utils.ViewPortHandler;

import java.text.DecimalFormat;

public class CustomFormatter extends ValueFormatter {

    private DecimalFormat mFormat;

    public CustomFormatter(String value) {
        mFormat = new DecimalFormat(value);
    }

    @Override
    public String getFormattedValue(float value) {
        return mFormat.format(value);
    }

}
