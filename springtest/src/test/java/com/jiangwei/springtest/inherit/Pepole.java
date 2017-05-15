package com.jiangwei.springtest.inherit;

/**
 * Created by Franco on 2017/5/14.
 */
public abstract class Pepole {
    /**
     * 人都有腿
     */
    public final static int LEGS_NUM = 2;

    public abstract void talk(Pepole pepole);

    public abstract void skinColor(Pepole pepole);


    public void talkUserLangues() {
        talk(this);
    }

    public void showSkinColor() {
        skinColor(this);
    }


}
