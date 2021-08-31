public class InitPayment {

    public async void initPayment(){

        string API_KEY = "12912847765bc0db748fdd44.40081707"; 
        
        string SITE_ID = "445160";
        
        string URL = "https://new-api.cinetpay.ci/v2/payment";

        var payment = new 
        {
            amount = "100",
            apikey = API_KEY,
            site_id = SITE_ID,
            currency = "XOF",
            transaction_id = "123",
            description = "TRANSACTION DESCRIPTION",
            return_url = "https://www.exemple.com/return",
            notify_url = "https://www.exemple.com/notify",
            customer_name = "Dje Bi",
            customer_surname = "Jean-Marc"
        };

        string json = JsonConvert.SerializeObject(payment);

        StringContent data = new StringContent(json, Encoding.UTF8, "application/json");

        var client = new HttpClient();

        var response = await client.PostAsync(url, data);

        string result = await response.Content.ReadAsStringAsync();

        Console.WriteLine(result);

    }

}