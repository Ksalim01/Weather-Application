package google.codelabs.weatherapplication.network.forecast

import com.squareup.moshi.JsonDataException
import com.squareup.moshi.JsonEncodingException
import google.codelabs.weatherapplication.network.exceptions.AppException
import google.codelabs.weatherapplication.network.exceptions.ConnectionException
import retrofit2.HttpException
import java.io.IOException

open class BaseRetrofitService {

    /**
     * Map network exceptions.
     * @throws ConnectionException
     */
    suspend fun <T> wrapRetrofitExceptions(block: suspend () -> T): T {
        return try {
            block()
        } catch (e: AppException) {
            throw e
            // moshi
        } catch (e: IOException) {
            throw ConnectionException(e)
        }
    }
}