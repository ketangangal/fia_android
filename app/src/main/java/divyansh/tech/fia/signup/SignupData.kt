package divyansh.tech.fia.signup

import com.google.gson.annotations.SerializedName

data class SignupData(
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("confirm_password")
    val confirm_password: String,
    @SerializedName("phonenumber")
    val phonenumber: String
)
