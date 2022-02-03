package divyansh.tech.fia.signup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignupViewModel @Inject constructor(
    private val repo: SignupRepo
): ViewModel() {

    fun signUpData(body: SignupData) = viewModelScope.launch(Dispatchers.IO) {
        val response = repo.postData(body)
    }
}