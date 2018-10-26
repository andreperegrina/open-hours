package com.andreperegrina.openhours;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.StyleableRes;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class OpenHours extends LinearLayout {

    @StyleableRes
    int index0 = 0;
    @StyleableRes
    int index1 = 1;
    @StyleableRes
    int index2 = 2;
    @StyleableRes
    int index3 = 3;
    @StyleableRes
    int index4 = 4;
    @StyleableRes
    int index5 = 5;
    @StyleableRes
    int index6 = 6;
    @StyleableRes
    int index7 = 7;
    @StyleableRes
    int index8 = 8;
    @StyleableRes
    int index9 = 9;
    @StyleableRes
    int index10 = 10;
    @StyleableRes
    int index11 = 11;
    @StyleableRes
    int index12 = 12;
    @StyleableRes
    int index13 = 13;
    @StyleableRes
    int index14 = 14;


    TextView openHoursCurrentHour;
    TextView openHoursMondayLabel;
    TextView openHoursMondayValue;
    TextView openHoursTuesdayLabel;
    TextView openHoursTuesdayValue;
    TextView openHoursWednesdayLabel;
    TextView openHoursWednesdayValue;
    TextView openHoursThursdayLabel;
    TextView openHoursThursdayValue;
    TextView openHoursFridayLabel;
    TextView openHoursFridayValue;
    TextView openHoursSaturdayLabel;
    TextView openHoursSaturdayValue;
    TextView openHoursSundayLabel;
    TextView openHoursSundayValue;

    ImageView myTextViewArrowSales;
    LinearLayout openHours;

    ArrayList<BusinessHour> businessHourArrayList;


    public OpenHours(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        inflate(context, R.layout.open_hours, this);

        int[] sets = {R.attr.openHoursCurrentHour, R.attr.openHoursMondayLabel, R.attr.openHoursMondayValue, R.attr.openHoursTuesdayLabel, R.attr.openHoursTuesdayValue, R.attr.openHoursWednesdayLabel, R.attr.openHoursWednesdayValue, R.attr.openHoursThursdayLabel, R.attr.openHoursThursdayValue, R.attr.openHoursFridayLabel, R.attr.openHoursFridayValue, R.attr.openHoursSaturdayLabel, R.attr.openHoursSaturdayValue, R.attr.openHoursSundayLabel, R.attr.openHoursSundayValue};
        TypedArray typedArray = context.obtainStyledAttributes(attrs, sets);

        CharSequence openHoursCurrentHour = typedArray.getText(index0);
        CharSequence openHoursMondayLabel = typedArray.getText(index1);
        CharSequence openHoursMondayValue = typedArray.getText(index2);
        CharSequence openHoursTuesdayLabel = typedArray.getText(index3);
        CharSequence openHoursTuesdayValue = typedArray.getText(index4);
        CharSequence openHoursWednesdayLabel = typedArray.getText(index5);
        CharSequence openHoursWednesdayValue = typedArray.getText(index6);
        CharSequence openHoursThursdayLabel = typedArray.getText(index7);
        CharSequence openHoursThursdayValue = typedArray.getText(index8);
        CharSequence openHoursFridayLabel = typedArray.getText(index9);
        CharSequence openHoursFridayValue = typedArray.getText(index10);
        CharSequence openHoursSaturdayLabel = typedArray.getText(index11);
        CharSequence openHoursSaturdayValue = typedArray.getText(index12);
        CharSequence openHoursSundayLabel = typedArray.getText(index13);
        CharSequence openHoursSundayValue = typedArray.getText(index14);
        typedArray.recycle();

        initComponents();

        if (openHoursCurrentHour != null) setOpenHoursCurrentHour(openHoursCurrentHour);
        if (openHoursMondayLabel != null) setOpenHoursMondayLabel(openHoursMondayLabel);
        if (openHoursMondayValue != null) setOpenHoursMondayValue(openHoursMondayValue);
        if (openHoursTuesdayLabel != null) setOpenHoursTuesdayLabel(openHoursTuesdayLabel);
        if (openHoursTuesdayValue != null) setOpenHoursTuesdayValue(openHoursTuesdayValue);
        if (openHoursWednesdayLabel != null) setOpenHoursWednesdayLabel(openHoursWednesdayLabel);
        if (openHoursWednesdayValue != null) setOpenHoursWednesdayValue(openHoursWednesdayValue);
        if (openHoursThursdayLabel != null) setOpenHoursThursdayLabel(openHoursThursdayLabel);
        if (openHoursThursdayValue != null) setOpenHoursThursdayValue(openHoursThursdayValue);
        if (openHoursFridayLabel != null) setOpenHoursFridayLabel(openHoursFridayLabel);
        if (openHoursFridayValue != null) setOpenHoursFridayValue(openHoursFridayValue);
        if (openHoursSaturdayLabel != null) setOpenHoursSaturdayLabel(openHoursSaturdayLabel);
        if (openHoursSaturdayValue != null) setOpenHoursSaturdayValue(openHoursSaturdayValue);
        if (openHoursSundayLabel != null) setOpenHoursSundayLabel(openHoursSundayLabel);
        if (openHoursSundayValue != null) setOpenHoursSundayValue(openHoursSundayValue);


    }

    private void initComponents() {

        openHoursCurrentHour = findViewById(R.id.open_hours_current_hour);
        openHoursMondayLabel = findViewById(R.id.open_hours_monday_label);
        openHoursMondayValue = findViewById(R.id.open_hours_monday_value);
        openHoursTuesdayLabel = findViewById(R.id.open_hours_tuesday_label);
        openHoursTuesdayValue = findViewById(R.id.open_hours_tuesday_value);
        openHoursWednesdayLabel = findViewById(R.id.open_hours_wednesday_label);
        openHoursWednesdayValue = findViewById(R.id.open_hours_wednesday_value);
        openHoursThursdayLabel = findViewById(R.id.open_hours_thursday_label);
        openHoursThursdayValue = findViewById(R.id.open_hours_thursday_value);
        openHoursFridayLabel = findViewById(R.id.open_hours_friday_label);
        openHoursFridayValue = findViewById(R.id.open_hours_friday_value);
        openHoursSaturdayLabel = findViewById(R.id.open_hours_saturday_label);
        openHoursSaturdayValue = findViewById(R.id.open_hours_saturday_value);
        openHoursSundayLabel = findViewById(R.id.open_hours_sunday_label);
        openHoursSundayValue = findViewById(R.id.open_hours_sunday_value);
        myTextViewArrowSales = findViewById(R.id.open_hours_image_view_arrow);
        openHours = findViewById(R.id.open_hours);

    }

    public void initBusinessHour(ArrayList<BusinessHour> businessHourArrayList) {
        this.businessHourArrayList = businessHourArrayList;


        Calendar currentTime = Calendar.getInstance();
        int textColor = 0;
        if (businessHourArrayList != null) {
            BusinessHour dayOfWeekHour = businessHourArrayList.get(currentTime.get(Calendar.DAY_OF_WEEK));

            SimpleDateFormat format1 = new SimpleDateFormat("hh:mm a");
            SimpleDateFormat formatDebug = new SimpleDateFormat("dd/MM/yyyy hh:mm a");

            Calendar start = dayOfWeekHour.getStartTime();
            Calendar end = dayOfWeekHour.getEndTime();

            Log.d("OPEN_HOURS", "currentTime: " + formatDebug.format(currentTime.getTime()));
            Log.d("OPEN_HOURS", "startTime: " + formatDebug.format(start.getTime()));
            Log.d("OPEN_HOURS", "endTime: " + formatDebug.format(end.getTime()));

            String formattedTime = "";
            String text = "";

            switch (dayOfWeekHour.theBusinessIs(currentTime)) {
                case NOT_OPEN_YET:
                    formattedTime = format1.format(start.getTime());
                    text = getContext().getString(R.string.opens_at);
                    textColor = ResourcesCompat.getColor(getResources(), R.color.opens_at, null);
                    Log.d("OPEN_HOURS", String.format("Before: %s - %s - %s", format1.format(start.getTime()), format1.format(currentTime.getTime()), format1.format(end.getTime())));
                    break;
                case OPEN:
                    formattedTime = format1.format(end.getTime());
                    text = getContext().getString(R.string.open_until);
                    textColor = ResourcesCompat.getColor(getResources(), R.color.open_until, null);
                    Log.d("OPEN_HOURS", String.format("Middle: %s - %s - %s", format1.format(start.getTime()), format1.format(currentTime.getTime()), format1.format(end.getTime())));
                    break;
                case CLOSED:
                    formattedTime = format1.format(end.getTime());
                    text = getContext().getString(R.string.closed_since);
                    textColor = ResourcesCompat.getColor(getResources(), R.color.closed_since, null);
                    Log.d("OPEN_HOURS", String.format("After: %s - %s - %s", format1.format(start.getTime()), format1.format(currentTime.getTime()), format1.format(end.getTime())));
                    break;
            }
            openHoursCurrentHour.setText(String.format(text, formattedTime));
            openHoursCurrentHour.setTextColor(textColor);

            Log.d("OPEN_HOURS", "--------------------");
            BusinessHour openHoursMexcaliMonday = businessHourArrayList.get(Calendar.MONDAY);
            BusinessHour openHoursMexcaliTuesday = businessHourArrayList.get(Calendar.TUESDAY);
            BusinessHour openHoursMexcaliWednesday = businessHourArrayList.get(Calendar.WEDNESDAY);
            BusinessHour openHoursMexcaliThursday = businessHourArrayList.get(Calendar.THURSDAY);
            BusinessHour openHoursMexcaliFriday = businessHourArrayList.get(Calendar.FRIDAY);
            BusinessHour openHoursMexcaliSaturday = businessHourArrayList.get(Calendar.SATURDAY);
            BusinessHour openHoursMexcaliSunday = businessHourArrayList.get(Calendar.SUNDAY);
            openHoursMondayValue.setText(String.format("%s-%s", format1.format(openHoursMexcaliMonday.getStartTime().getTime()), format1.format(openHoursMexcaliMonday.getEndTime().getTime())));
            openHoursTuesdayValue.setText(String.format("%s-%s", format1.format(openHoursMexcaliTuesday.getStartTime().getTime()), format1.format(openHoursMexcaliTuesday.getEndTime().getTime())));
            openHoursWednesdayValue.setText(String.format("%s-%s", format1.format(openHoursMexcaliWednesday.getStartTime().getTime()), format1.format(openHoursMexcaliWednesday.getEndTime().getTime())));
            openHoursThursdayValue.setText(String.format("%s-%s", format1.format(openHoursMexcaliThursday.getStartTime().getTime()), format1.format(openHoursMexcaliThursday.getEndTime().getTime())));
            openHoursFridayValue.setText(String.format("%s-%s", format1.format(openHoursMexcaliFriday.getStartTime().getTime()), format1.format(openHoursMexcaliFriday.getEndTime().getTime())));
            openHoursSaturdayValue.setText(String.format("%s-%s", format1.format(openHoursMexcaliSaturday.getStartTime().getTime()), format1.format(openHoursMexcaliSaturday.getEndTime().getTime())));
            openHoursSundayValue.setText(String.format("%s-%s", format1.format(openHoursMexcaliSunday.getStartTime().getTime()), format1.format(openHoursMexcaliSunday.getEndTime().getTime())));
        }

        switch (currentTime.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                setFocusDay(openHoursSundayValue,openHoursSundayValue);
                break;
            case 2:
                setFocusDay(openHoursMondayValue,openHoursMondayLabel);
                break;
            case 3:
                setFocusDay(openHoursTuesdayValue,openHoursTuesdayLabel);
                break;
            case 4:
                setFocusDay(openHoursWednesdayValue,openHoursWednesdayLabel);
                break;
            case 5:
                setFocusDay(openHoursThursdayValue,openHoursThursdayLabel);
                break;
            case 6:
                setFocusDay(openHoursFridayValue,openHoursFridayLabel);
                break;
            case 7:
                setFocusDay(openHoursSaturdayValue,openHoursSaturdayLabel);
                break;
        }
    }

    public void setFocusDay(TextView textViewValue, TextView textViewLabel) {
        textViewValue.setTypeface(textViewValue.getTypeface(), Typeface.BOLD);
        textViewLabel.setTypeface(textViewLabel.getTypeface(), Typeface.BOLD);
    }


    public String isPlace(Calendar currentTime, Calendar start, Calendar end) {
        if (currentTime.before(start))
            return "NOT_OPEN_YET";
        if (currentTime.after(end))
            return "CLOSED";
        return "OPEN";
    }

    public void toggleOpenHours() {
        openHours.setVisibility((openHours.getVisibility() == View.VISIBLE) ? View.GONE : View.VISIBLE);
        openHoursCurrentHour.setVisibility((openHoursCurrentHour.getVisibility() == View.VISIBLE) ? View.GONE : View.VISIBLE);
        myTextViewArrowSales.setVisibility((myTextViewArrowSales.getVisibility() == View.VISIBLE) ? View.GONE : View.VISIBLE);
    }


    public CharSequence getOpenHoursCurrentHour() {
        return openHoursCurrentHour.getText();
    }

    public CharSequence getOpenHoursMondayLabel() {
        return openHoursMondayLabel.getText();
    }

    public CharSequence getOpenHoursMondayValue() {
        return openHoursMondayValue.getText();
    }

    public CharSequence getOpenHoursTuesdayLabel() {
        return openHoursTuesdayLabel.getText();
    }

    public CharSequence getOpenHoursTuesdayValue() {
        return openHoursTuesdayValue.getText();
    }

    public CharSequence getOpenHoursWednesdayLabel() {
        return openHoursWednesdayLabel.getText();
    }

    public CharSequence getOpenHoursWednesdayValue() {
        return openHoursWednesdayValue.getText();
    }

    public CharSequence getOpenHoursThursdayLabel() {
        return openHoursThursdayLabel.getText();
    }

    public CharSequence getOpenHoursThursdayValue() {
        return openHoursThursdayValue.getText();
    }

    public CharSequence getOpenHoursFridayLabel() {
        return openHoursFridayLabel.getText();
    }

    public CharSequence getOpenHoursFridayValue() {
        return openHoursFridayValue.getText();
    }

    public CharSequence getOpenHoursSaturdayLabel() {
        return openHoursSaturdayLabel.getText();
    }

    public CharSequence getOpenHoursSaturdayValue() {
        return openHoursSaturdayValue.getText();
    }

    public CharSequence getOpenHoursSundayLabel() {
        return openHoursSundayLabel.getText();
    }

    public CharSequence getOpenHoursSundayValue() {
        return openHoursSundayValue.getText();
    }

    public void setOpenHoursCurrentHour(CharSequence value) {
        openHoursCurrentHour.setText(value);
    }

    public void setOpenHoursMondayLabel(CharSequence value) {
        openHoursMondayLabel.setText(value);
    }

    public void setOpenHoursMondayValue(CharSequence value) {
        openHoursMondayValue.setText(value);
    }

    public void setOpenHoursTuesdayLabel(CharSequence value) {
        openHoursTuesdayLabel.setText(value);
    }

    public void setOpenHoursTuesdayValue(CharSequence value) {
        openHoursTuesdayValue.setText(value);
    }

    public void setOpenHoursWednesdayLabel(CharSequence value) {
        openHoursWednesdayLabel.setText(value);
    }

    public void setOpenHoursWednesdayValue(CharSequence value) {
        openHoursWednesdayValue.setText(value);
    }

    public void setOpenHoursThursdayLabel(CharSequence value) {
        openHoursThursdayLabel.setText(value);
    }

    public void setOpenHoursThursdayValue(CharSequence value) {
        openHoursThursdayValue.setText(value);
    }

    public void setOpenHoursFridayLabel(CharSequence value) {
        openHoursFridayLabel.setText(value);
    }

    public void setOpenHoursFridayValue(CharSequence value) {
        openHoursFridayValue.setText(value);
    }

    public void setOpenHoursSaturdayLabel(CharSequence value) {
        openHoursSaturdayLabel.setText(value);
    }

    public void setOpenHoursSaturdayValue(CharSequence value) {
        openHoursSaturdayValue.setText(value);
    }

    public void setOpenHoursSundayLabel(CharSequence value) {
        openHoursSundayLabel.setText(value);
    }

    public void setOpenHoursSundayValue(CharSequence value) {
        openHoursSundayValue.setText(value);
    }


}