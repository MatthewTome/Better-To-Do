package com.example.betterto_do

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import java.util.*

// Constants for argument
private const val ARG_DATE = "date"

// DialogFragment for picking a date
class DatePickerFragment: DialogFragment() {

    // Callback interface for date selection
    interface Callbacks {
        fun onDateSelected(date: Date)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dateListener = DatePickerDialog.OnDateSetListener {
            _: DatePicker, year: Int, month: Int, day: Int ->

            val resultDate: Date = GregorianCalendar(year, month, day).time

            targetFragment?.let {fragment ->
                (fragment as Callbacks).onDateSelected(resultDate)
            }
        }



        val date = arguments?.getSerializable(ARG_DATE) as Date
        val calendar = Calendar.getInstance()
        calendar.time = date
        val initialYear = calendar.get(Calendar.YEAR)
        val initialMonth = calendar.get(Calendar.MONTH)
        val initialDay = calendar.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(
            requireContext(),
            dateListener,
            initialYear,
            initialMonth,
            initialDay
        )
    }

    // Static method to create a new instance of DatePickerFragment with arguments
    companion object {
        fun newInstance(date: Date): DatePickerFragment {
            val args = Bundle().apply{
                putSerializable(ARG_DATE, date)
            }

            return DatePickerFragment().apply{
                arguments = args
            }
        }
    }
}