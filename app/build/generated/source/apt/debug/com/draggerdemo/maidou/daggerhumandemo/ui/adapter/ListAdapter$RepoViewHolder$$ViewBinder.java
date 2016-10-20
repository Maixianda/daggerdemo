// Generated code from Butter Knife. Do not modify!
package com.draggerdemo.maidou.daggerhumandemo.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ListAdapter$RepoViewHolder$$ViewBinder<T extends com.draggerdemo.maidou.daggerhumandemo.ui.adapter.ListAdapter.RepoViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492986, "field 'mIvRepoName'");
    target.mIvRepoName = finder.castView(view, 2131492986, "field 'mIvRepoName'");
    view = finder.findRequiredView(source, 2131492987, "field 'mIvRepoDetail'");
    target.mIvRepoDetail = finder.castView(view, 2131492987, "field 'mIvRepoDetail'");
  }

  @Override public void unbind(T target) {
    target.mIvRepoName = null;
    target.mIvRepoDetail = null;
  }
}
