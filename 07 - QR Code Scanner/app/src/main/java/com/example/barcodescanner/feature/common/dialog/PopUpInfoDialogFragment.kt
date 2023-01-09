package com.example.barcodescanner.feature.common.dialog

//import android.app.Activity
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
//import android.text.SpannableString
import android.view.LayoutInflater
//import android.widget.TextView
//import android.view.inputmethod.InputMethodManager
//import android.widget.EditText
import androidx.appcompat.app.AlertDialog
//import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import com.example.barcodescanner.R
//import kotlinx.android.synthetic.main.dialog_edit_barcode_name.view.*

class PopUpInfoDialogFragment : DialogFragment() {

    companion object {
        const val TAG = "PopUpDialog"
        private const val NAME_KEY = "NAME_KEY"

        fun newInstance(name: String?): PopUpInfoDialogFragment {
            return PopUpInfoDialogFragment().apply {
                arguments = Bundle().apply {
                    putString(NAME_KEY, name)
                }
            }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater
            .from(requireContext())
            .inflate(R.layout.dialog_pop_up_info, null)

        val dialog = AlertDialog.Builder(requireActivity())
            .setView(view)
            .create()
        return dialog
    }
}