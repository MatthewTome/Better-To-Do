// Generated by view binder compiler. Do not edit!
package com.example.betterto_do.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.betterto_do.R;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TaskListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCheckBox taskCheckbox;

  @NonNull
  public final TextView taskDate;

  @NonNull
  public final ConstraintLayout taskItemLayout;

  @NonNull
  public final TextView taskPriority;

  @NonNull
  public final TextView taskTitle;

  private TaskListItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCheckBox taskCheckbox, @NonNull TextView taskDate,
      @NonNull ConstraintLayout taskItemLayout, @NonNull TextView taskPriority,
      @NonNull TextView taskTitle) {
    this.rootView = rootView;
    this.taskCheckbox = taskCheckbox;
    this.taskDate = taskDate;
    this.taskItemLayout = taskItemLayout;
    this.taskPriority = taskPriority;
    this.taskTitle = taskTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TaskListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TaskListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.task_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TaskListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.task_checkbox;
      MaterialCheckBox taskCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (taskCheckbox == null) {
        break missingId;
      }

      id = R.id.task_date;
      TextView taskDate = ViewBindings.findChildViewById(rootView, id);
      if (taskDate == null) {
        break missingId;
      }

      ConstraintLayout taskItemLayout = (ConstraintLayout) rootView;

      id = R.id.task_priority;
      TextView taskPriority = ViewBindings.findChildViewById(rootView, id);
      if (taskPriority == null) {
        break missingId;
      }

      id = R.id.task_title;
      TextView taskTitle = ViewBindings.findChildViewById(rootView, id);
      if (taskTitle == null) {
        break missingId;
      }

      return new TaskListItemBinding((ConstraintLayout) rootView, taskCheckbox, taskDate,
          taskItemLayout, taskPriority, taskTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
