package net.swallowsnest.monrovia;

/**
 * Created by marshas on 10/8/16.
 */

public class Sight {
    /**
     * Name of the sight
     */
    private String mName;

    /**
     * Address of the sight
     */
    private String mAddress;

    /**
     * Image resource ID for the sight
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this sight
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Sight(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public Sight(String name, String address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    //Get name of the sight//
    public String getName() {
        return mName;
    }

    //Get address of the sight//
    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

