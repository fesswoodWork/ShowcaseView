package com.github.amlcurran.showcaseview;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.github.amlcurran.showcaseview.targets.Target;

/**
 * Created by fesswood on 03.04.16.
 */
public class TipShowcaseView extends ShowcaseView {

    private View mTipView;

    protected TipShowcaseView(Context context, boolean newStyle) {
        super(context, newStyle);
    }

    protected TipShowcaseView(Context context, AttributeSet attrs, int defStyle, boolean newStyle) {
        super(context, attrs, defStyle, newStyle);
    }

    private void setTipView(View view) {
        mTipView = view;
        if (mTipView.getParent() == null) {
            RelativeLayout.LayoutParams lps = new RelativeLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            mTipView.setLayoutParams(lps);
            addView(mTipView);
        }
    }


    public static class TipBuilder extends Builder {

        private final TipShowcaseView showcaseView;

        public TipBuilder(Activity activity) {
            this(activity, false);
        }

        /**
         * @param useNewStyle should use "new style" showcase (see {@link #withNewStyleShowcase()}
         * @deprecated use {@link #withHoloShowcase()}, {@link #withNewStyleShowcase()}, or
         * {@link #setShowcaseDrawer(ShowcaseDrawer)}
         */
        @Deprecated
        public TipBuilder(Activity activity, boolean useNewStyle) {
            super(activity);
            this.showcaseView = new TipShowcaseView(activity, useNewStyle);
            this.showcaseView.setTarget(Target.NONE);
            setShowcaseView(showcaseView);
        }

        public TipBuilder setTipView(View tipView){
            showcaseView.setTipView(tipView);
            return this;
        }


        /**
         * Create the {@link com.github.amlcurran.showcaseview.ShowcaseView} and show it.
         *
         * @return the created ShowcaseView
         */
        public TipShowcaseView build() {
            return (TipShowcaseView) super.build();
        }

        /**
         * Draw a holo-style showcase. This is the default.<br/>
         * <img alt="Holo showcase example" src="../../../../../../../../example2.png" />
         */
        public TipBuilder withHoloShowcase() {
            return (TipBuilder) super.withHoloShowcase();
        }

        /**
         * Draw a new-style showcase.<br/>
         * <img alt="Holo showcase example" src="../../../../../../../../example.png" />
         */
        public TipBuilder withNewStyleShowcase() {
            return (TipBuilder) super.withNewStyleShowcase();
        }

        /**
         * Draw a material style showcase.
         * <img alt="Material showcase" src="../../../../../../../../material.png" />
         */
        public TipBuilder withMaterialShowcase() {
            return (TipBuilder) super.withMaterialShowcase();
        }

        /**
         * Set a custom showcase drawer which will be responsible for measuring and drawing the showcase
         */
        public TipBuilder setShowcaseDrawer(ShowcaseDrawer showcaseDrawer) {
            return (TipBuilder) super.setShowcaseDrawer(showcaseDrawer);
        }

        /**
         * rise IllegalStateException
         */
        @Deprecated
        public TipBuilder setContentTitle(int resId) {
            throw new IllegalStateException("can't user this method with this builder type");
        }

        /**
         * rise IllegalStateException
         */
        @Deprecated
        public TipBuilder setContentTitle(CharSequence title) {
            throw new IllegalStateException("can't user this method with this builder type");
        }

        /**
         * rise IllegalStateException
         */
        @Deprecated
        public TipBuilder setContentText(int resId) {
            throw new IllegalStateException("can't user this method with this builder type");
        }

        /**
         * rise IllegalStateException
         */
        @Deprecated
        public TipBuilder setContentText(CharSequence text) {
            throw new IllegalStateException("can't user this method with this builder type");
        }

        /**
         * Set the target of the showcase.
         *
         * @param target a {@link com.github.amlcurran.showcaseview.targets.Target} representing
         *               the item to showcase (e.g., a button, or action item).
         */
        public TipBuilder setTarget(Target target) {
            return (TipBuilder) super.setTarget(target);
        }

        /**
         * Set the style of the ShowcaseView. See the sample app for example styles.
         */
        public TipBuilder setStyle(int theme) {
            return (TipBuilder) super.setStyle(theme);
        }

        /**
         * Set a listener which will override the button clicks.
         * <p/>
         * Note that you will have to manually hide the ShowcaseView
         */
        public TipBuilder setOnClickListener(OnClickListener onClickListener) {
            return (TipBuilder) super.setOnClickListener(onClickListener);
        }

        /**
         * Don't make the ShowcaseView block touches on itself. This doesn't
         * block touches in the showcased area.
         * <p/>
         * By default, the ShowcaseView does block touches
         */
        public TipBuilder doNotBlockTouches() {
            return (TipBuilder) super.doNotBlockTouches();
        }

        /**
         * Make this ShowcaseView hide when the user touches outside the showcased area.
         * This enables {@link #doNotBlockTouches()} as well.
         * <p/>
         * By default, the ShowcaseView doesn't hide on touch.
         */
        public TipBuilder hideOnTouchOutside() {
            return (TipBuilder) super.hideOnTouchOutside();
        }

        /**
         * Set the ShowcaseView to only ever show once.
         *
         * @param shotId a unique identifier (<em>across the app</em>) to store
         *               whether this ShowcaseView has been shown.
         */
        public TipBuilder singleShot(long shotId) {
            return (TipBuilder) super.singleShot(shotId);
        }

        public TipBuilder setShowcaseEventListener(OnShowcaseEventListener showcaseEventListener) {
            return (TipBuilder) super.setShowcaseEventListener(showcaseEventListener);
        }

        public TipBuilder setParent(ViewGroup parent, int index) {
            return (TipBuilder) super.setParent(parent, index);
        }

        /**
         * rise IllegalStateException
         */
        @Deprecated
        public TipBuilder setContentTextPaint(TextPaint textPaint) {
            throw new IllegalStateException("can't user this method with this builder type");
        }

        /**
         * rise IllegalStateException
         */
        @Deprecated
        public TipBuilder setContentTitlePaint(TextPaint textPaint) {
            throw new IllegalStateException("can't user this method with this builder type");
        }

        /**
         * Replace the end button with the one provided. Note that this resets any OnClickListener provided
         * by {@link #setOnClickListener(OnClickListener)}, so call this method before that one.
         */
        public TipBuilder replaceEndButton(Button button) {
            return (TipBuilder) super.replaceEndButton(button);
        }

        /**
         * Replace the end button with the one provided. Note that this resets any OnClickListener provided
         * by {@link #setOnClickListener(OnClickListener)}, so call this method before that one.
         */
        public TipBuilder replaceEndButton(int buttonResourceId) {
            return (TipBuilder) super.replaceEndButton(buttonResourceId);
        }

        /**
         * Block any touch made on the ShowcaseView, even inside the showcase
         */
        public TipBuilder blockAllTouches() {
            return (TipBuilder) super.blockAllTouches();
        }

        /**
         * Uses the android decor view to insert a showcase, this is not recommended
         * as then UI elements in showcase view can hide behind the nav bar
         */
        public TipBuilder useDecorViewAsParent() {
            return (TipBuilder) super.useDecorViewAsParent();
        }


    }
}
