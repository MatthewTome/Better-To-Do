// Generated by view binder compiler. Do not edit!
package com.example.betterto_do.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.betterto_do.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEditBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button cancelbtn;

  @NonNull
  public final TextInputLayout descriptionTextField;

  @NonNull
  public final TextInputEditText descriptionTextInput;

  @NonNull
  public final ConstraintLayout edittasklayout;

  @NonNull
  public final TextView edittitle;

  @NonNull
  public final ImageButton notificationButton;

  @NonNull
  public final ImageView priorityIndicator;

  @NonNull
  public final TextView prioritySelect;

  @NonNull
  public final TextView priorityTitle;

  @NonNull
  public final Button savebtn;

  @NonNull
  public final TextView taskDate;

  @NonNull
  public final TextView taskDateTitle;

  @NonNull
  public final TextInputLayout titleTextField;

  @NonNull
  public final TextInputEditText titleTextInput;

  private FragmentEditBinding(@NonNull ConstraintLayout rootView, @NonNull Button cancelbtn,
      @NonNull TextInputLayout descriptionTextField,
      @NonNull TextInputEditText descriptionTextInput, @NonNull ConstraintLayout edittasklayout,
      @NonNull TextView edittitle, @NonNull ImageButton notificationButton,
      @NonNull ImageView priorityIndicator, @NonNull TextView prioritySelect,
      @NonNull TextView priorityTitle, @NonNull Button savebtn, @NonNull TextView taskDate,
      @NonNull TextView taskDateTitle, @NonNull TextInputLayout titleTextField,
      @NonNull TextInputEditText titleTextInput) {
    this.rootView = rootView;
    this.cancelbtn = cancelbtn;
    this.descriptionTextField = descriptionTextField;
    this.descriptionTextInput = descriptionTextInput;
    this.edittasklayout = edittasklayout;
    this.edittitle = edittitle;
    this.notificationButton = notificationButton;
    this.priorityIndicator = priorityIndicator;
    this.prioritySelect = prioritySelect;
    this.priorityTitle = priorityTitle;
    this.savebtn = savebtn;
    this.taskDate = taskDate;
    this.taskDateTitle = taskDateTitle;
    this.titleTextField = titleTextField;
    this.titleTextInput = titleTextInput;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancelbtn;
      Button cancelbtn = ViewBindings.findChildViewById(rootView, id);
      if (cancelbtn == null) {
        break missingId;
      }

      id = R.id.descriptionTextField;
      TextInputLayout descriptionTextField = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTextField == null) {
        break missingId;
      }

      id = R.id.descriptionTextInput;
      TextInputEditText descriptionTextInput = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTextInput == null) {
        break missingId;
      }

      ConstraintLayout edittasklayout = (ConstraintLayout) rootView;

      id = R.id.edittitle;
      TextView edittitle = ViewBindings.findChildViewById(rootView, id);
      if (edittitle == null) {
        break missingId;
      }

      id = R.id.notificationButton;
      ImageButton notificationButton = ViewBindings.findChildViewById(rootView, id);
      if (notificationButton == null) {
        break missingId;
      }

      id = R.id.priorityIndicator;
      ImageView priorityIndicator = ViewBindings.findChildViewById(rootView, id);
      if (priorityIndicator == null) {
        break missingId;
      }

      id = R.id.prioritySelect;
      TextView prioritySelect = ViewBindings.findChildViewById(rootView, id);
      if (prioritySelect == null) {
        break missingId;
      }

      id = R.id.priorityTitle;
      TextView priorityTitle = ViewBindings.findChildViewById(rootView, id);
      if (priorityTitle == null) {
        break missingId;
      }

      id = R.id.savebtn;
      Button savebtn = ViewBindings.findChildViewById(rootView, id);
      if (savebtn == null) {
        break missingId;
      }

      id = R.id.taskDate;
      TextView taskDate = ViewBindings.findChildViewById(rootView, id);
      if (taskDate == null) {
        break missingId;
      }

      id = R.id.taskDateTitle;
      TextView taskDateTitle = ViewBindings.findChildViewById(rootView, id);
      if (taskDateTitle == null) {
        break missingId;
      }

      id = R.id.titleTextField;
      TextInputLayout titleTextField = ViewBindings.findChildViewById(rootView, id);
      if (titleTextField == null) {
        break missingId;
      }

      id = R.id.titleTextInput;
      TextInputEditText titleTextInput = ViewBindings.findChildViewById(rootView, id);
      if (titleTextInput == null) {
        break missingId;
      }

      return new FragmentEditBinding((ConstraintLayout) rootView, cancelbtn, descriptionTextField,
          descriptionTextInput, edittasklayout, edittitle, notificationButton, priorityIndicator,
          prioritySelect, priorityTitle, savebtn, taskDate, taskDateTitle, titleTextField,
          titleTextInput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}