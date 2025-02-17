sealed class NetworkResponse<T> {
    class Success<T>(val data: T) : NetworkResponse<T>()
    class Error<T>(val message: String) : NetworkResponse<T>()
    class Loading<T> : NetworkResponse<T>()
}

fun <T> handleResponse(response: NetworkResponse<T>) {
    when (response) {
        is NetworkResponse.Success -> println("Data received: ${response.data}")
        is NetworkResponse.Error -> println("Error: ${response.message}")
        is NetworkResponse.Loading -> println("Loading...")
    }
}

fun main() {
    val successResponse = NetworkResponse.Success("User data loaded")
    val errorResponse: NetworkResponse<String> = NetworkResponse.Error("Network failure")
    val loadingResponse = NetworkResponse.Loading<String>()

    handleResponse(successResponse)
    handleResponse(errorResponse)
    handleResponse(loadingResponse)
}
