// Generated code from Butter Knife. Do not modify!
package com.draggerdemo.maidou.daggerhumandemo.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.draggerdemo.maidou.daggerhumandemo.ui.activity.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492973, "method 'onShowRepositoriesClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onShowRepositoriesClick();
        }
      });
  }

  @Override public void unbind(T target) {
  }
}
