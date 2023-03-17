package ru.mirea.kucheras.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.app.TimePickerDialog;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    public Dialog onCreateDialog(Bundle savedInstanceState){
        return new ProgressDialog(getActivity());
    }
}
