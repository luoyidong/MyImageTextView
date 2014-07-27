package com.kaniu.widget;

import android.R.integer;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

public class ImgTextView extends TextView {
	public ImgTextView(Context context) {
		this(context, null);
	}

	public ImgTextView(Context context, AttributeSet attr) {
		this(context, attr, android.R.attr.textViewStyle);
	}

	public ImgTextView(Context context, AttributeSet attr, int defStyle) {
		super(context, attr, defStyle);
	}

	private static class ImageTag {
		public static final int PADDING_VALUE = 2;

		private Context context;
		private Resources res;

		private Drawable mDrawable;
		private Rect mImageSize;

		private int mLeftPadding;
		private int mRightPadding;
		private int mTopPadding;
		private int mBottomPadding;

		public ImageTag(Context context) {
			this.context = context;
		}

		private void init() {
			res = context.getResources();
			mLeftPadding = PADDING_VALUE;
			mRightPadding = PADDING_VALUE;
			mTopPadding = PADDING_VALUE;
			mBottomPadding = PADDING_VALUE;
		}

		public void setDrawableById(int drawableId) {
			mDrawable = res.getDrawable(drawableId);
		}

		public void drawSelf(Canvas canvas) {
		}
	}
}
