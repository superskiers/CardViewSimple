package com.example.superskiers.cardviewsimple;

public class CrossPolo {

    String mTextViewAngle, mTextViewDescription;
    int mImageCar;

    public String getTextAngle() {
        return mTextViewAngle;
    }

    public void setmTextViewAngle(String textViewAngle) {
        this.mTextViewAngle = textViewAngle;
    }

    public String getmTextViewDescription() {
        return mTextViewDescription;
    }

    public void setmTextViewDescription(String textViewDescription) {
        this.mTextViewDescription = textViewDescription;
    }

    public int getImage() {
        return mImageCar;
    }

    public void setImage(int mImageCar) {
        this.mImageCar = mImageCar;
    }

    public CrossPolo(String textAngle, String textDescription, int image) {
        this.mTextViewAngle = textAngle;
        this.mTextViewDescription = textDescription;
        this.mImageCar = image;
    }
}