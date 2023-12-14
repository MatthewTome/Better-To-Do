// Generated by view binder compiler. Do not edit!
package com.example.betterto_do.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.betterto_do.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView bugsButton;

  @NonNull
  public final TextView privacyButton;

  @NonNull
  public final TextView settingsButton;

  @NonNull
  public final TextView translateButton;

  private FragmentDialogBinding(@NonNull LinearLayout rootView, @NonNull TextView bugsButton,
      @NonNull TextView privacyButton, @NonNull TextView settingsButton,
      @NonNull TextView translateButton) {
    this.rootView = rootView;
    this.bugsButton = bugsButton;
    this.privacyButton = privacyButton;
    this.settingsButton = settingsButton;
    this.translateButton = translateButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bugs_button;
      TextView bugsButton = ViewBindings.findChildViewById(rootView, id);
      if (bugsButton == null) {
        break missingId;
      }

      id = R.id.privacy_button;
      TextView privacyButton = ViewBindings.findChildViewById(rootView, id);
      if (privacyButton == null) {
        break missingId;
      }

      id = R.id.settings_button;
      TextView settingsButton = ViewBindings.findChildViewById(rootView, id);
      if (settingsButton == null) {
        break missingId;
      }

      id = R.id.translate_button;
      TextView translateButton = ViewBindings.findChildViewById(rootView, id);
      if (translateButton == null) {
        break missingId;
      }

      return new FragmentDialogBinding((LinearLayout) rootView, bugsButton, privacyButton,
          settingsButton, translateButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}