// Generated code from Butter Knife. Do not modify!
package com.draggerdemo.maidou.daggerhumandemo.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ReposListActivity$$ViewBinder<T extends com.draggerdemo.maidou.daggerhumandemo.ui.activity.ReposListActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492974, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131492974, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131492975, "field 'pbLoading'");
    target.pbLoading = finder.castView(view, 2131492975, "field 'pbLoading'");
  }

  @Override public void unbind(T target) {
    target.mRvList = null;
    target.pbLoading = null;
  }
}
