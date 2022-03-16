package com.github.wuxudong.rncharts.charts;

import com.github.ElfenLiedGH.charting.formatter.IFillFormatter;
import com.github.ElfenLiedGH.charting.interfaces.dataprovider.LineDataProvider;
import com.github.ElfenLiedGH.charting.interfaces.datasets.ILineDataSet;

public class ConfigurableMinimumLinePositionFillFormatter implements IFillFormatter {
    private final float min;

    public ConfigurableMinimumLinePositionFillFormatter(float min) {

        this.min = min;
    }

    @Override
    public float getFillLinePosition(ILineDataSet dataSet, LineDataProvider dataProvider) {
        return min;
    }
}
