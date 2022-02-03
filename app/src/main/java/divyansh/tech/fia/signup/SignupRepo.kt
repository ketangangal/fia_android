package divyansh.tech.fia.signup

import android.util.Log
import okhttp3.Response
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.http.Body
import retrofit2.http.POST
import javax.inject.Inject

class SignupRepo @Inject constructor(
    retrofit: Retrofit
) {

    private val service = retrofit.create(SignupInterface::class.java)

    suspend fun postData(body: SignupData) {
        try {
            val response = service.postDetails(body)
            Log.e("SIGNUP-> ", response.string())
        } catch (e: Exception) {
            Log.e("ERROR -> ", e.message.toString())
        }
    }

    interface SignupInterface {
        @POST("/signup")
        suspend fun postDetails(
            @Body body: SignupData
        ): ResponseBody
    }
}