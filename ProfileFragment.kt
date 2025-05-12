package com.example.cashcompass.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.cashcompass.R
import com.example.cashcompass.login_page

class ProfileFragment : Fragment() {

    private lateinit var nameEdit: EditText
    private lateinit var passwordEdit: EditText
    private lateinit var saveBtn: Button
    private lateinit var logoutBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        nameEdit = view.findViewById(R.id.editName)
        passwordEdit = view.findViewById(R.id.editPassword)
        saveBtn = view.findViewById(R.id.btnSaveChanges)
        logoutBtn = view.findViewById(R.id.btnLogout)

        // Pre-fill with saved user data (can be extended to use SharedPreferences)
        nameEdit.setText("") // TODO: load real data
        passwordEdit.setText("")

        saveBtn.setOnClickListener {
            val newName = nameEdit.text.toString().trim()
            val newPassword = passwordEdit.text.toString().trim()

            if (newName.isEmpty() || newPassword.isEmpty()) {
                Toast.makeText(requireContext(), "Please fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // TODO: Save updated values to SharedPreferences or Firebase
            Toast.makeText(requireContext(), "Changes saved", Toast.LENGTH_SHORT).show()
        }

        logoutBtn.setOnClickListener {
            // TODO: Clear saved login session (SharedPreferences/FirebaseAuth)
            Toast.makeText(requireContext(), "Logged out", Toast.LENGTH_SHORT).show()
            val intent = Intent(requireActivity(), login_page::class.java)
            startActivity(intent)
            requireActivity().finish() // Close current activity
        }

        return view
    }
}
