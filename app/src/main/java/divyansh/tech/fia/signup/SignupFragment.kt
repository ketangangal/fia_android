package divyansh.tech.fia.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import divyansh.tech.fia.databinding.FragmentFlowBinding
import divyansh.tech.fia.databinding.FragmentSignupBinding
import kotlinx.android.synthetic.main.fragment_signup.*

@AndroidEntryPoint
class SignupFragment: Fragment() {
    private lateinit var binding: FragmentSignupBinding

    private val viewModel by viewModels<SignupViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        binding.signup.setOnClickListener {
            if (validate()) viewModel.signUpData(
                SignupData(
                    name = name.text.toString(),
                    email = email.text.toString(),
                    password = password.text.toString(),
                    confirm_password = confPassword.text.toString(),
                    phonenumber = phone.text.toString()
                )
            )
            else Toast.makeText(requireContext(), "FAILED", Toast.LENGTH_LONG).show()
        }
    }

    private fun validate(): Boolean {
        binding.apply {
            if (name.text.isNullOrEmpty()) return false
            if (email.text.isNullOrEmpty()) return false
            if (password.text.isNullOrEmpty()) return false
            if (confPassword.text.isNullOrEmpty()) return false
            if (phone.text.isNullOrEmpty()) return false
            if (password.text.toString() != confPassword.text.toString()) return false
            return true
        }
    }
}