package khamroev001.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import khamroev001.fragments.R
import khamroev001.fragments.databinding.FragmentPinCodeBinding

class PinCodeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPinCodeBinding.inflate(inflater, container, false)

        binding.okBtn.setOnClickListener {
            if (binding.editText.text.toString() == "5555") {
                parentFragmentManager.beginTransaction()
                    .addToBackStack("PinCodeFragment")
                    .add(R.id.main, AfterPinCodeFragment())
                    .commit()
            }
            else {
                Toast.makeText(requireContext(), "Password is incorrect", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }
}