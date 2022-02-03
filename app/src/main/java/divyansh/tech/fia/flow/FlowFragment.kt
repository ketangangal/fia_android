package divyansh.tech.fia.flow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import divyansh.tech.fia.R
import divyansh.tech.fia.databinding.FragmentFlowBinding

@AndroidEntryPoint
class FlowFragment: Fragment() {
    private lateinit var binding: FragmentFlowBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFlowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        binding.loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_flowFragment_to_loginFragment)
        }
        binding.signupButton.setOnClickListener {
            findNavController().navigate(R.id.action_flowFragment_to_signupFragment)
        }
    }
}