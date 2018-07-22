package com.example.adam_yeh.custom.recyclerview;

import android.graphics.Color;
import android.text.TextUtils;

/**
 * RecyclerView資料物件
 *
 * @author adam_yeh
 * @date 7/16/18
 */
public class RecyclerViewVO {

    private int viewType;
    private int imgId;
    private int color;
    private String title;
    private String genre;
    private String year;
    private String imgName;
    private String colorName;

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getGenre () {
        return genre;
    }

    public void setGenre (String genre) {
        this.genre = genre;
    }

    public String getYear () {
        return year;
    }

    public void setYear (String year) {
        this.year = year;
    }

    public String getImgName () {
        return imgName;
    }

    public void setImgName (String imgName) {
        this.imgName = imgName;
    }

    public int getViewType () {
        return viewType;
    }

    public void setViewType (int viewType) {
        this.viewType = viewType;
    }

    public int getImgId () {
        return imgId;
    }

    public String getColorName () {
        return colorName;
    }

    public void setColorName (String colorName) {
        this.colorName = colorName;
    }

    public int getColor () {
        return color;
    }

    public void setColor (String color) {
        if (TextUtils.equals(color, Colors.RED.getName())) {
            this.color = Colors.RED.getDigit();
        } else if (TextUtils.equals(color, Colors.BLUE.getName())) {
            this.color = Colors.BLUE.getDigit();
        } else if (TextUtils.equals(color, Colors.CYAN.getName())) {
            this.color = Colors.CYAN.getDigit();
        } else if (TextUtils.equals(color, Colors.DKGRAY.getName())) {
            this.color = Colors.DKGRAY.getDigit();
        } else if (TextUtils.equals(color, Colors.GREEN.getName())) {
            this.color = Colors.GREEN.getDigit();
        } else if (TextUtils.equals(color, Colors.LTGRAY.getName())) {
            this.color = Colors.LTGRAY.getDigit();
        }
    }

    public void setImgId (String imgName) {
        if (TextUtils.equals(imgName, Imgs.PIC_0.getId())) {
            this.imgId = R.drawable.download_0;
        } else if (TextUtils.equals(imgName, Imgs.PIC_1.getId())) {
            this.imgId = R.drawable.download_1;
        } else if (TextUtils.equals(imgName, Imgs.PIC_2.getId())) {
            this.imgId = R.drawable.download_2;
        } else if (TextUtils.equals(imgName, Imgs.PIC_3.getId())) {
            this.imgId = R.drawable.download_3;
        } else if (TextUtils.equals(imgName, Imgs.PIC_4.getId())) {
            this.imgId = R.drawable.download_4;
        } else if (TextUtils.equals(imgName, Imgs.PIC_5.getId())) {
            this.imgId = R.drawable.download_5;
        } else if (TextUtils.equals(imgName, Imgs.PIC_6.getId())) {
            this.imgId = R.drawable.download_6;
        } else if (TextUtils.equals(imgName, Imgs.PIC_7.getId())) {
            this.imgId = R.drawable.download_7;
        } else if (TextUtils.equals(imgName, Imgs.PIC_8.getId())) {
            this.imgId = R.drawable.download_8;
        } else if (TextUtils.equals(imgName, Imgs.PIC_9.getId())) {
            this.imgId = R.drawable.download_9;
        }
    }

    private enum Imgs {

        PIC_0("download_0"),
        PIC_1("download_1"),
        PIC_2("download_2"),
        PIC_3("download_3"),
        PIC_4("download_4"),
        PIC_5("download_5"),
        PIC_6("download_6"),
        PIC_7("download_7"),
        PIC_8("download_8"),
        PIC_9("download_9");

        private String id;

        Imgs (String id) {
            this.id = id;
        }

        public String getId () {
            return id;
        }

    }

    private enum Colors {

        RED("RED", Color.RED),
        BLUE("BLUE", Color.BLUE),
        CYAN("CYAN", Color.CYAN),
        DKGRAY("DKGRAY", Color.DKGRAY),
        GREEN("GREEN", Color.GREEN),
        LTGRAY("LTGRAY", Color.LTGRAY);

        private String name;
        private int digit;

        Colors (String name, int digit) {
            this.name = name;
            this.digit = digit;
        }

        public String getName () {
            return name;
        }
        public int getDigit () {return digit;}

    }

}
